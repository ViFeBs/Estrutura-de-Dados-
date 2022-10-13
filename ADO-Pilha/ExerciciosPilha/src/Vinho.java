public class Vinho {
    private String nome;
    private String safra;

    public Vinho(){}

    public Vinho(String nome, String safra) {
        this.nome = nome;
        this.safra = safra;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSafra() {
        return safra;
    }
    public void setSafra(String safra) {
        this.safra = safra;
    }

    @Override
    public String toString() {
        return "Vinho [nome=" + nome + ", safra=" + safra + "]";
    }    

    
}
