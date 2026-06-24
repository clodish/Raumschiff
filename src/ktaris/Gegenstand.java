package ktaris;

public class Gegenstand {
    String typ;
    int faktor;


    public Gegenstand(){
    }
    public Gegenstand(String typ, int faktor){
        this.typ = typ;
        this.faktor = faktor;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getFaktor() {
        return faktor;
    }

    public void setFaktor(int faktor) {
        if(faktor > 0) {
            this.faktor = faktor;
        }
    }

    @Override
    public String toString() {
        return "Gegenstand{" +
                "typ='" + typ + '\'' +
                ", faktor=" + faktor +
                '}';
    }
}
