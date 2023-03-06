package Sem2;

public class Triangle extends Fig{
    private int a;
    private int b;
    private int c;
    public Triangle(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public Triangle(){
        this(3, 3, 2);
    }
    @Override
    double Perimeter() {
        return a+b+c;
    }

    @Override
    double Square() {
        return Math.sqrt(Perimeter()/2*(Perimeter()-a)*(Perimeter()-b)*(Perimeter()-c));
    }
    
}
