package Övning_2b_Funktionsgränssnitt;

public class Main {
    private static int operate(int a, int b, MathOperation mathOperation) {

        return mathOperation.operation(a, b);
    }

    public static void main(String args[]) {

        MathOperation addition = (intA, intB) -> intA + intB; // om det är två in-parametrar anges dem inom en parentes
        MathOperation subtraction = (intA, intB) -> intA - intB;
        MathOperation multiplication = (intA, intB) -> intA * intB;
        MathOperation division = (intA, intB) -> intA / intB;

        /* Från förra uppgiften:
        System.out.println("10 + 5 = " + operate(10, 5, addition));
        System.out.println("10 - 5 = " + operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + operate(10, 5, division));
        */

        System.out.println("(10 + 5) + (10 - 5) = " + operate(10, 5, addition.add(subtraction))); // implementering av en default metod "add"
        System.out.println("(10 * 5) * (10 / 5) = " + operate(10, 5, multiplication.multiply(division)));
    }
}
/*
Uppgift 2b – Funktionsgränssnitt
Testa att lägga till default-metoder i MathOperator interfacet som länkar ihop ett uttryck i en
MathOperator med ett annat MathOperator-uttryck på olika sätt, t.ex genom att addera eller
multiplicera deras resultat.
 */