package ktaris;

public class Volk {
    private String name;
    private int gruendung;

    public Volk(){};
    public

    Volk(String name, int gruendung) {
        this.name = name;
        this.gruendung = gruendung;
    }

    public int getGruendung() {
        return gruendung;
    }

    public void setGruendung(int gruendung) {
        this.gruendung = gruendung;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getMacht(){
        return 0;
    }
    public Krieger removeKrieger(){
        return null;
    };
    public Krieger addKrieger(){
        return null;
    };

    @Override
    public String toString() {
        return "Volk{" +
                "name='" + name + '\'' +
                ", gruendung=" + gruendung +
                '}';
    }
}
