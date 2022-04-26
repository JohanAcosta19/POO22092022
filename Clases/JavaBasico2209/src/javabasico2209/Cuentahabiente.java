/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico2209;

/**
 *
 * @author johanacosta19
 */
public class Cuentahabiente {
    
    private int idCuentahabiente;
    private String nombre;
    private float balance;

    public Cuentahabiente() {
    }

    public Cuentahabiente(int idCuentahabiente, String nombre, float balance) {
        this.idCuentahabiente = idCuentahabiente;
        this.nombre = nombre;
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getIdCuentahabiente() {
        return idCuentahabiente;
    }

    public void setIdCuentahabiente(int idCuentahabiente) {
        this.idCuentahabiente = idCuentahabiente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cuentahabiente{" + "idCuentahabiente=" + idCuentahabiente + ", nombre=" + nombre + ", balance=" + balance + '}';
    }
    
    public void retirarDinero(float monto){
       balance= balance - monto;
     
    }
    public String evaluarNivelCliente(){
        return this.balance < 50000.0f?"Regular":"Premium";
        
    
    }
}
