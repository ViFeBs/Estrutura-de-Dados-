public class Venda {
    private double matrizvenda[][] = new double[4][4]; 
    private int vendedor[] = {12,14,15,16};
    private String nome[]  = {"Ricardo","Vivi","Victor","Jose"};
    private double vendas[] = new double[4];
    
    public void carregarMapaVenda() {
        for(int i = 0 ; i<matrizvenda.length;i++)
        {
            for(int j = 0 ; j<matrizvenda[0].length;j++)
            {
                matrizvenda[i][j] = (Math.random()*3000);
            }
        
        }       
    }
    
    public void mostrarMapaVenda() {
        String linha ="";
            
        for(int i = 0 ; i<matrizvenda.length;i++)
        {
            for(int j = 0 ; j<matrizvenda[0].length;j++)
            {
                linha = linha +"\t"+ matrizvenda[i][j];
            }
            System.out.println(vendedor[i]+"\t"+linha);
            linha = "";
        }
    }
    
    public void emitirRelatorio(int tipo){
    
        double total = 0;
            
        for(int i = 0 ; i<matrizvenda.length;i++)
        {
            for(int j = 0 ; j<matrizvenda[0].length;j++)
            {
                total+=matrizvenda[i][j];
            }
            vendas[i]= total;

            if(tipo==0)
                System.out.println(vendedor[i]+"\t"+vendas[i]);
            else
                System.out.println(nome[i]+"\t"+vendas[i]);
            
            total = 0; 
        }
    }
    
    public int mostrarVenda(int p){
        double aux = 0;
        int indice = 0;
        
        for(int i = 0 ; i<vendas.length;i++)
        {
            if(i==0) 
                 aux = vendas[i];
            
            if(p==10)
            {
                if( aux<vendas[i]){
                    indice = i;
                     aux = vendas[i];
                }
            }
            else
            {
                 if( aux>vendas[i]){
                    indice = i;
                     aux = vendas[i];
                }
            }
        }        
        
        return vendedor[indice];
    }
}
