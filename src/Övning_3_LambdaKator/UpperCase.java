package Övning_3_LambdaKator;

import java.util.List;

public class UpperCase {
    public static List<String> transform(List<String> l){
        return l.stream().map(string -> string.toUpperCase()).toList();
    }
}
/*
UpperCase (gör om alla ord i en lista så att de blir skrivna med versaler)
 */