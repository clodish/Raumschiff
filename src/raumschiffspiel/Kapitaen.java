package raumschiffspiel;

public class Kapitaen {
    private String name;
    private int charisma;
    private int erfahrung;

    Kapitaen(String name, int charisma, int erfahrung){
        this.name = name;
        this.charisma = charisma;
        this.erfahrung = erfahrung;

    }
    public void diplomatischeVerhandlung(Raumschiff raumschiff){
        /*
        * Charisma min = -100;   max = 100
        * Erfahrung min = 0;   max = 100
        *
        * Zufallswert schlechter Tag: Eine Zahl zwischen 1 bis 100, 1 super schlecht, 100 besser geht es nicht
        *
        * verhandlungsFaktorUtopisch - Wert am Ende ohne die Launen des Captains
        * verhandlunsFaktor
        * Charisma ist wichtiger als Erfahrung, zählt das 1.5 fache mehr.
        * charisma * 1.5
        * Erfahrung zählt 1 fach
        *
        * // alles muss am Ende zwischen 0 bis 100 liegen, damit man vergleichen kann.
        *
        * verhandlungsfaktorUtopisch = sqrt|(charisma * 1,5)^2| + erfahrung
        * verhandlungsfaktorPsycheCaptain = verhandlungsFaktorUtopisch * zufallsZahl
        *
        *
        *
        * */
        // schlechter Tag, zufallszahl wird zum faktor am ende gerechnet, ergebnis muss einen gewissen schwellemwert erreichen
        //Zufallszahl zwischen 1 bis 10 generieren
        int zufall = (int)(Math.random() * 10) + 1;
        int charismaThisKapitaen = this.getCharisma();
        int erfahrungThisKapitaen = this.getErfahrung();
        int charismaFremderKapitaen = raumschiff.getKapitaen().getCharisma();
        int erfahrungFremderKapitaen = raumschiff.getKapitaen().getErfahrung();

        float bereinigtesCharisma = Math.abs(charisma);
        float basis = (bereinigtesCharisma * 1,5) + erfahrungThisKapitaen;
        float utopischerFaktor =


        //
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getErfahrung() {
        return erfahrung;
    }

    public void setErfahrung(int erfahrung) {
        this.erfahrung = erfahrung;
    }

    @Override
    public String toString() {
        return "Kapitaen{" +
                "name='" + name + '\'' +
                ", charisma=" + charisma +
                ", erfahrung=" + erfahrung +
                '}';
    }
}
