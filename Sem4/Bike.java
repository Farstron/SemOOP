package Sem4;

public class Bike {
    protected String user;
    protected String color;
    protected String model;
    protected int ID;
    public Bike(int ID, String user, String model, String color) {
        this.ID = ID;
        this.user = user;
        this.model = model;
        this.color = color;
    }
    public Bike(){
        this(1, "user", "model", "color");
    }
}
