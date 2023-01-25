package MerFunktionellt;

public class MerFunktionellt {
    final int i = 5;

    int adder(int a) {
        return a + 5;
    }

    public MerFunktionellt() {
        System.out.println(adder(i));
        System.out.println(adder(adder(i)));
        System.out.println(adder(adder(adder(i))));
    }

    public static void main(String[] args) {
        MerFunktionellt merFunktionellt = new MerFunktionellt();
    }
}