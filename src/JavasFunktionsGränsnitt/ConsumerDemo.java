package JavasFunktionsGränsnitt;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public ConsumerDemo(){
        Consumer consumer = någonObjekt -> System.out.println(någonObjekt);

        consumer.accept("Hej");
        consumer.accept(5);


        List list = List.of("Faith", "Hope", "Love");

        list.forEach(någonObjekt -> System.out.println(någonObjekt));

        list.forEach(new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        });

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.toUpperCase());
            }
        });

    }

    public static void main(String[] args) {
        ConsumerDemo consumerDemo = new ConsumerDemo();
    }
}
