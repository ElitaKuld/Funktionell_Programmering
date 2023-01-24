package RepositoryDemo;

import java.io.IOException;
import java.util.List;

public class RepositoryDemo {
    public static void main(String[] args) throws IOException {

        Repository repository = new Repository();
        List<Barn> barn = repository.getBarn();
        barn.forEach(b -> System.out.println(b.getNamn() + " " + b.getAdress()));
    }
}