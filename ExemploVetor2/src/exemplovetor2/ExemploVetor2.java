/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplovetor2;

import java.util.Random;

/**
 *
 * @author mpisc
 */
public class ExemploVetor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int TAM;
        TAM = 5;
        int[] vetor = new int[TAM];
        
        Random r = new Random();
        int menor = 0, maior = 0;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = r.nextInt();
            if (i == 0) {
                menor = vetor[i];
                maior = vetor[i];
            } else {
                if (vetor[i] > maior) {
                    maior = vetor[i];
                }
                if (vetor[i] < menor) {
                    menor = vetor[i];
                }
            }
        }
        
        for (int valor : vetor) {
            System.out.println("Valor: " + valor);
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
    }
    
}
