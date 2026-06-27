package ktaris;

public class Spezies extends Gegenstand {
    private String heimat;
    private int lebenserwartung;

    public Spezies(String typ, int faktor, String heimat, int lebenserwartung){
        super(typ, faktor);
        this.heimat = heimat;
        this.lebenserwartung = lebenserwartung;

    }

    public String getHeimat() {
        return heimat;
    }

    public void setHeimat(String heimat) {
        this.heimat = heimat;
    }

    public int getLebenserwartung() {
        return lebenserwartung;
    }

    public void setLebenserwartung(int lebenserwartung) {
        this.lebenserwartung = lebenserwartung;
    }

    @Override
    public String toString() {
        return "Spezies{" +
                "heimat='" + heimat + '\'' +
                ", lebenserwartung=" + lebenserwartung +
                "} " + super.toString();
    }
}
