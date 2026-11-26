package agh.po.symulator;

public class Pozycja {
    private double x;
    private double y;

    //tu ustawiam pozycje poczatkowa
    public Pozycja(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public void aktualizujPozycję(double deltaX, double deltaY){
        this.x+= deltaX;
        this.y+= deltaY;
    }
    //musze dodac metode przeniesc(dt, V, cel) wykonujaca 1 krok w kierunku celu
    public Pozycja move(double dt, double v, Pozycja cel){
        if (cel == null){
            throw new IllegalArgumentException("cel nie moze byc null");
        }
        if(dt < 0){
            throw new IllegalArgumentException("dt nie moga byc ujemne");
        }
        double dx = cel.x - this.x;
        double dy = cel.y - this.y;
        double dystans = Math.hypot(dx, dy);

        if (dystans == 0.0 || v == 0.0 || dt == 0.0){
            return this;
        }

        double krok = v * dt;

        if (krok >= dystans) {
            this.x = cel.x;
            this.y = cel.y;
        } else {
            this.x += (dx / dystans) * krok;
            this.y += (dy / dystans) * krok;
        }
        return this;

    }

    public String getPozycja(){
        return "(" + this.x + ","+ this.y + ")";
    }
}
