package Sem2;

public class Sem {
    public static void main(String[] args) {
        Fig tr = new Triangle();
        System.out.println(tr.Perimeter());
        System.out.println(tr.Square());
        Fig re = new Rectangle();
        System.out.println(re.Perimeter());
        System.out.println(re.Square());
        Fig ro = new Сircle();
        System.out.println(ro.Perimeter());
        System.out.println(ro.Square());
        Fig sq = new SquareF();
        System.out.println(sq.Perimeter());
        System.out.println(sq.Square());
    }
}
