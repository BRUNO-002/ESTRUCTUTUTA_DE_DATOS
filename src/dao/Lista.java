
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
    public void eliminarFinal(){
        if(raiz==null){
            System.out.println("La lista está vacia, no hay nada que eliminar");
        }else if(raiz.getSig()==null){
            raiz=null;
            ultimo=null;
            System.out.println("El ultimo nodo ha sido eliminado, la lista ahora esta vacia");
        }else{
            Nodo actual=raiz;
            while(actual.getSig().getSig()!=null){
                actual=actual.getSig();
            }
            actual.setSig(null);
            ultimo=actual;
            System.out.println("El ultimo nodo ha sido eliminado");
        }
    }
}
