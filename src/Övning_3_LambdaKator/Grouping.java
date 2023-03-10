package Övning_3_LambdaKator;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {
    public static Map<String, List<Person>> groupByNationality(List<Person> people) {
        return people.stream().collect(Collectors.groupingBy(person -> person.getNationality()));
    }
}