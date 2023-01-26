package Övning_1a_BasicStrömmarFilter;

public class Book {
    String titel;
    String författare;
    String genre;
    String färg;
    int betyg;
    String ägare;
    boolean fakta;

    public Book(){}

    public Book(String titel, String författare, String genre, String färg, int betyg, String ägare, boolean fakta) {
        this.titel = titel;
        this.författare = författare;
        this.genre = genre;
        this.färg = färg;
        this.betyg = betyg;
        this.ägare = ägare;
        this.fakta = fakta;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getFörfattare() {
        return författare;
    }

    public void setFörfattare(String författare) {
        this.författare = författare;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getFärg() {
        return färg;
    }

    public void setFärg(String färg) {
        this.färg = färg;
    }

    public int getBetyg() {
        return betyg;
    }

    public void setBetyg(int betyg) {
        this.betyg = betyg;
    }

    public String getÄgare() {
        return ägare;
    }

    public void setÄgare(String ägare) {
        this.ägare = ägare;
    }

    public boolean isFakta() {
        return fakta;
    }

    public void setFakta(boolean fakta) {
        this.fakta = fakta;
    }
}
/*
Uppgift 1a– Basic strömmar, filter
Skapa en klass Book, som minst innehåller följande medlemsvariabler (med getters och setters):
• Titel
• Författare
• Genre
• Färg
• Betyg (int)
• Ägare
• Fakta eller fiction (boolean)

Skapa en Util-klass där du skapar upp ett gäng böcker och lägger dessa i en lista. Skapa sedan funktion
getList där du returnerar din boklista. Se till att ha några böcker med samma författare, några med
samma färg, olika betyg och olika ägare till böckerna i listan.
Skriv följande funktioner som alla ska använda lambda-metoden filter:
• En funktion som söker ut alla böcker av en viss författare
• En funktion som söker ut alla böcker av en viss färg
• En funktion som räknar antal böcker som tillhör dig
 */