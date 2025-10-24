public class Test {
    public static void main(String args[]) {
        Core c = new Core();
        System.out.println(c);

        Tag borsa = new Tag();
        borsa.setDescrizione("Borsa");
        borsa.setPosizione(new Posizione(0, 3, 4));
        Tag chiavi = new Tag();
        chiavi.setDescrizione("Chiavi");
        chiavi.setPosizione(new Posizione(1, 1, 0));
        Tag watch = new Tag();
        watch.setDescrizione("Orologio");
        watch.setPosizione(new Posizione(0, 3, 0));

        c.aggiungiAggiorna(borsa, chiavi, watch);
        System.out.println(c);

        borsa.setDescrizione("Borsa Blu");
        chiavi.setDescrizione("Chiavi dell'ufficio");
        borsa.setPosizione(new Posizione(0, 6, 8));
        chiavi.setPosizione(new Posizione(0, 2, 1));
        c.aggiungiAggiorna(borsa, chiavi);

        System.out.println(c);

        // Simula l'eliminazione
        c.elimina(borsa);
        System.out.println(c);

        Tag telefono = new Tag();
        telefono.setDescrizione("Iphone 19");
        watch.setDescrizione("Apple watch");
        c.aggiungiAggiorna(telefono, watch);

        System.out.println(c);

        telefono.setDescrizione("Iphone 13");
        telefono.setPosizione(new Posizione(2,0,1));
        c.aggiungiAggiorna(telefono);

        System.out.println(c);

        Tag[] vicini = c.vicini(3);
        System.out.println("Oggetti entro 3m: ");

        int i = 0;
        while (i < vicini.length) {
            Tag t = vicini[i];
            if (t != null)
                System.out.println(t);
            i++;
        }

        System.out.println("Finito!");
    }
}