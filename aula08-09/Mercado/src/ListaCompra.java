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

    public void removerItem(int item){
        lstCompra.remove(pesquisaItem(item));
    }

    public int pesquisaItem(int item){
        int achado = -1;
        for(int i = 0; i < lstCompra.size(); i++){
            if(lstCompra.get(i).getItem() == item){
                achado = i;
                return achado;
            }
            
        }
        return achado;
    }

    public double computaCompra(){
        double total = 0, valor =  0, qtde = 0;
        for(int i = 0; i < lstCompra.size(); i++){
            valor += lstCompra.get(i).getPreco();
            qtde += lstCompra.get(i).getQtd();
        }

        total = valor + qtde;
        System.out.println("Calculo de tudo: " + total + " Total Valor da Compra: " + valor + " Quantidade de Produtos comprados: " + qtde);

        return total;
    }

}
