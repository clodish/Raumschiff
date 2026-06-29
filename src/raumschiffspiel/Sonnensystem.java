package raumschiffspiel;
import java.util.Scanner;
public class Sonnensystem {
    static void main(String[] args) {
        Kapitaen alexiaNova = new Kapitaen("Alexia Nova", 78, 45);
        Kapitaen zenithLightfall = new Kapitaen("Zenith Lightfall", 45, 89);

        Raumschiff eosNova = new Raumschiff("Eos Nova", 0, 0 , alexiaNova);
        Raumschiff auroraQuest = new Raumschiff("Auroa Quest", 0,0, zenithLightfall);

        alexiaNova.setName("Alexia Starlight Nova");
        boolean gameOver = false;
        System.out.println("Sie fliegen das Raumschiff " + eosNova.getName());
        System.out.println("Gesteuert von " + eosNova.getKapitaen().getName() + " der " + eosNova.getName() + ".");
        Scanner eingabe = new Scanner(System.in);

        while(!gameOver){
            eingabe.next().charAt(0);
                eosNova.fliegen('w');
                if (eosNova.pruefeKoordinaten(auroraQuest)){
                    System.out.println("Hier ist das Raumschiff" + auroraQuest.getName());
                    gameOver = true;
                }

        }


    }

}
