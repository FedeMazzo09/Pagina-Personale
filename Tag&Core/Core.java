public class Core {
    private Tag[] tags;
    private Posizione corrente;
    private int count;

    public Core(Posizione corrente) {
        this.corrente = corrente;
        this.tags = new Tag[100];
        this.count = 0;
    }

    public Posizione getPosizione() {
        return corrente;
    }

    private int trovaTag(int codice) {
        for (int i = 0; i < count; i++) {
            if (tags[i].getCodice() == codice) {
                return i;
            }
        }
        return -1;
    }

    public void aggiungiAggiorna(Tag t) {
        int i = trovaTag(t.getCodice());
        if (i == -1) {
            aggiungi(t);
        } else {
            aggiorna(t);
        }
    }

    public void aggiungi(Tag t) {
        if (count < tags.length) {
            tags[count] = t;
            count++;
        } else {
            System.out.println("Array pieno! Impossibile aggiungere nuovi Tag.");
        }
    }

    public void aggiorna(Tag t) {
        int i = trovaTag(t.getCodice());
        if (i != -1) {
            tags[i].setDistanza(t.getDistanza());
            tags[i].setPosizione(t.getPosizione());
        } else {
            System.out.println("Tag non trovato, impossibile aggiornare!");
        }
    }

    public Tag[] elenco() {
        Tag[] lista = new Tag[count];
        for (int i = 0; i < count; i++) {
            lista[i] = tags[i];
        }
        return lista;
    }

    public void elimina(int codice) {
        int i = trovaTag(codice);
        if (i != -1) {
            for (int j = i; j < count - 1; j++) {
                tags[j] = tags[j + 1];
            }
            tags[count - 1] = null;
            count--;
        } else {
            System.out.println("Tag non trovato, impossibile eliminare!");
        }
    }

    public Tag[] vicini(float distanzaMax) {
        int c = 0;
        for (int i = 0; i < count; i++) {
            if (tags[i].getPosizione().distanzaDa(corrente) <= distanzaMax) {
                c++;
            }
        }
        Tag[] vicini = new Tag[c];
        int j = 0;
        for (int i = 0; i < count; i++) {
            if (tags[i].getPosizione().distanzaDa(corrente) <= distanzaMax) {
                vicini[j++] = tags[i];
            }
        }
        return vicini;
    }
}
