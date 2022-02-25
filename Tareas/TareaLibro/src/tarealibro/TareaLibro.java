/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarealibro;

import Libro.Libro;

/**
 *
 * @author johanacosta19
 */
public class TareaLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro libro1 = new Libro();
        libro1.setTitulo("Principito");
        System.out.println("Titulo: " +libro1.getTitulo() );
        libro1.setGenero("Novela corta");
        System.out.println("Genero: " +libro1.getGenero() );
        libro1.setEdicion("1");
        System.out.println("Edicion: " +libro1.getEdicion() );
        libro1.setEditorial("Salamandra");
        System.out.println("Editorial: " +libro1.getEditorial() );
    }
    
}
