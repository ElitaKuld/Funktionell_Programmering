package Övning_3_LambdaKator;

import java.util.List;
import java.util.stream.Collectors;

public class Joining {
    public static String namesToString(List<Person> people) {
        return people.stream().map(Person::getName).collect(Collectors.joining(", ", "Names: ", "."));
    }
}