public class App {
    public static void main(String[] args) throws Exception {
        /*1-)Faça um programa que leia uma expressão com parênteses. Usando pilhas, verifique se os parênteses foram abertos e fechados na ordem correta.
        Exemplo:
        (()) OK
        ()()(()()) OK
        ()) Erro*/
        
        String expressao = "()()(()())";
        Pilha p = new Pilha();
        
        for(int i = 0; i < expressao.length();i++){
            if(expressao.charAt(i) == '('){
                p.push('(');
            }
            if(expressao.charAt(i) == ')'){
                if(p.tamanho() > 0){
                    p.pop();
                }else{
                    p.push(')');
                    break;
                }
            }
        }
        if(p.tamanho() == 0){
            System.out.println("OK");
        }else{
            System.out.println("ERRO");
        }
    }

}
