package PreparedStatementInsert;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class PreparedStatementInsertDemo {
    public static void main(String[] args) throws IOException {

        Repository repository = new Repository();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Namn på barnet?");
        String namn = scanner.nextLine();
        System.out.println("Barnets adress?");
        String adress = scanner.nextLine();
        System.out.println("Landets id?");
        int landId = scanner.nextInt();
        System.out.println("Id på ansvarig nisse?");
        int ansvarigFörBarn = scanner.nextInt();

        repository.insertNewChild(namn.trim(), adress.trim(), landId, ansvarigFörBarn);
        System.out.println("Barnet är inlagt i databasen");

        List<Barn> barn = repository.getBarnFrånNamn(namn);
        barn.forEach(b -> System.out.println(b.getNamn() + " " + b.getAdress()));
    }
}