package ktaris;

import java.util.ArrayList;

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
            System.out.println(this);
        }else{
            gegenstaende.add(gegenstand);
            System.out.println(this.name + " hat aufgenommen: " + gegenstand);
            berechneMacht();
            System.out.println(this);

        }

    }
    public void treffen(Krieger krieger){}

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
