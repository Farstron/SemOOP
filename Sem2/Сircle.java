package Sem2;

public class Сircle extends Fig{
    private int r;
    public Сircle(int r){
        this.r = r;
    }
    public Сircle(){
        this(2);
    }
    @Override
    double Perimeter() {
        return 2*Math.PI*r;
    }
    @Override
    double Square() {
        return Math.PI*r*r;
    }
}
