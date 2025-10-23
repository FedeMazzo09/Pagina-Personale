public class Posizione{
    
    private float x;
    private float y;
    private float z;

    public Posizione(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Posizione (){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public double distanzaDa(Posizione p){
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2) + Math.pow(this.z - p.z, 2));
    }

}