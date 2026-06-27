
package ktaris;

public class KtarisMain {
    /**
     * Demonstriert die Klassen des Ktaris-Modells (Gegenstand, Krieger, Volk)
     * anhand der Aufgaben A4.1 bis A4.4.
     */

    public static void main(String[] args) {
        //4.1.1
        // Erzeugen der Objekte
        Gegenstand g1 = new Gegenstand("Quantenkanone", 17);
        Gegenstand g2 = new Gegenstand("Graviton-Blaster", 15);

        /* TODO: 1. Erzeugen Sie ein zusaetzliches Objekt g3, g4
         * die Attributwerte für alle Instanzvariablen finden Sie im Objektdiagramm
         * aus (Hinweis: verwenden Sie den vollparametrisierten Konstruktor)
         */
        Gegenstand g3 = new Gegenstand( "Quantenkanone", 17);
        Gegenstand g4 = new Gegenstand("Dunkler-Ermitter", 45);

        /* TODO: 2. Erzeugen Sie das zusaetzliche Objekt g5 mit dem Konstruktor,
         * der nichts initialisiert (parameterloser Konstruktor),
         */
        Gegenstand g5 = new Gegenstand();
        // Setzen der Attribute
        /* TODO: 3. Fuegen Sie g5 die Attributwerte über die Setter hinzu, siehe Objektdiagramm
         */
        g5.setTyp("Schatten-Flamme");
        g5.setFaktor(15);


        // 4.1.2
        //Erstellung Völker
        Volk katarus = new Volk("Katarus", 1247);
        Volk arpasian = new Volk("Arparsian", 1023);

        //4.1.3
        //Erstellung Krieger
        Krieger allana = new Krieger("Allana", 140, 32);
        Krieger tystae = new Krieger("Tystae", 70, 17);
        Krieger inaraSerra = new Krieger("InaraSerra", 163, 60);
        Krieger testkrieger = new Krieger( "tomtom", 111, 50);

        //4.2.2.6
        katarus.addKrieger(allana);
        katarus.addKrieger(tystae);
        arpasian.addKrieger(inaraSerra);
        arpasian.addKrieger(testkrieger);
        //4.2.3
        allana.addGegenstand(g1);
        allana.addGegenstand(g2);
        tystae.addGegenstand(g3);
        inaraSerra.addGegenstand(g4);
        inaraSerra.addGegenstand(g5);

        // Test, removeKrieger
        arpasian.removeKrieger(testkrieger);


        // Bildschirmausgabe
        System.out.println("Typ: " + g1.getTyp());
        System.out.println("Faktor: " + g1.getFaktor());
        System.out.println("######################################");
        System.out.println(g1.toString()); // Die toString() Methode wird aufgerufen
        System.out.println();
        System.out.println("Typ: " + g2.getTyp());
        System.out.println("Faktor: " + g2.getFaktor());
        System.out.println("######################################");
        System.out.println(g2); // Die toString() Methode wird selbstständig aufgerufen
        System.out.println();

        // TODO: 4. Ausgabe von g3, ergänzen Sie die fehlenden Methodenaufrufen
        System.out.println("Typ: " +  g3.getTyp());
        System.out.println("Faktor: " + g3.getFaktor());
        System.out.println("######################################");
        System.out.println(g3); // TODO: 5. Die toString() Methode wird aufgerufen
        System.out.println();

        /* TODO: 6. Geben Sie g4, g5 auch auf dem Bildschirm aus, in dem Sie die
         * fehlenden Methodenaufrufen ergänzen.
         */
        System.out.println("Typ:" + g4.getTyp());
        System.out.println("Faktor:" + g4.getFaktor());
        System.out.println();
        System.out.println("Typ:" + g5.getTyp());
        System.out.println("Faktor:" + g5.getFaktor());
        // Zusatzaufgabe 6
        /*
        5 Gegenstände in einem Codeblock
        */
        System.out.println(g1 + ", " + g2 + ", " + g3 + ", " + g4 + ", " + g5);
        // 4.1.2
        //Erstellung Völker
        System.out.println(arpasian + " " + katarus);
        //4.1.3
        //Krieger
        System.out.println(allana + " " + inaraSerra + " " + tystae);

        //4.2.2.6
        System.out.println("Mitglieder: " + katarus.getMitglieder());
        System.out.println("Mitglieder: " + arpasian.getMitglieder());
        //4.2.3
        System.out.println("*****************");
        System.out.println(allana.gegenstaende);
        System.out.println(tystae.gegenstaende);
        System.out.println(inaraSerra.gegenstaende);

        // ⭐⭐ +handeln(gegenstand:Gegenstand): void
        System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐");
        tystae.handeln(g3);
        tystae.handeln(g3);
        System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐");

        //👽 A4.4
        System.out.println("Allana findet einen neuen Gegenstand Quantenkanone mit dem Faktor 17. Sie hat nun zwei davon.");
        Gegenstand g6 = new Gegenstand("Quantenkanone", 17);
        allana.addGegenstand(g6);
        System.out.println(allana.gegenstaende);

        System.out.println("Allana zeigt ihre neue Macht an (49).");
        System.out.println(allana.getMacht());

        System.out.println("Katarus zeigt seine Macht an (115).");
        System.out.println(katarus.getMacht());

        System.out.println("Tystae verliert seine Quantenkanone.");
        tystae.removeGegenstand(g3);

        System.out.println("Allana schenkt ihre neue Quantenkanone an Tystae.");
        allana.handeln(g6);
        tystae.handeln(g6);

        System.out.println("Katarus zeigt seine Macht an (81?).");
        System.out.println(katarus.getMacht());

        System.out.println("Arpasian nimmt die Kriegerin Bria (Alter: 148) auf. Sie wird auch gleich Chefin.");
        Krieger bria = new Krieger("Bria", 148, 45);
        arpasian.addKrieger(bria);
        arpasian.setChef(bria);

        System.out.println("Arpasian zeigt seine Macht an (62).");
        System.out.println(arpasian.getMacht());

        System.out.println("Zur Krönung erhält Bria den Dunkel-Emitter von Inara.");
        inaraSerra.handeln(g4);
        bria.handeln(g4);

        System.out.println("Bei genauer Betrachtung fällt auf, dass die Quantenkanone von Allana nur den Faktor 12 hat.");
        g1.setFaktor(12);

        System.out.println("Katarus zeigt seine Macht an (71).");
        System.out.println(katarus.getMacht());

        tystae.treffen(allana);

        //########################################################
        // A5.1 & A5.2
        // Erzeugen der Gegenstände ichaya tribble, karaoke, sandOfLife
        Spezies ichaya = new Spezies("I-chaya", 18, "Vulkan", 300);
        Spezies tribble = new Spezies("Tribble", 1, "Qo'noS", 1);
        Cargo sandOfLife = new Cargo("Vulkanischer Meditaions-Sandkasten", 51,"10 x 14 x 14 cm", 3, 2261 );
        Cargo karaoke = new Cargo("Klingonischs Karaoke-Set", 5, "25 x 30 x 45 cm", 7, 2382 );

        System.out.println(ichaya);
        System.out.println(tribble);
        System.out.println(sandOfLife);
        System.out.println(karaoke);

        arpasian.getMacht();
        katarus.getMacht();

        System.out.println(allana.gegenstaende);
        System.out.println(bria.gegenstaende);
        // A5.3 bereits erledigt
    }


}