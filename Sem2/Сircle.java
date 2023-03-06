package Sem2;

public class Сircle extends Fig{
    // private int r;
    public Сircle(int r){
        super.a = r;
    }
    public Сircle(){
        this(2);
    }
    public int length(int r){
        double l = (int)2*Math.PI*r;
        return (int)l;
    }
    @Override
    double Perimeter() {
        return length(super.a);
    }
    @Override
    double Square() {
        return Math.PI*super.a*super.a;
    }
}
