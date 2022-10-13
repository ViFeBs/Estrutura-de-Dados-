import java.util.LinkedList;

public class Fila {
    private LinkedList<Object> fila;

    public Fila(){
        fila = new LinkedList<Object>();
    }

    public boolean isEmpty(){
        return fila.isEmpty()? true:false;
    }

    public int size(){
        return fila.size();
    }

    public void inQueue(Object o){
        fila.add(o);
    }

    public Object deQueue(){
        return isEmpty()?null:fila.removeFirst();
    }

    public void list(){
        for(int i = 0; i < fila.size(); i++){
            System.out.println(i+"º: " + fila.get(i));
        }
    }

    public Object first(){
        return isEmpty()?null:fila.getFirst();
    }

    public Object last(){
        return isEmpty()?null:fila.getLast();
    }

}
