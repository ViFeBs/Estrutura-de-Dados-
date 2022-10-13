import java.util.LinkedList;

public class ControleAeroporto extends Fila {
   private LinkedList<Aviao> fila;
   
   public ControleAeroporto() {
        fila = new LinkedList<>();
    }

    @Override
    public void list(){
        for(int i = 0; i < fila.size(); i++){
            System.out.println(i+"º: " + fila.get(i).getNome());
        }
    }
}
