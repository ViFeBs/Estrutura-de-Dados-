import java.util.Set;
import java.util.TreeMap;

public class Dicionario {
    TreeMap<String, Palavra> oMapa;
    public Dicionario() {
        oMapa = new TreeMap<String, Palavra>();
    }
    public void inserirPalavra(String palavra, Palavra significado) {
        oMapa.put(palavra, significado);
    }

    public void consultarPalavra(String palavra) {
        if (oMapa.get(palavra) != null)
            System.out.println(oMapa.get(palavra).toString());
        else
            System.out.println("Elemento não encontrado");
    }
    public void listarPalavras() {
        Set<String> oR = oMapa.keySet();
        Object ob[] = oR.toArray();
        for (int i = 0; i < ob.length; i++) {
            String chave = (String) (ob[i]);
            System.out.println(oMapa.get(chave).toString());
        }

    }
}
