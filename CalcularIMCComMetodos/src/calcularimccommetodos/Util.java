/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcularimccommetodos;

/**
 *
 * @author mpisc
 */
public class Util {
    public static float calcularImc(float peso, float altura) {
        //return (float)(peso / Math.pow(altura, 2));
        return peso / (altura * altura);
    }
    
    public static String verificarClassificacao(float imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25.0) {
            return "Normal";
        } else if (imc < 30.0) {
            return "Sobrepeso";
        } else if (imc < 40.0) {
            return "Obesidade";
        } else {
            return "Obesidade grave";
        }        
    }    
}
