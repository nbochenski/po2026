package agh.po.symulator;

public class Pozycja {
    private double x;
    private double y;

    //tu ustawiam pozycje poczatkowa
    public Pozycja(double x, double y){
        this.x = x;
        this.y = y;
    }
    //
    public void aktualizujPozycję(double deltaX, double deltaY){
        this.x+= deltaX;
        this.y+= deltaY;
    }

    public String getPozycja(){
        return "(" + this.x + ","+ this.y + ")";
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
