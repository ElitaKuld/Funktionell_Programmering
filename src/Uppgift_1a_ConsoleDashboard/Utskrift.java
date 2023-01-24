package Uppgift_1a_ConsoleDashboard;

import java.io.IOException;
import java.util.List;

public class Utskrift extends Thread{
    Repository repository = new Repository();

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            try {
                Thread.sleep(2000);
                System.out.println("Antal barn: " + repository.getAntalBarn());

                System.out.println("Antal nissar: " + repository.getAntalNissar());

                List<String> namnPåNissar = repository.getNamnPåNissar();
                for (String namn : namnPåNissar){
                    System.out.println(namn);
                }

                System.out.println("Medelvärdet på snällhet: " + repository.getMedelvärdePåSnällhet(repository.getSnällhet()));

            } catch (InterruptedException | IOException ex) {
                break;
            }
        }
    }
}
