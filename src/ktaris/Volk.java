package ktaris;

import java.util.ArrayList;

public class Volk {
    private String name;
    private int gruendung;
    private Krieger chef;
    private ArrayList<Krieger>mitglieder;

    public Volk(){
        this.mitglieder = new ArrayList<Krieger>();
    };
    public Volk(String name, int gruendung) {
        this();
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

    public Krieger getChef() {
        return chef;
    }

    public void setChef(Krieger chef) {
        this.chef = chef;
    }

    public ArrayList<Krieger> getMitglieder() {
        return mitglieder;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getMacht(){
        return 0;
    }
    public void removeKrieger(Krieger krieger){
        if(chef == krieger){
            chef = null;
            mitglieder.remove(krieger);
        }else{
            mitglieder.remove(krieger);
        }




        /*if(krieger == chef){
            chef = null;
            mitglieder.remove(krieger);
            if (!mitglieder.isEmpty()){
                chef = mitglieder.get(0);
            }
        }else if(mitglieder.isEmpty()){

        }
*/

    }
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
