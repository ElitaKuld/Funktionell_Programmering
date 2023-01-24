package Uppgift_3a_Namnbytesprogram;

import java.io.IOException;
import java.util.Scanner;

public class Namnbytesprogram {
    public static void main(String[] args) throws IOException {
        Repository repository = new Repository();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ange nisses nuvarande namn?");
        String currentName = scanner.nextLine();
        System.out.println("Ange det önskade namnet?");
        String desiredName = scanner.nextLine();
        repository.changeElfName(currentName,desiredName);
    }
}
/*
Uppgift 3a – Nissarnas namnbytesprogram.
En grej som nissarna har för sig är att de gillar att byta namn. Gör ett javaprogram där du läser in en
nisses nuvarande namn och det namn nissen vill byta till. Uppdatera nissens namn i databasen.
 */