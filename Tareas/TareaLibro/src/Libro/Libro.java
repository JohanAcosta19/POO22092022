/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libro;

/**
 *
 * @author johanacosta19
 */
public class Libro {
    private String Titulo;
    private String Genero;
    private String Edicion;
    private String Editorial;
    private int Paginas;

    public Libro() {
    }

    public Libro(String Titulo, String Genero, String Edicion, String Editorial, int Paginas) {
        this.Titulo = Titulo;
        this.Genero = Genero;
        this.Edicion = Edicion;
        this.Editorial = Editorial;
        this.Paginas = Paginas;
    }

    public int getPaginas() {
        return Paginas;
    }

    public void setPaginas(int Paginas) {
        this.Paginas = Paginas;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getEdicion() {
        return Edicion;
    }

    public void setEdicion(String Edicion) {
        this.Edicion = Edicion;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }
    
    public void buscando(){
    System.out.println(" Se esta buscando la p{agina " + this.Paginas + " del libro");
    }
    public void leyendo(){
    System.out.println(" Se esta leyendo la pagina " + this.Paginas + " del libro");
    }
}

