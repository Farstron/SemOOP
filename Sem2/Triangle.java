package Sem2;

public class Triangle extends Fig{
    // private int a;
    // private int b;
    // private int c;
    public Triangle(int a, int b, int c){
        super.a=a;
        super.b=b;
        super.c=c;
    }
    public Triangle(){
        this(3, 3, 2);
    }
    @Override
    double Perimeter() {
        return super.a+super.b+super.c;
    }

    @Override
    double Square() {
        return Math.sqrt(Perimeter()/2*(Perimeter()/2-super.a)*(Perimeter()/2-super.b)*(Perimeter()/2-super.c));
    }
    
}
