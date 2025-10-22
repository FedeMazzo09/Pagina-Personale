public class Test {
    public static void main(String[] args) {
        Posizione p1 = new Posizione(0, 0, 0);
        Posizione p2 = new Posizione(3, 4, 0);
        Posizione p3 = new Posizione(1, 2, 1);

        Core core = new Core(p1);

        Tag tag1 = new Tag("Portachiavi", 5.0f, p2);
        Tag tag2 = new Tag("Portafoglio", 10.0f, p3);

        core.aggiungi(tag1);
        core.aggiungi(tag2);

        System.out.println("Elenco iniziale:");
        System.out.println(tag1);
        System.out.println(tag2);

        tag1.setDistanza(3.0f);
        core.aggiorna(tag1);

        System.out.println("\nDopo aggiornamento di tag1:");
        System.out.println(tag1);
        System.out.println(tag2);

        core.elimina(tag2.getCodice());

        System.out.println("\nDopo eliminazione di tag2:");
        System.out.println(tag1);

        System.out.println("\nTag vicini (entro 5 metri):");
        System.out.println(tag1);
    }
}
