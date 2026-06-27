package raumschiffspiel;

public class Sonnensystem {
    static void main(String[] args) {
        Raumschiff eosNova = new Raumschiff("Eos Nova", 0, 0);
        Raumschiff auroraQuest = new Raumschiff("Auroa Quest", 0,0);
        boolean gameOver = false;
        System.out.println("Sie fliegen das Raumschiff " + eosNova.getName());

        while(!gameOver){
                eosNova.fliegen('w');
                if (eosNova.pruefeKoordinaten(auroraQuest)){
                    System.out.println("Hier ist das Raumschiff" + auroraQuest.getName());
                    gameOver = true;
                }

        }
    }
}
