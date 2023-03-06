package Sem2;

public class Rectangle extends Fig{
    // private int a;
    // private int b;
    public Rectangle(int a, int b){
        super.a = a;
        super.b = b;
    }
    public Rectangle(){
        this(2, 4);
    }
    @Override
    double Perimeter() {
        return (super.a+super.b)*2;
    }
    @Override
    double Square() {
        return super.a*super.b;
    }
}
