package Övning_2b_Funktionsgränssnitt;

import FunktionsGränssnitt.DoThingsWithString;

public interface MathOperation {

    int operation(int a, int b); // en abstrakt metod som returnerar int

    default MathOperation add(MathOperation secondOperation){ // en metod som tar in OCH returnerar en parameter av typen MathOperation
        return (a,b) -> secondOperation.operation(a,b) + operation(a,b);
    }

    default MathOperation multiply(MathOperation secondOperation){ // en metod som tar in OCH returnerar en parameter av typen MathOperation
        return (a,b) -> secondOperation.operation(a,b) * operation(a,b);
    }
}
