
package entidad;

public class Libro {
// atributos de la clase
    private int isbm;
    private String titulo;
    private String autor;
    private int num;
    
// se crea el contructor con parametro
    public Libro(int isbm, String titulo, String autor, int num) {
        this.isbm = isbm;
        this.titulo = titulo;
        this.autor = autor;
        this.num = num;
    }
// se crea contructor en vacio
    public Libro() {
        
    }
// se crea los get

    public int getIsbm() {
        return isbm;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNum() {
        return num;
    }
 // se crea los set

    public void setIsbm(int isbm) {
        this.isbm = isbm;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    
    
}
