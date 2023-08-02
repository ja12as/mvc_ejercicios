
package ejerciciolibro;

import service.BookService;

public class EjercicioLibro {

    public static void main(String[] args) {
       BookService servicioLibro = new BookService();
       servicioLibro.cargarLibro();
       servicioLibro.mostrarLibro();
    }
    
}
