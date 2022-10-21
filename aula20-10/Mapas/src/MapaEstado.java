import java.util.Set;
import java.util.TreeMap;

public class MapaEstado {
    TreeMap<String, Estado> oMapa;
    public MapaEstado() {
        oMapa = new TreeMap<String, Estado>();
    }
    public void inserirEstado(String sigla, Estado uf) {
        oMapa.put(sigla, uf);
    }



    public void removerEstado(String sigla) {
        if (oMapa.remove(sigla) != null)
            System.out.println("Excluído com sucesso");
        else
            System.out.println("Elemento não encontrado");

    }
    public void consultarEstado(String sigla) {
        if (oMapa.get(sigla) != null)
            oMapa.get(sigla).mostrarEstado();
        else
            System.out.println("Elemento não encontrado");
    }
    public void listarEstado() {
        Set<String> oR = oMapa.keySet();
        Object ob[] = oR.toArray();
        for (int i = 0; i < ob.length; i++) {
            String chave = (String) (ob[i]);
            oMapa.get(chave).mostrarEstado();
        }

    }
}
