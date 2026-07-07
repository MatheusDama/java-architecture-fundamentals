
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
