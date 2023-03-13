package Sem4;

public class JSONObj {
    StringBuffer JSONStor;
    public JSONObj(){
        this.JSONStor = new StringBuffer();
    }
    public <E> void convert (E obj){
        if (obj instanceof Bike){
            Bike bike = (Bike)obj;
            String[] fields ={"\"ID\"","\"Владелец\"","\"Цвет\"","\"Модель\"",String.format("%d",bike.ID), "\""+bike.user+"\"", "\""+bike.color+"\"", "\""+bike.model+"\""};
            JSONStor.append("{\n");
            for (int i = 0; i<4;i++){
                JSONStor.append(String.format("%s : %s,\n", fields[i], fields[i+4]));
            }
            JSONStor.append("},\n");
        }
        if (obj instanceof Integer){
            JSONStor.append(obj+",\n");
        }
        if (obj instanceof String){
            JSONStor.append("\""+obj+"\""+",\n");
        }
    }
    @Override
    public String toString() {
        return JSONStor.toString();
    }
}
