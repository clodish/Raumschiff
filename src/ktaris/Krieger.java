package ktaris;

public class Krieger {
    String name;
    int alter;
    int macht = 1;

    public Krieger(){};
    public Krieger(String name, int alter){
    }
    public Krieger( String name,int alter, int macht) {
        this.alter = alter;
        this.name = name;
        this.macht = macht;
    }
    public void handeln(Gegenstand gegenstand){};
    public void treffen(Krieger krieger){};

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

    public void setMacht(int macht) {
        this.macht = macht;
    }
    public void berechneMacht(){};

    @Override
    public String toString() {
        return "Krieger{" +
                "name='" + name + '\'' +
                ", alter=" + alter +
                ", macht=" + macht +
                '}';
    }
}
