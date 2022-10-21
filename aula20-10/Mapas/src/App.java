public class App {
    public static void main(String[] args) throws Exception {
        Estado oUF = new Estado("SP", "São Paulo");
        Estado oUF2 = new Estado("RJ", "Rio de Janeiro");
        Estado oUF3 = new Estado("ES", "Espírito Santos");
        Estado oUF4 = new Estado("AM", "Amazonas");
        Estado oUF5 = new Estado("MG", "Minas Gerais");

        MapaEstado oT = new MapaEstado();
        oT.inserirEstado(oUF.getSigla(), oUF);
        oT.inserirEstado(oUF2.getSigla(), oUF2);
        oT.inserirEstado(oUF3.getSigla(), oUF3);
        oT.inserirEstado(oUF4.getSigla(), oUF4);
        oT.inserirEstado(oUF5.getSigla(), oUF5);
        oT.consultarEstado("SP");
        oT.removerEstado(oUF3.getSigla()); 
        //oUF.mostrarEstado();
        oT.listarEstado();
    }
}
