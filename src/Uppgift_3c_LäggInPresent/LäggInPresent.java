package Uppgift_3c_LäggInPresent;

import java.io.IOException;
import java.util.Scanner;

public class LäggInPresent {
    public static void main(String[] args) throws IOException {
        Repository repository = new Repository();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Namn på presenten?");
        String namn = scanner.nextLine();
        System.out.println("Id på ansvarig nisse?");
        int ansvarigFörPresent = scanner.nextInt();

        repository.insertPresent(namn,ansvarigFörPresent);
        System.out.println("Presenten är inlagd i databasen");
    }
}
/*
Uppgift 3c – Lägg in present.
Skriv ett javaprogram som lägger in en present i databasen.
 */