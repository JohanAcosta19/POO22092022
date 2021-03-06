/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico2209;

/**
 *
 * @author johanacosta19
 */
public class Alumno {
    private String numeroCuenta;
    private int semestre;
    private float promedio;

    public Alumno() {
    }

    public Alumno(String numeroCuenta, int semestre, float promedio) {
        this.numeroCuenta = numeroCuenta;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    Alumno(String string, int i, int i0, float f) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "numeroCuenta=" + numeroCuenta + ", semestre=" + semestre + ", promedio=" + promedio + '}';
    }
    
    public void estudiar(int minutos){
        System.out.println("Estudiando ..." + minutos + " minutos");
    }
    
    public String evaluarDesempenio(){
        return this.promedio > 8.0f?"Sobresaliente":"Regular";
    }
}
