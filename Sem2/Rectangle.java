package Sem2;

public class Rectangle extends Fig{
    private int a;
    private int b;
    public Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }
    public Rectangle(){
        this(2, 4);
    }
    @Override
    double Perimeter() {
        return (a+b)*2;
    }
    @Override
    double Square() {
        return a*b;
    }
}
