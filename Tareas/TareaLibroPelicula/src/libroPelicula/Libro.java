/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libroPelicula;

import clases.Autor;
import clases.Editorial;

/**
 *
 * @author johanacosta19
 */
public class Libro {
    private String nombreLibro;
    private Autor creador;
    private Editorial distribuidora;

    public Libro() {
        creador = new Autor();
        distribuidora = new Editorial();
    }

    public Libro(String nombreLibro, Autor creador, Editorial distribuidora) {
        this.nombreLibro = nombreLibro;
        this.creador = creador;
        this.distribuidora = distribuidora;
    }

    public Editorial getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(Editorial distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public Autor getCreador() {
        return creador;
    }

    public void setCreador(Autor creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombreLibro=" + nombreLibro + ", creador=" + creador + ", distribuidora=" + distribuidora + '}';
    }
    public void estar(){
        System.out.println("El libro "+ this.nombreLibro + "esta siendo un exito");
    }
    
}
