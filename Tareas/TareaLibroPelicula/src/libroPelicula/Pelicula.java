/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libroPelicula;

import clases.Director;
import clases.Productora;

/**
 *
 * @author johanacosta19
 */
public class Pelicula {
    private String nombrePelicula;
    private Director realizador;
    private Productora compania;

    public Pelicula() {
        realizador = new Director();
        compania = new Productora();
    }

    public Pelicula(String nombrePelicula, Director realizador, Productora compania) {
        this.nombrePelicula = nombrePelicula;
        this.realizador = realizador;
        this.compania = compania;
    }

    public Productora getCompania() {
        return compania;
    }

    public void setCompania(Productora compania) {
        this.compania = compania;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public Director getRealizador() {
        return realizador;
    }

    public void setRealizador(Director realizador) {
        this.realizador = realizador;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombrePelicula=" + nombrePelicula + ", realizador=" + realizador + ", compania=" + compania + '}';
    }
    public void ganar(){
        System.out.println("La pelicula "+ this.nombrePelicula + "esta ganando muchos premios");
    }
    
}
