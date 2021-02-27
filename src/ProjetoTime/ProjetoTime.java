/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoTime;

import gui.Interface;
import javax.swing.SwingUtilities;

/**
 *
 * @author Carlos
 */
public class ProjetoTime {

   
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Interface().setVisible(true);
            /*
            try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            } catch (Exception e) {
            }
            
            JFrame frame = new JFrame("JavaFX 2 in Swing");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            JApplet applet = new RoteiroOO();
            applet.init();
            
            frame.setContentPane(applet.getContentPane());
            
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            
            applet.start();*/
        });
       // Professor p1 = new Professor();
        
        //p1.preencher();
        //p1.imprimir();
        
        
       //Professor p2 = new Professor();
       
      // p2.copiar(p1);
      // p2.imprimir();
       
       
     //  Aluno a1 = new Aluno();
      // a1.preencher();
      // a1.imprimir();
       
      // Aluno a2 = new Aluno();
      // a2.copiar(a1);
      // a2.imprimir();
        
//        Disciplina calculo = new Disciplina();
//        calculo.preencher();
//        calculo.imprimir();
        
        
    }
    
}
