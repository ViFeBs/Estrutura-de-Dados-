public class App {
    public static void main(String[] args) throws Exception {
        //Exercicio Avioes
        Fila f = new Fila();
        //ControleAeroporto ae = new ControleAeroporto();
        Aviao a1 =new Aviao("Boing227", 5, "Gol");
        Aviao a2 =new Aviao("Boing228", 557, "Azul");
        Aviao a3 =new Aviao("Boing222", 4799, "Tam");
        Aviao a4 =new Aviao("Boing2290", 578, "Gol");

        f.inQueue(a1);
        f.inQueue(a2);
        f.inQueue(a3);
        f.inQueue(a4);

        //ae.inQueue(a1);
        //ae.inQueue(a2);
        //ae.inQueue(a3);
        //ae.inQueue(a4);
        //a
        f.size();

        //b
        f.deQueue();

        //c
        f.inQueue(new Aviao("Boinf221", 894, "Latam"));

        //d
        /* 
        for(int i = 0; i < f.size(); i++){
            System.out.println(f.deQueue());
        }
        */
        
        //e
        for(int i = 0; i < f.size(); i++){
            System.out.println(f.deQueue());
        }
    }
}
