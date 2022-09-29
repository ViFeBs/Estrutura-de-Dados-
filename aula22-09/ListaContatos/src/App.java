import model.Contato;
import model.LinkedListContato;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedListContato listContato = new LinkedListContato();
        Contato c1 = new Contato("Bruno", "bruno@hotmail.com");
        Contato c2 = new Contato("Natan", "natan@hotmail.com"); 
        Contato c3 = new Contato("David", "david@hotmail.com"); 
        Contato c4 = new Contato("José", "jose@hotmail.com");
        Contato c5 = new Contato("Bruno", "bruno@hotmail.com");
        
        //incluir
        listContato.incluir(true, c1);
        listContato.incluir(true, c2);
        listContato.incluir(false, c3);
        listContato.incluir(false, c4);
        listContato.incluir(true, c5);

        listContato.excluir(true);
        listContato.excluir(false);

        listContato.consulta(true);

        //listContato.relatorio();
    }
}
