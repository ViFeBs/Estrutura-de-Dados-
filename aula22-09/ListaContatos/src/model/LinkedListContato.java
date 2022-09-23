package model;

import java.util.LinkedList;

public class LinkedListContato {
    private LinkedList<Contato> lstContato;

    public LinkedListContato() {
        lstContato = new LinkedList<>();
    }

    public void incluir(Boolean p, Contato c){
        if(p)  
            lstContato.addFirst(c);
        else
            lstContato.addLast(c);
    }

    public Contato excluir(Boolean p){
        Contato c = null;
        if(p)
            c = lstContato.removeFirst();
        else    
            c = lstContato.removeLast();
        return c;
    }

    public void relatorio(){
        for(int i = lstContato.size() - 1; i >= 0; i--){
            System.out.println(lstContato.get(i).toString());
        }
    }

    public void consulta(Boolean p){
        if(p)
            System.out.println(lstContato.getFirst().toString());
        else
            System.out.println(lstContato.getLast().toString());
    }
}
