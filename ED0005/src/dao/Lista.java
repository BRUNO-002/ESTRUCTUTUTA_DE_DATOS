
package dao;

import dto.Nodo;

public class Lista {
    private Nodo raiz;
    private Nodo ultimo;
    
    public Lista(){
        raiz=null;
        ultimo=null;
    }
    
    public void agregar(Nodo p){
        if(raiz==null){
            raiz=ultimo=p;
        }else{
            ultimo.setSig(p);
            ultimo=p;
        }
    }
    public void leer(){
        Nodo p=raiz;
        while(p!=null){
            System.out.println(p.getDato());
            p=p.getSig();
        }
    }
}
