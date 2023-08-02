
package service;

import entidad.Libro;
import java.util.Scanner;

public class BookService {
        Scanner leer = new Scanner(System.in);
        Libro librouno = new Libro();
// metodo cargar libro
    public  Libro cargarLibro(){
    
        
        System.out.println("Ingrese los datos del libro");
        System.out.println("----------------------------------------");
        System.out.println("Ingrese su ISBM");
        librouno.setIsbm(leer.nextInt());
        System.out.println("Ingrese el título del libro");
        librouno.setTitulo(leer.nextLine());
        leer.next();
        System.out.println("Ingrese el autor del libro");
        librouno.setAutor(leer.nextLine());
        leer.next();
        System.out.println("Ingrese el número de páginas del libro");
        librouno.setNum(leer.nextInt());
        
        
        return null;
    }
// metodo mostar libro
    public Libro mostrarLibro(){
        System.out.println(" ");
        System.out.println("Los datos del libro son: ");
        System.out.println("---------------------------------------");
        System.out.println("El ISBM del libro es: " + librouno.getIsbm());
        System.out.println("El título del libro es: " + librouno.getTitulo());
        System.out.println("El autor del libro es: " + librouno.getAutor());
        System.out.println("El número de páginas es: " + librouno.getNum());
        return null;
    }
}
