
import java.util.Scanner;

public class Name {

    public static void main(String[] args) {

        // --- ENTRADA DE DADOS NO SISTEMA ---

        var scanner = new Scanner(System.in);

        // Valor inteiro do ano presente (2026) dentro do sistema!
        int thisYear = 2026;

        //Não existe um fator de auto-preservação do recebimento dos nomes.
        System.out.println("Entre com seu Nome: ");
        String name = scanner.nextLine();

        System.out.println("Entre com seu ano de nascimento");
        int year = scanner.nextInt();

        // --- PROCESSAMENTO DOS DADOS ---
        // O valor da sua idade será entregue com a subtração do ano atual, menos o anos de nascimento
        /*
        * 1. Não existe nenhum fator de auto preservação do sistema. Valores acima de 4 digitos, nomes em maiúsculo ou
        * minusculo,
         */
        int yearValue = thisYear - year;

        System.out.printf(" Olá %s, você tem %d anos de idade!", name, yearValue);
    }
}


