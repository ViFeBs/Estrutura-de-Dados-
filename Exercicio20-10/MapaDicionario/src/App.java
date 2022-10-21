public class App {
    public static void main(String[] args) throws Exception {
        Palavra p1 = new Palavra("Amor", "Paixão");
        Palavra p2 = new Palavra("Amor", "Paixão");
        Palavra p3 = new Palavra("Fogo", "Reação Quimica, Chama");
        Palavra p4 = new Palavra("Sol", "Fogo, Calor, Estrela");

        Dicionario d1 = new Dicionario();

        d1.inserirPalavra(p1.getPalavra(), p1);
        d1.inserirPalavra(p2.getPalavra(), p2);
        d1.inserirPalavra(p3.getPalavra(), p3);
        d1.inserirPalavra(p4.getPalavra(), p4);

        d1.listarPalavras();
    }
}
