package FunktionsGränssnitt;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        String a = "Sommar";
        String b = "Strand";
        String c = "MosaA";

        DoThingsWithString doThingsWithString = inParameterAvTypenString -> inParameterAvTypenString.toUpperCase(); // här anger vi vad som metoden ska göra
        System.out.println(doThingsWithString.apply(a));
        System.out.println(doThingsWithString.apply(b));

        DoThingsWithString doThingsWithString1 = inParameterAvTypenString -> inParameterAvTypenString.replace('o','ô').substring(4);
        System.out.println(doThingsWithString1.apply(c));

        DoThingsWithString doThingsWithString2 = inParameterAvTypenString -> { // ifall vi har flera satser som ska utföras
            return inParameterAvTypenString.toLowerCase();
        };
        System.out.println(doThingsWithString2.apply(a));

        main.print(doThingsWithString1,b);

        main.print(inParameterAvTypenString -> inParameterAvTypenString.repeat(3),b); // ange vad vid ska göra med inparametern direkt i metoden

        System.out.println(doThingsWithString.andThen(doThingsWithString1).apply(a));
    }

    void print(DoThingsWithString doThingsWithString, String a){ // skicka in funktion som inparameter
        System.out.println(doThingsWithString.apply(a));
    }
}