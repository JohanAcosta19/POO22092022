/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarealibropelicula;

import clases.Director;
import clases.Editorial;
import clases.Productora;
import libro.Autor;
import libroPelicula.Libro;
import libroPelicula.Pelicula;

/**
 *
 * @author johanacosta19
 */
public class TareaLibroPelicula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public void redactar(){
        Libro libro1 = new Libro();
        libro1.setNombreLibro("Veinte mil leguas de viaje submarino");
        libro1.setCreador(new clases.Autor("Julio Verne", "Frances"));
        libro1.setDistribuidora(new Editorial("Hetzel", 1869));
        System.out.println(libro1);
        
        Pelicula peli1 = new Pelicula();
        peli1.setNombrePelicula("Spiderman");
        peli1.setRealizador(new Director("Sam Raimi", 12));
        peli1.setCompania(new Productora("Columbia Pictures", 20));
        System.out.println(peli1);
        
    }
    
}
