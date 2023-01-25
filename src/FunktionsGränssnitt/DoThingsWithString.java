package FunktionsGränssnitt;

@FunctionalInterface
public interface DoThingsWithString {
    String apply(String a); // en metod som returnerar String och tar en in-parameter av typen String

    default DoThingsWithString andThen(DoThingsWithString after){ // en metod som tar in OCH returnerar en parameter av typen DoThingsWithString
        return a -> after.apply(apply(a));
    }
}