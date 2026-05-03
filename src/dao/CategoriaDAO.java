
package dao;
import dto.Categoria;
public class CategoriaDAO {
    private Categoria raiz;
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
}
