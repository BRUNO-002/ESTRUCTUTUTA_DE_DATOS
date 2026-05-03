
package dao;
import dto.Categoria;
public class CategoriaDAO {
    private Categoria raiz;//raiz es igual cabeza
    private Categoria ultimo;
    
    public void agregar(Categoria p){
        if (raiz==null) {
            raiz=ultimo=p;
        }else{
            ultimo.setSig(p);
            ultimo=p;
        }
    }
    public String leer(){
        String listado="";
        Categoria p=raiz;
        while(p!=null){
            listado+="Código: "+p.getCodiCate()+"\n"+"Nombre: "+p.getNombreCate()+"\n";
            p=p.getSig();
        }
        return listado;
    }
    public void agregarAlInicio(Categoria p){
        if(raiz==null){
            raiz=ultimo=null;
        }else{
            p.setSig(raiz);
            raiz=p;
        }
    }
    //burble short
    public void ordenarPorCodigo(){
        if(raiz==null || raiz.getSig()==null){
            return;
        }
        boolean Intercambio;
        do {            
            Intercambio=false;
            Categoria actual=raiz;
            Categoria anterior=null;
            Categoria siguiente=raiz.getSig();
            while(actual.getSig()!=null){
                if(actual.getCodiCate()>actual.getSig().getCodiCate()){
                    actual.setSig(siguiente.getSig());
                    siguiente.setSig(actual);
                    if (anterior==null) {
                        raiz=siguiente;
                    }else{
                        anterior.setSig(siguiente);
                    }
                    anterior=siguiente;
                    siguiente=actual.getSig();
                    Intercambio=true;
                }else{
                    anterior=actual;
                    actual=siguiente;
                    siguiente=siguiente.getSig();
                }
            }
        } while (Intercambio);
        Categoria temp=raiz;
        while(temp!=null && temp.getSig()!=null){
            temp=temp.getSig();
        }
        ultimo=temp;
    }
}
