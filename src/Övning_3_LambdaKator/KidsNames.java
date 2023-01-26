package Övning_3_LambdaKator;

import java.util.List;

public class KidsNames {
    public static List<String> getKidNames(List<Person> people) {
        return people.stream().filter(person -> person.getAge() < 18).map(Person::getName).toList();
    }
}
/*
GetKidsNames (hitta vilka Personer i en lista som är under 18 år)
 */