package ktaris;

public class Cargo extends  Gegenstand{
    private String abmessung;
    private int gewicht;
    private int baujahr;

public Cargo(String typ, int faktor, String abmessung, int gewicht, int baujahr){
    super(typ, faktor);
    this.abmessung = abmessung;
    this.gewicht = gewicht;
    this.baujahr = baujahr;
}

    public String getAbmessung() {
        return abmessung;
    }

    public void setAbmessung(String abmessung) {
        this.abmessung = abmessung;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "gewicht=" + gewicht +
                ", baujahr=" + baujahr +
                ", abmessung='" + abmessung + '\'' +
                "} " + super.toString();
    }
}
