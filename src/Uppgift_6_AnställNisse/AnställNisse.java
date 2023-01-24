package Uppgift_6_AnställNisse;

import java.io.IOException;
import java.util.Scanner;

public class AnställNisse {
    public static void main(String[] args) throws IOException {
        Repository repository = new Repository();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nisses namn?");
        String tomteNamn = scanner.nextLine();
        System.out.println("Id på nisses chef?");
        int chefId = scanner.nextInt();

        repository.addManufacturingElf2(tomteNamn,chefId);
    }
}
/*
Uppgift 6 – Anställ nisse.
Tidigare var en av uppgifterna att skriva en ”anställ en tillverkningsnisse”-sp. Gör ett console-program
som anropar din sp och lägger till en tillverkningsnisse, inklusive tar hand om eventuella fel som kan
uppstå och genererar lämpliga felmeddelanden till användaren. (Tips: om ni låter nissarnas namnkolumn
få en unique-constraint är fel lätta att generera genom att man försöker lägga in nissar med
samma namn igen och igen).
 */