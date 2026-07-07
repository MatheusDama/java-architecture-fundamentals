
// 1. Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;

import java.util.Scanner;

public class multiplicationTable {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        // A primeira leitura vai ser executada aqui.

        int number;

        // Enquanto não for *false*, no caso Zero (0), ele vai continuar rodando o programa da tabuada.
        boolean isRunning = true;

        System.out.println("********************\n");

        while (isRunning){ // Se eu não colocar um leitor NOVO dentro do looping while, ele vai ficar para sempre
            number = sc.nextInt(); //Apenas crio o objeto com a instacia já aplicada, nada de mais
            switch (number){ // O número vai ser lido no Switch que for selecionado pelo user, e sair seu valor.
                case 1 -> table(number);
                case 2 -> table(number);
                case 3 -> table(number);
                case 4 -> table(number);
                case 5 -> table(number);
                case 6 -> table(number);
                case 7 -> table(number);
                case 8 -> table(number);
                case 9 -> table(number);
                case 10 -> table(number);


                // O case Zero (0) vai ser minha saida do looping, e saida do sistema
                case 0 -> {
                    System.out.println("Valores Multiplicos por Zero(0) SEMPRE serão 0");
                    System.out.println("Saindo do programa ...");
                    isRunning = false;
                }
                // Caso os valores seja diferentes da tabela switch, será informado esse erro.
                default -> {
                    System.out.println("Opção inválida! Digite um número de 1 a 10, ou 0 para sair.");
                }

            }
            //Apenas uma separação, nada de muito problemático.
            System.out.println("********************\n");
        }
    }


    /**
     * Gera e imprime na tela a tabuada de multiplicação de 1 a 10 
     * para o número fornecido pelo usuário.
     * * @param number O número inteiro que será multiplicado.
     */
    static void table (int number){

        // Esse for executa uma ação, printa na tela, e segue para a próxima.
        for (int i = 1; i<=10; i ++){

            // Exibe a linha calculada. Ex: se number for 5 e i for 2, exibe "5 * 2 = 10"
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}

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
