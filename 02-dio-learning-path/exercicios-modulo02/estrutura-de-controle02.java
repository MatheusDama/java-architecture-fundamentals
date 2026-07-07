
/* 2

Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:

    Se for menor ou igual a 18,5 "Abaixo do peso";
    se for entre 18,6 e 24,9 "Peso ideal";
    Se for entre 25,0 e 29,9 "Levemente acima do peso";
    Se for entre 30,0 e 34,9 "Obesidade Grau I";
    Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
    Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";

*/

import java.util.Scanner;

public class MMC {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Pensando em fazer um looping While com o boolean, mas estou apenas pensando
        boolean isRunning = true;

        // --- Entrada de Dados ---

        System.out.println("Digite o seu Peso (ex.:75,5): ");
        float weight = sc.nextFloat();

        System.out.println("Digite Sua altura (ex.: 1,78): ");
        float height = sc.nextFloat();

        float imc = imcResult(height, weight);


        // Essas são as condições IFs e ELSE IFs que vão consolidar o peso da pessoa
        // Selecione o texto que você quer mudar, e que se repete, aperte Alt + j e seja feliz
        // && é melhor que o || por validar cada sequência, não ambos ao mesmo tempo. 
        if (imc <= 18.5){
            System.out.println("Abaixo do peso, tenha cuidado!");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso ideal! Continue assim");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade tipo I (Obesidade Grau I");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade tipo II (Obesidade Severa II)");
        } else if (imc >= 40.0) {
            System.out.println("Obesidade tipo III (Obesidade Mórbida III)");
        }


    }

    // Vai faze o calculo do IMC, gerando assim o resultado nesse método.
    // Pegando o resultado de ambas as entradas, `height` e `weight` do usuário
    static float imcResult( float height, float weight){
        float imcResult = weight / (height * height);
        System.out.printf("Seu IMC é %.2f%n", imcResult);

        // Lembre-se de retornar o resultado para fora do método de calculo.
        return imcResult;
    }
}
