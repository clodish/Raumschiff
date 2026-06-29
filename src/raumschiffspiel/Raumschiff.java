package raumschiffspiel;

import  java.util.Scanner;
public class Raumschiff {
    private String name;
    private int posX;
    private int posY;
    private Kapitaen kapitaen;


    Raumschiff(String name, int posX, int posY, Kapitaen kapitaen){
        this.name = name;
        this.posX = posX;
        this.posY = posY;
        this.kapitaen = kapitaen;

    }

    public void fliegen(char richtung){
        System.out.println("Deine Position lautet: (" + this.getPosX() + ", " + this.getPosY() + ")");
        System.out.println("Bewege das Raumschiff, indem du eine der folgenden Tasten drückst: 'a' , 'w' , 's', 'd'" );
        Scanner scanner = new Scanner(System.in);
        char eingabe = scanner.next().charAt(0);//nimmt nur einen charakter an
        int aktuellePositionX = this.getPosX();
        int aktuellePositionY = this.getPosY();
        switch (eingabe){
            case 'a':
                this.setPosX(aktuellePositionX -1);
                break;

            case 'd':
                this.setPosX(aktuellePositionX + 1);
                break;

            case  's':
                this.setPosY(aktuellePositionY -1);
                break;
            case 'w':
                this.setPosY(aktuellePositionY + 1);
                break;
            default:
                System.out.println("Eingabe konnte nicht verarbeitet werden, bitte 'a', 'd', 'w', 's' wählen.");
        }
    }
    public boolean pruefeKoordinaten(Raumschiff raumschiff){
        if(this.posX == raumschiff.getPosX() && this.posY == raumschiff.getPosY()){
            return true;
        }else{
            return false;
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
    public Kapitaen getKapitaen(){
        return  kapitaen;
    }

    @Override
    public String toString() {
        return "Raumschiff{" +
                "name='" + name + '\'' +
                ", posX=" + posX +
                ", posY=" + posY +
                ", kapitaen=" + kapitaen +
                '}';
    }
}
