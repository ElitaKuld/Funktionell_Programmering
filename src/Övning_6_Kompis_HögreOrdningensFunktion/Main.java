package Övning_6_Kompis_HögreOrdningensFunktion;

import HögreOrdningensFunktionDemo.BookSearcherInterface;

import java.util.List;
import java.util.Scanner;

public class Main {

    final List<Kompis> listOfFriends = Telefonbok.getFriendList();

    KompisSearchInterface namnSök = (kompis, string) -> kompis.getNamn().equalsIgnoreCase(string);
    KompisSearchInterface adressSök = (kompis, string) -> kompis.getAdress().equalsIgnoreCase(string);
    KompisSearchInterface mobilnummerSök = (kompis, string) -> kompis.getMobilnummer().equalsIgnoreCase(string);
    KompisSearchInterface födelsedagSök = (kompis, string) -> kompis.getFödelsedag().equalsIgnoreCase(string);
    KompisSearchInterface emailSök = (kompis, string) -> kompis.getEmail().equalsIgnoreCase(string);
    
    // Högre ordningens funktion
    public void searchForFriend(String ordAttLetaEfter, KompisSearchInterface ksi){
        listOfFriends.stream().filter(kompis -> ksi.search(kompis,ordAttLetaEfter)).
                forEach(kompis -> System.out.println(kompis.getNamn() + " " + kompis.getAdress() + " " + kompis.getMobilnummer()));
    }

    public static void main(String[] args) {

        Main main = new Main();

        final Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Vilken attribut vill du söka på?");
            String attributAttLetaEfter = scanner.nextLine();
            System.out.println("Vilket ord vill du leta efter");
            String ordAttLetaEfter = scanner.nextLine();

            if (attributAttLetaEfter.equalsIgnoreCase("namn")){
                main.searchForFriend(ordAttLetaEfter, main.namnSök);
            }
            else if (attributAttLetaEfter.equalsIgnoreCase("adress")){
                main.searchForFriend(ordAttLetaEfter, main.adressSök);
            }
            else if (attributAttLetaEfter.equalsIgnoreCase("mobilnummer")){
                main.searchForFriend(ordAttLetaEfter, main.mobilnummerSök);
            }
            else if (attributAttLetaEfter.equalsIgnoreCase("födelsedag")){
                main.searchForFriend(ordAttLetaEfter, main.födelsedagSök);
            }
            else if (attributAttLetaEfter.equalsIgnoreCase("email")){
                main.searchForFriend(ordAttLetaEfter, main.emailSök);
            }
        }
    }
}