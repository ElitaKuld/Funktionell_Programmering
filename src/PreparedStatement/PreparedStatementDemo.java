package PreparedStatement;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class PreparedStatementDemo {
    public static void main(String[] args) throws IOException {

        Repository repository = new Repository();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Namn på barnet?");
        String namn = scanner.nextLine();

        List<Barn> barn = repository.getBarnFrånNamn(namn);
        barn.forEach(b -> System.out.println(b.getNamn() + " " + b.getAdress()));
    }
}