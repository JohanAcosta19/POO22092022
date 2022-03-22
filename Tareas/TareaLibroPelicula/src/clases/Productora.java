/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author johanacosta19
 */
public class Productora {
    private String nombre;
    private int noPeliculas;

    public Productora() {
    }

    public Productora(String nombre, int noPeliculas) {
        this.nombre = nombre;
        this.noPeliculas = noPeliculas;
    }

    public int getNoPeliculas() {
        return noPeliculas;
    }

    public void setNoPeliculas(int noPeliculas) {
        this.noPeliculas = noPeliculas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Productora{" + "nombre=" + nombre + ", noPeliculas=" + noPeliculas + '}';
    }
    
    
}
