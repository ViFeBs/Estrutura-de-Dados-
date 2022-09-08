import java.util.ArrayList;


public class ListaCompra {
    private ArrayList<Compra> lstCompra;

    public ListaCompra(){
        lstCompra = new ArrayList<Compra>();
    }

    public void inserirItem(Compra c, int index){
        lstCompra.add(index, c);
    }

    public void imprimir(){
        for(int i = 0; i < lstCompra.size(); i++){
            lstCompra.get(i).imprimir();
        }
    }
}
