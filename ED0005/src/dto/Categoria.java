
package dto;

public class Categoria {
    private int codiCate;
    private String nombreCate;
    private Categoria sig;

    public Categoria(int codiCate, String nombreCate, Categoria sig) {
        this.codiCate = codiCate;
        this.nombreCate = nombreCate;
        this.sig = sig;
    }
    public Categoria(){
        
    }

    public int getCodiCate() {
        return codiCate;
    }

    public void setCodiCate(int codiCate) {
        this.codiCate = codiCate;
    }

    public String getNombreCate() {
        return nombreCate;
    }

    public void setNombreCate(String nombreCate) {
        this.nombreCate = nombreCate;
    }

    public Categoria getSig() {
        return sig;
    }

    public void setSig(Categoria sig) {
        this.sig = sig;
    }
    
}
