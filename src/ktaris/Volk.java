package ktaris;
import consoleHelper.ConsoleHelper.*;

import java.util.ArrayList;

/**
 * Repräsentiert ein Volk, bestehend aus Kriegern und einem Chef.
 * Ein Volk verwaltet seine Mitglieder und kann die Gesamtmacht
 * aller zugehörigen Krieger berechnen.
 */
public class Volk {
    private String name;
    private int gruendung;
    private Krieger chef;
    private ArrayList<Krieger>mitglieder;

    /**
     * Erzeugt ein Volk ohne initiale Werte und mit leerer Mitgliederliste.
     */
    public Volk(){
        this.mitglieder = new ArrayList<Krieger>();
    }
    /**
     * Erzeugt ein Volk mit Name und Gründungsjahr.
     *
     * @param name Name des Volkes
     * @param gruendung Gründungsjahr des Volkes
     */
    public Volk(String name, int gruendung) {
        this();
        this.name = name;
        this.gruendung = gruendung;

    }

    /**
     * Gibt das Gründungsjahr des Volkes zurück.
     *
     * @return das Gründungsjahr
     */
    public int getGruendung() {
        return gruendung;
    }

    /**
     * Setzt das Gründungsjahr des Volkes.
     *
     * @param gruendung neues Gründungsjahr
     */
    public void setGruendung(int gruendung) {
        this.gruendung = gruendung;
    }

    /**
     * Gibt den Namen des Volkes zurück.
     *
     * @return der Name
     */
    public String getName() {
        return name;
    }

    /**
     * Gibt den Chef des Volkes zurück.
     *
     * @return der aktuelle Chef, oder null falls keiner gesetzt ist
     */
    public Krieger getChef() {
        return chef;
    }

    /**
     * Setzt den Chef des Volkes.
     *
     * @param chef der neue Chef
     */
    public void setChef(Krieger chef) {
        this.chef = chef;
    }

    /**
     * Gibt die Liste der Mitglieder des Volkes zurück.
     *
     * @return Liste der Krieger im Volk
     */
    public ArrayList<Krieger> getMitglieder() {
        return mitglieder;
    }

    /**
     * Setzt den Namen des Volkes.
     *
     * @param name neuer Name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Berechnet die Gesamtmacht des Volkes. Jedes Mitglied trägt seine Macht
     * einmal bei; der Chef wird dabei zusätzlich noch einmal extra gezählt
     * (also doppelt berücksichtigt).
     *
     * @return die Gesamtmacht des Volkes
     */
    public int getMacht(){
        int counter = 0;
        if(mitglieder.isEmpty()){
            return 0;
        }else{
            for(Krieger krieger : mitglieder){
                counter += krieger.getMacht();
            }
            if(chef != null){
                counter += chef.getMacht();
            }

            return counter;

        }
    }
    /**
     * Entfernt einen Krieger aus dem Volk. War der entfernte Krieger der Chef,
     * wird automatisch ein neues Mitglied (falls vorhanden) zum neuen Chef bestimmt.
     * Bleibt das Volk ohne Mitglieder zurück, ist der Chef anschließend null.
     *
     * @param krieger der zu entfernende Krieger
     */
    public void removeKrieger(Krieger krieger){
        if(chef == krieger){
            chef = null;
            mitglieder.remove(krieger);
        }else{
            mitglieder.remove(krieger);
        }
        if(chef == null && !mitglieder.isEmpty()){
            chef = mitglieder.get(0);  // Ich wollte hier getFirst() nutzen, soll aber erst für Java Version 21 kompilieren.
        }
    }
    /**
     * Fügt einen Krieger zum Volk hinzu, sofern er noch nicht Mitglied ist.
     * Existiert noch kein Chef, wird der übergebene Krieger automatisch zum Chef.
     *
     * @param krieger der hinzuzufügende Krieger
     */
    public void addKrieger(Krieger krieger){
        if(chef == null){
            chef = krieger;
            if(!mitglieder.contains(krieger)){
                mitglieder.add(krieger);
            }
        }else{
            if(!mitglieder.contains(krieger)){
                mitglieder.add(krieger);
            }

        }

    }

    /**
     * Gibt eine textuelle Darstellung des Volkes zurück, inklusive
     * Name, Gründungsjahr, Chef und Mitgliedern.
     *
     * @return String-Repräsentation des Volkes
     */
    @Override
    public String toString() {
        return "Volk{" +
                "name='" + name + '\'' +
                ", gruendung=" + gruendung +
                ", chef=" + chef +
                ", mitglieder=" + mitglieder +
                '}';
    }
}