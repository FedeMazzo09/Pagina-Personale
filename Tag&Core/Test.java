public class Test{
    public static void main(String args[]){
        Core c = new Core();
        System.out.println(c);

        Tag borsa = new Tag();
        borsa.setDescrizione("Borsa");
        Tag chiavi = new Tag();
        chiavi.setDescrizione("Chiavi");

        
        c.aggiungiAggiorna(borsa);
        c.aggiungiAggiorna(chiavi);
        System.out.println(c);      

        borsa.setDescrizione("Borsa Blu");
        c.aggiungiAggiorna(borsa);
        
        System.out.println(c);

        c.elimina(borsa);
        System.out.println(c);

        Tag telefono = new Tag();
        telefono.setDescrizione("Iphone 19");
        c.aggiungiAggiorna(telefono);

        System.out.println(c);

        System.out.println("Finito!");
    }
}