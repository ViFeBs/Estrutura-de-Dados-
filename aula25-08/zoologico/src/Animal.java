public class Animal {
    private String nome;
    private int tipo;
    private double massa,velocidade;
 
    public Animal() {}
    public Animal(String nome, int tipo, double massa, double velocidade)
    {
        this.nome = nome;
        this.tipo = tipo;
        this.massa = massa;
        this.velocidade = velocidade;
    }  
    
    public void imprimir(){
        System.out.println(nome+"\n"+tipo+"\n"+massa+"\n"+velocidade);
    }
    public String getNome() { return nome;}

    public int getTipo() { return tipo; }

    public double getMassa() { return massa; }
    
    public void setMassa(double massa) {  this.massa = massa; }
}
