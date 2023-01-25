package Övning_2a_Funktionsgränssnitt_MathOperation;

public class Main {
    private static int operate(int a, int b, MathOperation mathOperation) {

        return mathOperation.operation(a, b);
    }

    public static void main(String args[]) {

        MathOperation addition = (intA, intB) -> intA + intB; // om det är två in-parametrar anges dem inom en parentes
        MathOperation subtraction = (intA, intB) -> intA - intB;
        MathOperation multiplication = (intA, intB) -> intA * intB;
        MathOperation division = (intA, intB) -> intA / intB;

        System.out.println("10 + 5 = " + operate(10, 5, addition));
        System.out.println("10 - 5 = " + operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + operate(10, 5, division));

    }
}
/*
Uppgift 2a– Funktionsgränssnitt
Ladda ner filerna till Övningsuppgift 2 från Sigruns github.
Gränssnittet MathOperation finns färdigt. Gör klart implementationerna av addition, subtraktion,
multiplikation och division i MathOperationsMain. Kontrollera att allt funkar som förväntat genom att
avkommentera och köra utskrifterna.
 */