package Övning_3_LambdaKator;

import java.util.Comparator;
import java.util.List;

public class GetOldestPerson {
    public static Person getOldestPerson(List<Person> people) {
        return people.stream().max((p1, p2) -> ((Integer) p1.getAge()).compareTo(p2.getAge())).get(); // krångligare sätt
        // return people.stream().max(Comparator.comparing(Person::getAge)).get(); // Sigruns sätt, enklare
    }
}