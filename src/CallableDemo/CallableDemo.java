package CallableDemo;

import java.io.IOException;
import java.util.Scanner;

public class CallableDemo {
    public static void main(String[] args) throws IOException {

        Repository repository = new Repository();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Namn på presenten?");
        String presentNamn = scanner.nextLine();
        System.out.println("Id på ansvarig nisse?");
        int ansvarigFörPresent = scanner.nextInt();

        /* Variant 1:
        repository.addPresent(presentNamn, ansvarigFörPresent);
        System.out.println("Presenten är inlagd i databasen");
        */

        /* Variant 2:
        repository.addPresentOUT(presentNamn,ansvarigFörPresent);
        */


        // Variant 3:
        repository.addPresentSELECT(presentNamn,ansvarigFörPresent);
    }
}
