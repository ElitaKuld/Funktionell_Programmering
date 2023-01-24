package Uppgift_3b_AvskedaNisse;

import java.io.IOException;
import java.util.Scanner;

public class AvskedaNisse {
    public static void main(String[] args) throws IOException {
        Repository repository = new Repository();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ange nisses namn?");
        String name = scanner.nextLine();

        repository.avskedaNisse(name);
    }
}
/*
Uppgift 3b – Nisse-avskedning med omedelbar verkan.
Tomten har ju, som bekant, problem med nissarnas lojalitet till sin arbetsplats. Gör ett javaprogram
som läser in ett namn och om det finns en nisse med det namnet i databasen, avskeda hen genom att ta
bort nissen ur databasen.
 */