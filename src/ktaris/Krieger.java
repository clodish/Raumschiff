package ktaris;

import java.util.ArrayList;
import consoleHelper.ConsoleHelper;

/**
 * Repräsentiert einen Krieger innerhalb eines Volkes.
 * Ein Krieger besitzt Gegenstände, deren Faktoren seine Macht bestimmen,
 * und kann mit anderen Kriegern Gegenstände handeln oder sich treffen.
 */
public class Krieger {
    private String name;
    private int alter;
    private int macht = 1;
    ArrayList<Gegenstand> gegenstaende;

    /**
     * Erzeugt einen Krieger ohne initiale Werte und mit leerer Gegenstände-Liste.
     */
    public Krieger(){
        this.gegenstaende = new ArrayList<>();
    }
    /**
     * Erzeugt einen Krieger mit Name und Alter. Die Macht bleibt beim Standardwert (1).
     *
     * @param name Name des Kriegers
     * @param alter Alter des Kriegers
     */
    public Krieger(String name, int alter){
        this();
        this.name = name;
        this.alter = alter;
    }
    /**
     * Erzeugt einen Krieger mit Name, Alter und initialer Macht.
     *
     * @param name Name des Kriegers
     * @param alter Alter des Kriegers
     * @param macht initiale Macht des Kriegers
     */
    public Krieger( String name,int alter, int macht) {
        this();
        this.alter = alter;
        this.name = name;
        this.macht = macht;
    }

    /**
     * Fügt dem Krieger einen Gegenstand hinzu, falls er ihn noch nicht besitzt.
     * Gibt eine entsprechende Meldung auf der Konsole aus.
     *
     * @param gegenstand der hinzuzufügende Gegenstand
     */
    public void addGegenstand(Gegenstand gegenstand){
        if(!gegenstaende.contains(gegenstand)){
            gegenstaende.add(gegenstand);
            System.out.println("Gegenstand " + gegenstand + " hinzugefügt.");
        }else System.out.println("Gegenstand ist bereits vorhanden.");
    }
    /**
     * Entfernt einen Gegenstand aus dem Besitz des Kriegers.
     *
     * @param gegenstand der zu entfernende Gegenstand
     */
    public void removeGegenstand(Gegenstand gegenstand){
        gegenstaende.remove(gegenstand);
    }
    /**
     * Nimmt einen Gegenstand vom Krieger weg, wenn er ihn bereits besitzt,
     * oder fügt ihn hinzu, wenn er ihn noch nicht hat. Nach der Änderung wird
     * die Macht neu berechnet und das Ergebnis auf der Konsole ausgegeben.
     *
     * @param gegenstand der Gegenstand, mit dem gehandelt wird
     */
    public void handeln(Gegenstand gegenstand){

        if(gegenstaende.contains(gegenstand)){
            gegenstaende.remove(gegenstand);
            System.out.println( this.name + " hat abgegeben: " + gegenstand);
            berechneMacht();

        }else{
            gegenstaende.add(gegenstand);
            System.out.println(this.name + " hat aufgenommen: " + gegenstand);
            berechneMacht();


        }

    }
    /**
     * Simuliert ein Treffen zwischen diesem Krieger und einem anderen.
     * Über die Konsole wird abgefragt, wer von beiden einen Gegenstand
     * abgibt. Besitzt der ausgewählte Krieger keine Gegenstände, wird das
     * Treffen abgebrochen. Andernfalls wird abgefragt, welcher Gegenstand
     * den Besitzer wechselt, und der Tausch wird über {@link #handeln(Gegenstand)}
     * auf beiden Seiten ausgeführt.
     *
     * @param krieger der Krieger, der getroffen wird
     */
    public void treffen(Krieger krieger){
        ArrayList<Krieger>teilnehmer = new ArrayList<>();
        teilnehmer.add(this);
        teilnehmer.add(krieger);

        // Menu
        ConsoleHelper.header("Treffen");
        ConsoleHelper.printMenuElement(1, "Gegenstand von " + this.name + " zu " + krieger.name);
        ConsoleHelper.printMenuElement(2, "Gegenstand von " + krieger.name + " zu " + this.name );
        int inputWahlVerkaeufer= (ConsoleHelper.inputInt("Wählen Sie", 1,2)) -1 ;

        // Aus den 2 Teilnehmern den "anderen" ermitteln:
        // gewählten Krieger kurz entfernen, Rest-Element ist der Tauschpartner
        Krieger auserwaehlter = teilnehmer.get(inputWahlVerkaeufer);
        teilnehmer.remove(auserwaehlter);
        Krieger tauschpartner = teilnehmer.get(0);
        ArrayList <Gegenstand> gegenstaendeAuserwaehlter = auserwaehlter.gegenstaende;


        if(gegenstaendeAuserwaehlter.isEmpty()){
            System.out.println("Der Tauschpartner hat keine Gegenstände. Treffen abgebrochen.");
        }else {
            int inputWahlItem = (ConsoleHelper.printMenu("Gegenstand von " + auserwaehlter.name + " zu " + tauschpartner.name , gegenstaendeAuserwaehlter)) - 1;
            Gegenstand gegenstandAuserwaehlter = auserwaehlter.gegenstaende.get(inputWahlItem);
            auserwaehlter.handeln(gegenstandAuserwaehlter);
            tauschpartner.handeln(gegenstandAuserwaehlter);
        }
    }

    /**
     * Gibt den Namen des Kriegers zurück.
     *
     * @return der Name
     */
    public String getName() {
        return name;
    }

    /**
     * Setzt den Namen des Kriegers.
     *
     * @param name neuer Name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gibt das Alter des Kriegers zurück.
     *
     * @return das Alter
     */
    public int getAlter() {
        return alter;
    }

    /**
     * Setzt das Alter des Kriegers.
     *
     * @param alter neues Alter
     */
    public void setAlter(int alter) {
        this.alter = alter;
    }

    /**
     * Berechnet die Macht neu und gibt sie zurück.
     *
     * @return die aktuelle Macht des Kriegers
     */
    public int getMacht() {
        berechneMacht();
        return macht;
    }

    /**
     * Gibt die Liste der Gegenstände des Kriegers zurück.
     *
     * @return Liste der Gegenstände
     */
    public ArrayList<Gegenstand> getGegenstand() {
        return gegenstaende;
    }

    /**
     * Setzt die Macht des Kriegers direkt.
     *
     * @param macht neue Macht
     */
    public void setMacht(int macht) {
        this.macht = macht;
    }
    /**
     * Berechnet die Macht des Kriegers neu, indem die Faktoren aller
     * besessenen Gegenstände summiert werden. Besitzt der Krieger keine
     * Gegenstände, beträgt die Macht 1.
     */
    private void berechneMacht(){
        macht = 0;
        if(gegenstaende.isEmpty()){
            macht = 1;

        }else{
            for(Gegenstand gegenstand : gegenstaende){
                macht += gegenstand.getFaktor();
            }
        }
    }

    /**
     * Gibt eine textuelle Darstellung des Kriegers zurück, inklusive
     * Name, Alter, Macht und Gegenständen.
     *
     * @return String-Repräsentation des Kriegers
     */
    @Override
    public String toString() {
        return "Krieger{" +
                "name='" + name + '\'' +
                ", alter=" + alter +
                ", macht=" + macht +
                ", gegenstaende=" + gegenstaende +
                '}';
    }
}