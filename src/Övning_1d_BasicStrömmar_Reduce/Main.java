package Övning_1d_BasicStrömmar_Reduce;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Book> listOfBooks = BookUtil.getBookList();

        int summaBetyg = listOfBooks.stream().map(Book::getBetyg).reduce(0, (sum, betyg) -> sum + betyg);
        System.out.println(summaBetyg);
        double medelBetyg = summaBetyg / listOfBooks.size();
        System.out.println(medelBetyg);

        String superTitel = listOfBooks.stream().map(Book::getTitel).reduce("", (sträng, titel) -> sträng + ", " + titel);
        System.out.println(superTitel);
        String superTitel2 = listOfBooks.stream().map(Book::getTitel).reduce("", (sträng, titel) -> sträng + titel + ", "); // SKILLNAD!!!
        System.out.println(superTitel2);
    }
}
/*
Uppgift 1d– Basic strömmar, reduce
Skriv följande funktioner som alla ska använda lambda-metoden reduce:
• En funktion som räknar ut medelvärdet av dina betyg
• En funktion som slår ihop alla titlar till en jättelång sträng. Det ska finnas ”, ” mellan varje
titel.
 */
