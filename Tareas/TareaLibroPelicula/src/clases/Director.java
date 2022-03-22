/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author johanacosta19
 */
public class Director {
    private String nombre;
    private int noPremios;

    public Director() {
    }

    public Director(String nombre, int noPremios) {
        this.nombre = nombre;
        this.noPremios = noPremios;
    }

    public int getNoPremios() {
        return noPremios;
    }

    public void setNoPremios(int noPremios) {
        this.noPremios = noPremios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Director{" + "nombre=" + nombre + ", noPremios=" + noPremios + '}';
    }
    
    
}
