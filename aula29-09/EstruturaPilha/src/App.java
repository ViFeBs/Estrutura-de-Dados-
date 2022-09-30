public class App {

    /*Escreva um programa em java usando uma Pilha, que inverte as letras de cada palavra de um
    texto terminado por ponto (.) preservando a ordem das palavras. Por exemplo, dado o
    texto:
    ESTE EXERCICIO E MUITO FACIL. 
    A saıda deve ser:
    ETSE OICICREXE E OTIUM LICAF */
    public static void main(String[] args) throws Exception {
        Pilha p = new Pilha();
        String a = "ESTE EXERCICIO E MUITO FACIL";
        String linha = "";
        String[] texto = a.split(" ");

        for(int i = 0; i < texto.length; i++){
            for(int j = 0; j < texto[i].length(); j++){
                p.push(texto[i].charAt(j));
            }
            int tam = p.tamanho();
            for(int f = 0; f < tam; f++){
                linha += p.pop();
            }
            linha += " ";
        }

        
        //p.listar();
        System.out.println(linha);
    }
}
