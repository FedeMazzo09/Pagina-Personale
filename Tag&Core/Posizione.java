public class Posizione {
    private float x;
    private float y;
    private float z;

    public Posizione() {
        x = 0;
        y = 0;
        z = 0;
    }

    public Posizione(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distanzaDa(Posizione p) {
        return Math.sqrt((p.x - x) * (p.x - x) + (p.y - y) * (p.y - y) + (p.z - z) * (p.z - z));
    }
}
