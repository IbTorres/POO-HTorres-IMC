/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actvidadimc;
import javax.swing.JOptionPane;

/**
 *
 * @author Alison Torres
 */
//Los atributos deberán ser privados, deberán implementar métodos get y set.
public class ClaseIMC {
    //Atributos:Nombre,Estatura, Peso
    private final String nombre;
    private static float peso, estatura;
   
    //Constructor
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public ClaseIMC (){
        this.nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre", "Nombre", 3);
        setPeso(JOptionPane.showInputDialog(null, "Ingrese el peso en kilogramos", "Peso", 2)); 
        setEstatura(JOptionPane.showInputDialog(null, "Ingrese la altura en metros", "Estatura", 2));
    }
   
    //Métodos: Cálculo de IMC   
    public float calcularIMC(float peso, float estatura) {
        float masa = peso / (float)(Math.pow(estatura, 2));
        return masa;
    }
              
        public void mostrarResultado(float masa) {
        
        if (masa<=18){ 
            JOptionPane.showMessageDialog(null, "Su IMC es de: " + masa + "\nCuidado " + this.nombre +" posee un peso peligrosamente bajo", "IMC", 0);
        }else if (masa <= 24.9){
            JOptionPane.showMessageDialog(null, "Su IMC es de: " + masa + "\nMuy bien " + this.nombre +" está dentro de los parámetros", "IMC", 1);
        }else if (masa <= 26.9){
            JOptionPane.showMessageDialog(null, "Su IMC es de: " + masa + "\nMuy bien " + this.nombre +" sobrepasa sólo un poco los parámetros", "IMC", 0);
        } else if (masa <= 29.9) {
            JOptionPane.showMessageDialog(null, "Su IMC es de: " + masa + "\nCuidado " + this.nombre +" padece de obesidad grado 1 ","IMC", 0);
        } else if (masa <= 39.9) {
            JOptionPane.showMessageDialog(null, "Su IMC es de: " + masa + "\nCuidado " + this.nombre +" padece obesidad grado 2", "IMC", 0);
        } else {
            JOptionPane.showMessageDialog(null, "Su IMC es de: " + masa + "\nCuidado " + this.nombre +" padece obesidad morbida y su salud está en riesgo", "IMC", 0);
        }
      }
    public float getPeso() {
        return this.peso;
    }
    public float getEstatura() {
        return this.estatura;
    }
    public void setPeso(String peso) {
        this.peso = Float.valueOf(peso);
    }
    public void setEstatura(String estatura) {
        this.estatura = Float.valueOf(estatura);
    }
}
