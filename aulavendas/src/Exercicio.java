import java.util.Random;
public class Exercicio {
    private int[][] m = new int[4][4];
    private int[] v = {0,3,1,3,3,2,1,0};
    private Random r = new Random();
    
    public void carregaMatriz(){
        for(int i = 0 ; i<m.length;i++)
        {
            for(int j = 0 ; j<m[0].length;j++)
            {
                m[i][j] = r.nextInt();
            }
        
        }       
    }

    public int calculaMatriz(){
        int soma = 0;
        for(int i = 0; i < v.length - 1;i++){
            soma += m[v[i]][v[i+1]];
        }
        return soma;
    }

    public void mostraMatriz(){
        String linha ="";
        for(int i = 0 ; i<m.length;i++)
        {
            for(int j = 0 ; j<m[0].length;j++)
            {
                linha = linha +"\t"+ m[i][j];
            }
            System.out.println(linha);
        } 
    }
}
