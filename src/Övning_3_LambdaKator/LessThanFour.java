package Övning_3_LambdaKator;

import java.util.List;

public class LessThanFour {
    public static List<String> transform(List<String> l) {
        return l.stream().filter(string -> string.length() < 4).toList();
    }
}
/*
LessThanFour (sortera ut alla ord i en lista med färre än 4 bokstäver)
 */