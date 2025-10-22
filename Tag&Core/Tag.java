public class Tag {
    private int codice;
    private String descrizione;
    private float distanza;
    private Posizione posizione;
    private int counter = 0;

    Tag(String descrizione, float distanza, Posizione posizione) {
        this.descrizione = descrizione;
        this.distanza = distanza;
        this.posizione = posizione;
    }

    public void codice(){
        this.codice = counter;
        counter++;
    }

    public int getCodice() {
        return codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public float getDistanza() {
        return distanza;
    }

    public Posizione getPosizione() {
        return posizione;
    }

    public void setDistanza(float distanza) {
        this.distanza = distanza;
    }

    public void setPosizione(Posizione posizione) {
        this.posizione = posizione;
    }

    public String toString() {
        return "Tag [codice=" + codice + ", descrizione=" + descrizione +
               ", distanza=" + distanza + ", posizione=" + posizione + "]";
    }
}
