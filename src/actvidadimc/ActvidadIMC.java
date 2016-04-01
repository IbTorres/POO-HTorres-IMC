/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package actvidadimc;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Alison Torres
 */
public class ActvidadIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float IMC;
        ClaseIMC persona = new ClaseIMC();
        IMC = persona.calcularIMC(persona.getPeso(), persona.getEstatura());
        persona.mostrarResultado(IMC);
        
    }
    
}