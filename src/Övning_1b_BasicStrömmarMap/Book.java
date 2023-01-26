package Övning_1b_BasicStrömmarMap;

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
Uppgift 1b– Basic strömmar, map
Jobba vidare med din bok-lista.
Skriv följande funktioner som alla ska använda lambda-metoden map:
• En funktion som returnerar en lista på alla titlar som dina böcker har
• En funktion som returnerar en lista på alla författare som dina böcker har
o Vi vill inte ha några dubletter i listan
• En funktion som listar alla titlar, men bara på böcker som tillhör dig
 */