/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cifradocesar;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author johanacosta19
 */
public class Cifrado extends JFrame {
    FlowLayout Layout;
    JTextField entrada1;
    JTextField entrada2;
    JButton boton;
    JLabel salida;
    JLabel etiqueta1;
    JLabel etiqueta2;
    JLabel etiqueta3;

   public Cifrado() throws HeadlessException  {
        
       this.setTitle("Cifrado César");
       this.setSize(1200, 400);
       this.pack();
       this.setVisible(true);
       Layout = new FlowLayout();
       this.setLayout(Layout);
       entrada1 = new JTextField(5);
       entrada2 = new JTextField(15);
       etiqueta1 = new JLabel("Ingrese la clave de desplazamiento:");
       etiqueta2 = new JLabel("Ingrese un mensaje:");
       etiqueta3 = new JLabel("El mensaje cifrado es:");
       salida = new JLabel("");
       boton = new JButton("Cifrar");
       boton.setBackground(Color.YELLOW);
       
       this.getContentPane().add( etiqueta1 );
        this.getContentPane().add( entrada1 );
        this.getContentPane().add( etiqueta2 );
        this.getContentPane().add( entrada2 );
        this.getContentPane().add( etiqueta3 );
        this.getContentPane().add( salida );
        this.getContentPane().add( boton );
        
         this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
       
            }    
        });
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String abc = "abcdefghijklmnñopqrstuvwxyz";
                int key = Integer.parseInt(entrada1.getText());
                String letraPlana = entrada2.getText();
                String letraEncriptada = "";
                
        for (int i = 0; i < letraPlana.length (); i++){
        for(int j = 0 ; j < abc.length() ; j ++){
             if(letraPlana.charAt(i) == abc.charAt(j)){
             if( j + key < 0){
              letraEncriptada += abc.charAt(abc.length() + (key -j));
              }
              else{
              letraEncriptada += abc.charAt( j + key);
          }
           }
         }}

                salida.setText(letraEncriptada);
                
                
            }
        });
            
    }
}
    

