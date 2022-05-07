/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author johanacosta19
 */
public class PruebaEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int edad = 20;
                System.out.println("Edad = "+ edad);
                Integer edad2 = new Integer(22);
                System.out.println(edad2);
                double x = edad2.doubleValue();
                System.out.println(x);
                System.out.println(edad2.shortValue());
                System.out.println(",-,-,-,-,-,-,-,-,-,-,-,-,-,");
                //Convertir string a entero
                String cadena = "99";
                int altura = Integer.parseInt(cadena); //Metodo miembro
                altura += 1;
                System.out.println("Altura = "+ altura );
                
                float y= Float.parseFloat(cadena);
                y=y + 0.5f;
                System.out.println("Altura = " + y );
                System.out.println("----------------------------------");
                
                Arbol tree1 = new Arbol(2.4f, 15);
                Arbol tree2 = new Arbol(2.4f, 15);
                Arbol tree3 = new Arbol(2.4f, 15);
                Arbol tree4 = new Arbol(2.4f, 15);
                
                System.out.println(tree1);
                
                System.out.println("Troncos de un arbol = " + Arbol.tronco);
                System.out.println("Troncos de un arbol = " + tree1.tronco);
                System.out.println("Troncos de un arbol = " + tree2.tronco);
                System.out.println("Troncos de un arbol = " + tree3.tronco);
                Arbol.generarOxigeno();
                
                //JOptionPane.showMessageDialog(null, "Hola mundo", "Aqui va el titulo", JOptionPane.ERROR_MESSAGE);
                int edad3 = 15;
                String resultado = "";
                if (edad < 18){
                    resultado = "Menor de edad";
                }else{
                    resultado = "Mayor de edad, ten un tequila para la garganta";
                }
                System.out.println(resultado);
                int edad4=15;
                String res = "";
                res = edad4 < 18? "Menor de edad 4" : "Mayor de edad, tequila";
                System.out.println(res);
                int edad5 = 15;
                System.out.println(edad5 < 18? "Menor de edad 5":"Ya, el tequila");
                int val1 = 1;
                int val2 = 2;
                System.out.println(val1 | val2);
                int val3 = 1;
                int val4 = 0;
                val4 = val3 << 2;
                System.out.println(val4);
                System.out.println("-----ARREGLOS------");
                int[] edades;
                edades = new int[5];
                System.out.println(edades);
                edades[0] =10;
                System.out.println("La primer edad es:" + edades[0]);
                int [] estaturas = new int[5];
                int [] pesos = {86,99,56,76,77};
                System.out.println( pesos[0]);
                System.out.println( pesos[1]);
                System.out.println( pesos[2]);
                System.out.println( pesos[3]);
                System.out.println( pesos[4]);
                System.out.println("-------CON FOR---------");
                for (int i = 0; i < pesos.length; i++){
                    System.out.println(pesos[i]);
                    
                }
                System.out.println("Orden inverso");
                for(int i=pesos.length-1;i>=0; i--){
                    System.out.println(pesos[i]);
                    
                    System.out.println("Arreglo de alumnos");
                    Alumno[] lista = new Alumno[5];
                    lista[0] = new Alumno("99999", 2, 9.0f);
                    lista[2] = new Alumno("77777", 2, 7.0f);
                    lista[3] = new Alumno("55555", 2, 7.0f);
                    lista[4] = new Alumno("88888", 2, 8.0f);
                    lista[5] = new Alumno("66666", 2, 6.0f);
                    
            for (Alumno alumno : lista) {
                System.out.println(alumno.evaluarDesempenio());
                
                System.out.println("Con for each ...");
                for (Alumno alumno1 : lista) {
                    System.out.println(alumno.evaluarDesempenio());
*/
                    
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("Arreglo de cuentahabientes");
                    String[] nombres = new String [5];
                    nombres[0]="Juan";
                    nombres[1]="Alejandro";
                    nombres[2]="Elizabeth";
                    nombres[3]="Jorge";
                    nombres[4]="Laura";
                    for(String nombre : nombres)
                    {
                }
                    int[] idCliente = {3984,7523,5539,9900,2573};
                    float[] balance = {40000,100000,1000000,3000,70000};
                    String Juan     =  ("Nombre: " + nombres [0] + " ID: " + idCliente [0]+ " Tu balance es de: " + balance [0] );
                    String Alejandro     =  ("Nombre: " + nombres [1] + " ID: " + idCliente [1]+ " Tu balance es de: " + balance [1] );
                    String Elizabeth     =  ("Nombre: " + nombres [2] + " ID: " + idCliente [2]+ " Tu balance es de: " + balance [2] );
                    String Jorge    =  ("Nombre: " + nombres [3] + " ID: " + idCliente [3]+ " Tu balance es de: " + balance [3] );
                    String Laura     =  ("Nombre: " + nombres [4] + " ID: " + idCliente [4]+ " Tu balance es de: " + balance [4] );
                    
                    System.out.println(Juan);
                    System.out.println(Alejandro);
                    System.out.println(Elizabeth);
                    System.out.println(Jorge);
                    System.out.println(Laura);
                    
                    String res = "";
        for (float i:balance){
            if( i < 50000){
                res = "Cliente Regular";
            }else{
                res = "Cliente Premium";
            }
            System.out.println( "Nivel de los clientes):  "  + res );
            System.out.println("-----------------------------------------");
            
            ArrayList<Alumno> grupo2209= new ArrayList<Alumno>();
            grupo2209.add(new Alumno("9999", 2, 9,0f));
            grupo2209.add(new Alumno("8888", 2, 9,0f));
            grupo2209.add(new Alumno("7777", 2, 9,0f));
            grupo2209.add(new Alumno("8888", 2, 9,0f));
            grupo2209.add(new Alumno("9999", 2, 9,0f));
            
            for (Alumno alumno : grupo2209){
                System.out.println(alumno);
            }
            
            Alumno tmp = grupo2209.get(1);
            System.out.println("Alumno en index = 1 :"+ tmp);
            
            System.out.println("Eliminar el index 3");
            Alumno  tmp2 = grupo2209.remove(3);
            System.out.println("Elemento sacado = " + tmp2);
            
            for(Alumno alumno : grupo2209){
                System.out.println(alumno);
            }
            System.out.println("Desplazar el i-esimo elemento");
            grupo2209.set(0, new Alumno("44444", 4, 4.0f));
                        String tmp3 = null;
            System.out.println("El sacado es= " + tmp3);
            for (Alumno alumno : grupo2209) {
                System.out.println(alumno);
                
            }
            try {
                System.out.println("Excepciones");
            System.out.println(grupo2209.get(20));
            } catch (Exception e) {
            }
        
            System.out.println("Excepciones");
            System.out.println(grupo2209.get(20));
            
                
        
                }
            }
    
        }
    

