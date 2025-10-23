public class Tag{
    
    private int codiceUnivoco;
    private String descrizione;
    private Posizione posizione;
   
    private static int counter = 0;

    public Tag(){
        this.codiceUnivoco = counter++;
    }

    //Set Descrizione
    public void setDescrizione(String descrizione){
        this.descrizione = descrizione;
    }

    //get CodiceUnivoco
    public int getCodiceUnivoco(){
        return this.codiceUnivoco;
    }

    // getPosizione
    public Posizione getPosizione(){
        return this.posizione;
    }

    public String toString(){
        return "Tag[CodiceUnivoco: " + this.codiceUnivoco + ", Descrizione: " + this.descrizione + "]";
    }

}