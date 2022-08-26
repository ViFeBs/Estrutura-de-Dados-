public class App {
    public static void main(String[] args) throws Exception {
        Exercicio e = new Exercicio();
        e.carregaMatriz();
        System.out.println(e.calculaMatriz());
        e.mostraMatriz();
    }
}
