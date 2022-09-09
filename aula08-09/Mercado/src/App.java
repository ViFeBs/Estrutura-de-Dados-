public class App {
    public static void main(String[] args) throws Exception {
        Compra cm1 = new Compra(2,"Cafe",2,18.80);
        Compra cm2 = new Compra(3,"Leite",4,45);
        Compra cm3 = new Compra(1,"Açucar", 2, 12.50);

        ListaCompra lstCompra = new ListaCompra();
        lstCompra.inserirItem(cm1,0);
        lstCompra.inserirItem(cm2,1);
        lstCompra.inserirItem(cm3,2);

        lstCompra.imprimir();

        System.out.println(lstCompra.pesquisaItem(2));

        lstCompra.removerItem(2);

        lstCompra.imprimir();

        lstCompra.computaCompra();

    }
}
