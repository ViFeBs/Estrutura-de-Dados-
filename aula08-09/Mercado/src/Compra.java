public class Compra {
    private int item;
    private String desc;
    private double qtd;
    private double preco;

    public Compra() {}

    public Compra(int item, String desc, double qtd, double preco) {
        this.item = item;
        this.desc = desc;
        this.qtd = qtd;
        this.preco = preco;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getQtd() {
        return qtd;
    }

    public void setQtd(double qtd) {
        this.qtd = qtd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void imprimir(){
        System.out.println("item: " + item + " Descricao: " + desc + " Quantidade: " + qtd + " Preço: " + preco);
    }
}
