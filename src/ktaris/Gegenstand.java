package ktaris;

/**
 * Repräsentiert einen Gegenstand, den ein Krieger besitzen kann.
 * Jeder Gegenstand hat einen Typ (Bezeichnung) und einen Faktor,
 * der zur Berechnung der Macht eines Kriegers beiträgt.
 */
public class Gegenstand {
    String typ;
    int faktor;


    /**
     * Erzeugt einen Gegenstand ohne initiale Werte.
     */
    public Gegenstand(){
    }
    /**
     * Erzeugt einen Gegenstand mit Typ und Faktor.
     *
     * @param typ Bezeichnung des Gegenstands
     * @param faktor Stärke-Faktor des Gegenstands
     */
    public Gegenstand(String typ, int faktor){
        this.typ = typ;
        this.faktor = faktor;
    }

    /**
     * Gibt den Typ des Gegenstands zurück.
     *
     * @return der Typ als String
     */
    public String getTyp() {
        return typ;
    }

    /**
     * Setzt den Typ des Gegenstands.
     *
     * @param typ neuer Typ
     */
    public void setTyp(String typ) {
        this.typ = typ;
    }

    /**
     * Gibt den Faktor des Gegenstands zurück.
     *
     * @return der Faktor
     */
    public int getFaktor() {
        return faktor;
    }

    /**
     * Setzt den Faktor des Gegenstands. Werte kleiner oder gleich 0
     * werden ignoriert, um ungültige Faktoren zu verhindern.
     *
     * @param faktor neuer Faktor, muss größer als 0 sein
     */
    public void setFaktor(int faktor) {
        if(faktor > 0) {
            this.faktor = faktor;
        }
    }

    /**
     * Gibt eine textuelle Darstellung des Gegenstands zurück.
     *
     * @return String mit Typ und Faktor
     */
    @Override
    public String toString() {
        return "Gegenstand{" +
                "typ='" + typ + '\'' +
                ", faktor=" + faktor +
                '}';
    }
}