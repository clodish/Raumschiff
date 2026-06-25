package ktaris;

import java.util.ArrayList;
import consoleHelper.ConsoleHelper;

public class Krieger {
    private String name;
    private int alter;
    private int macht = 1;
    ArrayList<Gegenstand> gegenstaende;

    public Krieger(){
        this.gegenstaende = new ArrayList<>();
    }
    public Krieger(String name, int alter){
        this();
        this.name = name;
        this.alter = alter;
    }
    public Krieger( String name,int alter, int macht) {
        this();
        this.alter = alter;
        this.name = name;
        this.macht = macht;
    }
    public void addGegenstand(Gegenstand gegenstand){
        if(!gegenstaende.contains(gegenstand)){
                gegenstaende.add(gegenstand);
                System.out.println("Gegenstand " + gegenstand + " hinzugefügt.");
        }else System.out.println("Gegenstand ist bereits vorhanden.");
    }
    public void removeGegenstand(Gegenstand gegenstand){
        gegenstaende.remove(gegenstand);
    }
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
    public void treffen(Krieger krieger){
        ArrayList<Krieger>teilnehmer = new ArrayList<>();
        teilnehmer.add(this);
        teilnehmer.add(krieger);

        // Menu
        ConsoleHelper.header("Treffen");
        ConsoleHelper.printMenuElement(1, "Gegenstand von " + this.name + " zu " + krieger.name);
        ConsoleHelper.printMenuElement(2, "Gegenstand von " + krieger.name + " zu " + this.name );
        int inputWahlVerkaeufer= (ConsoleHelper.inputInt("Wählen Sie", 1,2)) -1 ;

        Krieger auserwaehlter = teilnehmer.get(inputWahlVerkaeufer);
        teilnehmer.remove(auserwaehlter);
        Krieger tauschpartner = teilnehmer.get(0);
        teilnehmer.add(auserwaehlter);

        int inputWahlItem = (ConsoleHelper.printMenu("Gegenstand von " + auserwaehlter.name + " zu " + tauschpartner.name , auserwaehlter.gegenstaende)) - 1;
        Gegenstand gegenstandAuserwaehlter = auserwaehlter.gegenstaende.get(inputWahlItem);

        auserwaehlter.handeln(gegenstandAuserwaehlter);
        tauschpartner.handeln(gegenstandAuserwaehlter);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public int getMacht() {
        berechneMacht();
        return macht;
    }

    public ArrayList<Gegenstand> getGegenstand() {
        return gegenstaende;
    }

    public void setMacht(int macht) {
        this.macht = macht;
    }
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
