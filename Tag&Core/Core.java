public class Core {

    private Tag[] elenco;
    private int size;

    public Core() {
        elenco = new Tag[10];
        size = 0;
        new Posizione();
    }

    public void aggiungiAggiorna(Tag t) {
        t.aggiornaDistanza();
        int posizione = trova(t);
        if (posizione == -1) {
            aggiungi(t);
        } else {
            aggiorna(t, posizione);
        }
    }

    public void elimina(Tag t) {
        int posizione = trova(t);
        if (posizione != -1) {
            for (int i = posizione; i < size - 1; i++) {
                elenco[i] = elenco[i + 1];
            }
            elenco[size - 1] = null;
            size--;
        }
    }

    public Tag[] vicini(float distanza) {
        Tag[] vicini = new Tag[size];
        for (int i = 0; i < size; i++) {
            if (elenco[i].getDistanza() <= distanza)
                vicini[i] = elenco[i];
        }
        return vicini;
    }

    public String toString() {
        String toReturn = "Core[";
        for (int i = 0; i < size; i++) {
            toReturn += elenco[i].toString();
            if (i < size - 1)
                toReturn += ", ";
        }
        toReturn += "]";
        return toReturn;
    }

    private void aggiungi(Tag t) {
        elenco[size] = t;
        size++;
    }

    private void aggiorna(Tag t, int posizione) {
        elenco[posizione] = t;
    }

    private int trova(Tag t) {
        for (int i = 0; i < size && elenco[i].getCodiceUnivoco() <= t.getCodiceUnivoco(); i++) {
            if (elenco[i].getCodiceUnivoco() == t.getCodiceUnivoco()) {
                return i;
            }
        }
        return -1;
    }

}
