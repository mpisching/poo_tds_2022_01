/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcularimccommetodos;

import java.util.Scanner;

/**
 *
 * @author mpisc
 */
public class CalcularIMCComMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("**** CALCULO DO IMC ****");

        System.out.print("Nome.............: ");
        String nome = entrada.next();

        System.out.print("Idade............: ");
        int idade = entrada.nextInt();

        System.out.print("Peso.............: ");
        float peso = entrada.nextFloat();

        System.out.print("Altura...........: ");
        float altura = entrada.nextFloat();


        String resposta = verificarMaioridade(idade);//(idade >= 18) ? "Maior de idade!" : "Menor de idade!";
        System.out.println(resposta);
        
        float imc = calcularImc(peso, altura);//(float) (peso / Math.pow(altura, 2));

        String classificacao = verificarClassificacao(imc);
        
        imprimirImc(nome, peso, idade, altura, imc, classificacao);
        
    }
    
    //sintaxe da declaração de método
    //modificador_de_acesso [static] tipo_dado_retorno nomeDoMetodo(parâmetros) {
    //     corpo do método - instruções de controle
    //     return literal_ou_variavel compatível com tipo_dado_retorno
    //}
    
    public static String verificarMaioridade(int idade) {
        String r = (idade >= 18) ? "Maior de idade!" : "Menor de idade!";
        return r;
        //return (idade >= 18) ? "Maior de idade!" : "Menor de idade!";
    }
    
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
    
    public static void imprimirImc(
            String nome, float peso, int idade, float altura, 
            float imc, String classificacao) {
        System.out.println("Nome....: " + nome);
        System.out.println("Idade...: " + idade);
        System.out.println("Peso....: " + peso);
        System.out.println("Altura..: " + altura);  
        System.out.println("IMC.....: " + imc);
        System.out.println("Classificação do IMC: " + classificacao);

    }
    
}
