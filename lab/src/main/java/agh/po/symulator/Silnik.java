package agh.po.symulator;

public class Silnik extends Komponent{
    private int maxObroty;
    private int obroty;

    public Silnik(String producent, String model, int maxObroty) {
        super(producent, model);
        this.maxObroty = maxObroty;
        this.obroty = 0;
    }

    public void uruchom() {
        this.obroty = 200;
    }
    public void zatrzymaj() {
        this.obroty = 0;
    }
    public int getObroty() {
        return obroty;
    }
    public void ustawObroty(int noweObroty) {
        if(noweObroty < 0){
            this.obroty = 0;
        } else if(noweObroty > maxObroty) {
            this.obroty = maxObroty;
        } else{
            this.obroty = noweObroty;
        }
    }
    public void zwiekszObroty(int delta){
        ustawObroty(this.obroty + delta);
    }
    public void zmniejszObroty(int delta){
        ustawObroty(this.obroty - delta);
    }
}
