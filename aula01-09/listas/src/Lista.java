public class Lista {
    private int[] valores;
    private int tamanho;


    public Lista(int tamanho) {
        this.tamanho = tamanho;
        valores = new int[tamanho];
    }

    public int encontre(int valor){
        for(int i = 0; i < valores.length; i++){
            if(valores[i] == valor) return i;
        }
        return -1;
    }

    public int insere(int valor, int pos){
        if(pos >= 0 && pos < valores.length){
            valores[pos] = valor;
            return valor;
        }
        else return -1;
    }

    public boolean vazia(){
        for(int i = 0; i < valores.length; i++){
            if(valores[i] > 0){
                return false;
            }
        }
        return true  ;
    }

    public void percorre(){
        for(int i = 0; i < valores.length; i++){
            if(valores[i] > 0){
                System.out.println(valores[i] + "\n");
            }
        }
    }
    
    public int remove(int pos){
        int valor;
        if(pos > 0 && pos < valores.length){
            valor = valores[pos];
            valores[pos] = 0;
            return valor;
        }
        else return -1;
    }

}
