package Uppgift_1a_ConsoleDashboard;

import java.io.IOException;

public class ConsoleDashboard {
    public static void main(String[] args) throws IOException, InterruptedException {
        Utskrift utskrift = new Utskrift();

        utskrift.start();

        Thread.sleep(10000); // 10 sekunder

        utskrift.interrupt();

    }
}

/*
Uppgift 1 – Gör en console-dashboard till tomten.
Tomten behöver hålla koll på läget. Gör därför ett java-program som läser ut antalet barn, antalet
nissar, namnen på alla nissarna och medelvärdet på ”snällhet” (alt hur många barn, procentuellt sett är
snälla) och skriver ut dessa värden i consolen, med repetition varje 2 sekunder.
*/