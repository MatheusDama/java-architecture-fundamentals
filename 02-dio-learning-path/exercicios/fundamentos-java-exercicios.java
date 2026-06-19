/*
Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
*/
import java.util.Scanner;

public class Name {

    public static void main(String[] args) {

        // --- ENTRADA DE DADOS NO SISTEMA ---
        var scanner = new Scanner(System.in);
        int thisYear = 2026;

        System.out.println("Entre com seu Nome: ");
        String name = scanner.nextLine();

        System.out.println("Entre com seu ano de nascimento: ");
        int year = scanner.nextInt();

        // --- PROCESSAMENTO DOS DADOS ---
        int yearValue = thisYear - year;

        System.out.printf(" Olá %s, você tem %d anos de idade!\n", name, yearValue);
    }
}

//ESSE CÓDIGO CUMPRE A FINALIDADE DA ATIVIDADE.
//Apenas são erros para auto-atenção e descobrimento do código para um futuros aperfeiçoamento do mesmo.

/*
 ==============================================================================
 📝 NOTAS DE RODAPÉ (PONTOS DE ATENÇÃO E ERROS ENCONTRADOS NO CÓDIGO)
 ==============================================================================
 [1] AUSÊNCIA DE VALIDAÇÃO (AUTO-PRESERVAÇÃO):
     O sistema não valida o que é digitado. Se o usuário digitar um ano com mais 
     de 4 dígitos (ex: 20265) ou um ano no futuro (ex: 2030), o programa aceita 
     e gera idades negativas ou matemáticas irreais.

 [2] ERRO DE FORMATAÇÃO DE TEXTO (CASE SENSITIVITY):
     O nome é armazenado exatamente como o usuário digitou. Se ele digitar tudo 
     em minúsculo ou tudo em maiúsculo, o sistema não padroniza a saída.

 [3] RISCO DE QUEBRA DO SISTEMA (InputMismatchException):
     Na linha do 'scanner.nextInt()', se o usuário digitar uma letra ou caractere
     especial em vez de um número, o Java vai travar o programa imediatamente.

 [4] VAZAMENTO DE RECURSO (Resource Leak):
     O objeto 'scanner' foi aberto mas não foi fechado. O ideal para corrigir 
     seria adicionar 'scanner.close();' na última linha do método main.
 ==============================================================================
*/

---
