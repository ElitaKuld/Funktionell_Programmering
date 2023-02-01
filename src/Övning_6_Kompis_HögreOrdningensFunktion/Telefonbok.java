package Övning_6_Kompis_HögreOrdningensFunktion;

import java.util.List;

public class Telefonbok {

    public static List<Kompis> getFriendList() {
        Kompis kompisA = new Kompis("Elita", "Sara Moraeas väg 132", "0762217262", "07/04/1986", "eli@gmail.se");
        Kompis kompisB = new Kompis("Marek", "Alevaja 28", "0725986412", "08/05/1987", "marek@gmail.ru");
        Kompis kompisC = new Kompis("Sonya", "Stora vägen 126", "0762895632", "09/06/1988", "sonya@gmail.com");
        Kompis kompisD = new Kompis("Nikita", "Vologdanskaja 37", "0782856987", "10/07/1989", "nikita@gmail.ru");
        Kompis kompisE = new Kompis("Luka", "Barceolli 96", "078946215", "11/08/1990", "luka@gmail.it");

        return List.of(kompisA, kompisB, kompisC, kompisD, kompisE);
    }
}