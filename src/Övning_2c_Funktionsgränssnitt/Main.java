package Övning_2c_Funktionsgränssnitt;

public class Main {
    public static void main(String[] args) {
        SingleDigitOperation getSquareOfDigit = new SingleDigitOperation() {
            @Override
            public int operate(int a) {
                return a*a;
            }
        };

        SingleDigitOperation findOutIfNumberPositive = intA -> {
            if (intA >= 0){
                return 1;
            }
            else return 0;
        };

        SingleDigitOperation findOutIfNumberPositive2 = a ->  {if (a >= 0) return 1; else  return 0;}; // Sigruns version

        System.out.println(getSquareOfDigit.operate(5));
        System.out.println(findOutIfNumberPositive.operate(12));
        System.out.println(findOutIfNumberPositive.operate(-7));
        System.out.println(findOutIfNumberPositive2.operate(10));
    }
}
/*
Uppgift 2c – Funktionsgränssnitt
Gör ett egen funktionsgränssnitt SingleDigitOperation. Det ska ha en metod: Operate.
Operate ska:
• Ta en integer som inparameter
• Returnera en integer
I ditt huvudprogram, skapa upp instanser av SingleDigitOperation där Operate:
• Returnerar kvadraten på det inskickade värdet (x*x)
• Returnerar 1 om det inskickade värdet är positivt, 0 annars
Döp dina instanser av SingleDigitOperation till lämpliga namn
 */