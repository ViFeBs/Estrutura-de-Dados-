public class Aviao {
    private String nome;
    private int id;
    private String compania;

    public Aviao(String nome, int id, String compania) {
        this.nome = nome;
        this.id = id;
        this.compania = compania;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }        
}
