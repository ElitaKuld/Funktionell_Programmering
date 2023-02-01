package MapDemo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, List<String>> telefonnummer = new HashMap<>();
        telefonnummer.put("Anna", List.of("123456", "456789", "789123"));
        telefonnummer.put("Alex", List.of("987654", "65432", "654987"));
        telefonnummer.put("Aleksey", List.of("528963", "852147", "963258"));

        telefonnummer.forEach((namn,nummer) -> System.out.println(namn + " " + nummer));
        System.out.println(telefonnummer.keySet());
        System.out.println(telefonnummer.values());

        System.out.println(telefonnummer.containsKey("Anna"));
        System.out.println(telefonnummer.containsKey("Elena"));

        telefonnummer.put("Aleksey", List.of("564565", "589658", "256325")); // skriva om värden på en av nycklarna
        telefonnummer.forEach((namn,nummer) -> System.out.println(namn + " " + nummer));

        telefonnummer.put("Andrey", List.of("256452", "785698", "145236")); // lägga till en ny nyckel och ett nytt värde
        telefonnummer.forEach((namn,nummer) -> System.out.println(namn + " " + nummer));

        System.out.println(telefonnummer.entrySet());
    }
}
