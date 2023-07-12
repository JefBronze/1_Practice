package pack;

public class Cercle extends Conique {

    private double r;

    public Cercle(double r) {
        setRayon(r);
    }

    public void setRayon(double rayon) {
        if (rayon > 0) {
            this.r = rayon;
            this.sah = rayon;
            this.sav = rayon;
        }
    }

    @Override
    public double getSAH() {
        return this.r;
    }

    @Override
    public double getSAV() {
        return this.r;
    }
}
