package Sem4;

public class Sem {
    public static void main(String[] args) {
        JSONObj obj = new JSONObj();
        obj.convert(new Bike());
        obj.convert(1);
        obj.convert("Hello");
        System.out.println(obj);
    }
}
