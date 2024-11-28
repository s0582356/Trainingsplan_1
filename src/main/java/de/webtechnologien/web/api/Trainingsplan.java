package de.webtechnologien.web.api;

public class Trainingsplan {

    private int uebungNr;
    private String uebungName;
    private int anzahlSaetze;
    private int anzahlWiederholungen;


   //  Konstruktor
    public Trainingsplan(int uebungNr, String uebungName, int anzahlSaetze, int anzahlWiederholungen) {
        this.uebungNr = uebungNr;
        this.uebungName = uebungName;
        this.anzahlSaetze = anzahlSaetze;
        this.anzahlWiederholungen = anzahlWiederholungen;
    }

    public int getNr() {
        return uebungNr;
    }

    public void setNr(int uebungNr) {
        this.uebungNr = uebungNr;
    }

    public String getUebungname() {
        return uebungName;
    }

    public void setUebungname(String uebungname) {
        uebungName = uebungname;
    }

    public int getAnzahlSaetze() {
        return anzahlSaetze;
    }

    public void setAnzahlSaetze(int anzahlSaetze) {
        this.anzahlSaetze = anzahlSaetze;
    }

    public int getAnzahlWiederholungen() {
        return anzahlWiederholungen;
    }

    public void setAnzahlWiederholungen(int anzahlWiederholungen) {
        this.anzahlWiederholungen = anzahlWiederholungen;
    }


}
