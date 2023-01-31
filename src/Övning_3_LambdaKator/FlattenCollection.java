package Övning_3_LambdaKator;

import java.util.List;

public class FlattenCollection {
    public static List<String> transform(List<List<String>> l){
        return l.stream().flatMap(lista -> lista.stream()).toList();
    }

    //valfri att implementera
    static List<String> goingDeeper(List<List<List<String>>> collection) {
       return collection.stream().flatMap(lista -> lista.stream()).flatMap(nextLevelList -> nextLevelList.stream()).toList();
    }
}