import java.util.Scanner;

public class Name {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Calculo da área de um quadrado, insira o primeiro valor: ");
        float value1 = scanner.nextFloat();

        System.out.println("Insira o segundo valor: ");
        float value2 = scanner.nextFloat();

        float result = value1 * value2;

        System.out.printf("O resultado é: %.1f (O calculo da área é: %.1f x %.1f)\n", result, value1, value2);
    }
}

/*
 ==============================================================================
 📝 NOTAS DE RODAPÉ (ANÁLISE TÉCNICA E ERROS ENCONTRADOS NO CÓDIGO)
 ==============================================================================
 [1] EXPLICAÇÃO DA SINTAXE DE DECIMAIS (%.1f):
     O modificador '%.1f' foi aplicado perfeitamente no seu System.out.printf. 
     Ele instrui o Java a exibir os valores do tipo float limitados a apenas 1 
     casa decimal após a vírgula, aplicando o arredondamento matemático padrão 
     caso o número original possua mais dígitos decimais.

 [2] ERRO DE CONCEITO MATEMÁTICO (QUADRADO vs RETÂNGULO):
     O enunciado diz "Cálculo da área de um quadrado", mas o código pede dois 
     valores diferentes (value1 e value2). Geometricamente, um quadrado possui 
     todos os lados iguais. Ao pedir dois valores e multiplicá-los, o código 
     está calculando a área de um RETÂNGULO ou QUADRILÁTERO GENÉRICO. Para ser 
     um quadrado puro, bastaria pedir um único lado e fazer 'lado * lado'.

 [3] CORREÇÃO DE SINTAXE NA STRING DE SAÍDA (FALTA DE PARÊNTESE):
     Na linha original do 'printf', o texto terminava em '%.1f' sem fechar o 
     parêntese que foi aberto logo após "O resultado é: ...". Isso gerava um 
     texto cortado na tela. O parêntese de fechamento ')' foi adicionado antes 
     da quebra de linha '\n'.

 [4] RISCO DE QUEBRA POR LOCALIZAÇÃO (InputMismatchException):
     O 'scanner.nextFloat()' depende da linguagem (Locale) do sistema operacional.
     Em computadores configurados em Português (Brasil), o usuário DEVE digitar 
     a parte decimal usando VÍRGULA (ex: 5,5). Se ele digitar PONTO (ex: 5.5), 
     o Java vai travar o programa com um erro.

 [5] VAZAMENTO DE RECURSO (Resource Leak):
     Assim como no código anterior, o objeto 'scanner' não foi encerrado com 
     'scanner.close();' ao final da execução.
 ==============================================================================
*/
