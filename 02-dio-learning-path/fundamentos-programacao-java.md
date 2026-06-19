
### Keywords e tipos premitivos

| Categoria | Tipo | Valor Mínimo | Valor Máximo | Valor Padrão | Tamanho | Exemplo de Declaração |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| **Inteiro** | `byte` | -128 | 127 | 0 | 8 bits | `byte ex1 = (byte)1;` |
| **Inteiro** | `short` | -32768 | 32767 | 0 | 16 bits | `short ex2 = (short)1;` |
| **Inteiro** | `int` | -2.147.483.648 | 2.147.483.647 | 0 | 32 bits | `int ex3 = 1;` |
| **Inteiro** | `long` | -9.223.372.036.854.770.000 | 9.223.372.036.854.770.000 | 0 | 64 bits | `long ex4 = 1l;` |
| **Ponto Flutuante** | `float` | -1,4024E-37 | 3.40282347E + 38 | 0 | 32 bits | `float ex5 = 5.50f;` |
| **Ponto Flutuante** | `double` | -4,94E-307 | 1.79769313486231570E + 308 | 0 | 64 bits | `double ex6 = 10.20d;` ou `double ex6 = 10.20;` |
| **Caractere** | `char` | 0 | 65535 | `\0` | 16 bits | `char ex7 = 194;` ou `char ex8 = 'a';` |

> aspas duplas e normal são diferetnes

### Trabalho com Operadores de Atribuição e Lógicos

### Trabalho com Operadores de Atribuição, Aritméticos, Lógicos e de Bits

| Operador / Sintaxe | Nome Técnico | Função / Explicação | Exemplo de Uso |
| :---: | :--- | :--- | :--- |
| `=` | Atribuição Simples | Guarda o valor da direita dentro da variável da esquerda. | `x = 10` (x passa a valer 10) |
| `==` | Igualdade | Compara se dois valores são iguais. Retorna `true` ou `false`. | `5 == 5` (Resulta em `true`) |
| `!=` | Diferente de | Compara se dois valores são distintos. Retorna `true` se forem diferentes. | `5 != 3` (Resulta in `true`) |
| `!` | Negação Lógica (NOT) | Inverte o estado lógico de um booleano (`true` vira `false` e vice-versa). | `!true` (Resulta em `false`) |
| `\|\|` | Disjunção Lógica (OR) | Retorna `true` se **pelo menos uma** das condições for verdadeira. | `true \|\| false` (Resulta em `true`) |
| `&&` | Conjunção Lógica (AND) | Retorna `true` **apenas se todas** as condições forem verdadeiras. | `true && false` (Resulta em `false`) |
| `^` | OU Exclusivo (XOR) | Retorna `true` se as condições forem **diferentes**. Se forem iguais, resulta em `false`. | `true ^ true` (Resulta em `false`) |
| `/` | Divisão | Divide o dividendo pelo divisor. Em divisões inteiras, descarta as casas decimais. | `10 / 2` (Resulta em `5`) |
| `%` | Módulo (Resto da Divisão) | Retorna o **resto** que sobra de uma divisão inteira. | `7 % 2` (Resulta em `1`, pois 7 = 3*2 + **1**) |
| `<<` | Deslocamento à Esquerda (Left Shift) | Move os bits para a esquerda e preenche os vazios com `0`. Multiplica o número por $2^n$. | `3 << 1` (O binário `0011` vira `0110`, que é `6`) |
| `>>` | Deslocamento à Direita (Right Shift) | Move os bits para a direita (dividindo por $2^n$). Preserva o bit de sinal (0 para positivo, 1 para negativo). | `8 >> 1` (O binário `1000` vira `0100`, que é `4`) |
| `>>>` | Deslocamento à Direita Sem Sinal (Logical Shift) | Move os bits para a direita e preenche sempre com `0` na esquerda, ignorando o sinal. | `-8 >>> 1` (Resulta em `2147483644`) |
| `println()` | Função de Saída / Impressão | Escreve uma mensagem ou o valor de uma variável no terminal (consola) e pula uma linha. | `println("Olá, Mundo!")` |
| `isRight` | Identificador (Variável/Função) * | Não é um operador. É um nome comum usado para variáveis booleanas (ex: `let isRight = true`). | `if (isRight) { ... }` |

*\* Nota: `isRight` e `println` são elementos de sintaxe/funções e não operadores propriamente ditos, mas estão incluídos para fins de documentação do código.*


>  `IsRight` é um **método**: O qual são **blocos de código que executam uma tarefa específica apenas quando são chamados.** Sendo também referidos com **functions(funções)**, -ERRADO-

| Especificadores | tipos de dados | exemplo |
| :--- | :--- | :---|
| %s | _string_(texto) | Exibe textos |
| %d | _int_/inteiro (`int, long, short, byte` | valores inteiros decimais |
| %f | _float_/flutuante (float, double) | Número com casas decimais |
| %c | _char_/caracter | Um único caracter apenas! |
| %b | _bool_(boleano) | informa _true_ ou _false_ |
| %n ou \n | _line break_ | Pula para a próxima linha |

>Especificadores são diferentes de Operadores!!

```java
import java.util.Scanner;

/**
 * Classe principal para exercitar conceitos de captura de dados,
 * operadores lógicos, relacionais e formatação de strings no Java.
 */
public class Main {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        // --- ENTRADA DE DADOS ---

        /* Exemplo utilizado em vídeo
        System.out.println("Quanto é 2 + 2? ");
        var result = scanner.nextInt();

         * * Exemplo alternativo de captura de dados (Idade):
         */

        System.out.println("Quantos anos você tem?");
        var age = scanner.nextInt();

        System.out.println("Você é emancipado? ");

        // --- PROCESSAMENTO / LÓGICA BOOLEANA ---

        /* Avalia a igualdade direta. Retorna 'true' se o resultado for igual a 4.
        var isRight = result == 4;

         * * Abordagens alternativas de validação lógica:
         * * 1. Desigualdade (!=): Verifica se o valor está incorreto (isWrong).
         * var isWrong = result != 4;
         */

        //2. Valida se o usuário é emancipado para dirigir
        var isEmancipated = scanner.nextBoolean();

        //3. Operador Relacional (>): Validação de maioridade.
        var canDrive = age >= 18 || isEmancipated; // Nota: No Brasil, o correto seria maior ou igual (>=)

        // --- NOTA MENTAL ---

        /*
        * O Java segue a chamada `Ordem de Execução`(ou fluxo sequêncial).
        * Significando assim que o código precisa ser criado para ser utilizado, sempre de cima para baixo(Sequêncial)
         */


        // --- SAÍDA DE DADOS FORMATADA ---

        /* O placeholder '%s' atua como um alocador de string para injetar o valor booleano dinamicamente.
        System.out.printf("O resultado é 4, você acertou? (%s)\n", isRight);

         * Exemplo de exibição usando o operador de inversão/negação (!):
         * Se 'isWrong' for false, '!isWrong' se torna true.
         * System.out.printf("O resultado é 4, você acertou? (%s)\n", !isWrong);
         */

        System.out.printf("Você pode dirigir? (%s) \n", canDrive);
    }
}
```

<details>
  <summary>Esse é o objetivo do isRight</summary>
  nesta ordem:

    Ele olha primeiro para o lado direito do sinal de igual (=): result == 4

    Ele faz a pergunta (comparação): "O valor que está dentro de result é igual a 4?"

    Ele gera um resultado lógico: * Se o usuário digitou 4, essa expressão vira true.

        Se o usuário digitou qualquer outro número, vira false.

    Ele guarda o resultado: Só agora o Java pega esse true ou false e joga para dentro da variável isRight.

</details>

### Java Keywords (palavra-chave Java)

* **Java Keywords**: Java tem conjuntos de palavras-chaves em _java_ que **NÂO** podem ser usadas como variáveis são essas: _variable, methods, classes,_ ou nehum outro _identifiers_.

>[!NOTE}
>_true, false, e null_ não são **keywords**, mas são conhecidos como **literals** (literais) e **reserved** (reservados) que não podem ser usados como identificadores - REVISAR -

### Operadores de Atribuição lógica

### Operadores Aritméticos

Exemplos em Vídeos

```java
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        // -- ENTRADA DE DADOS --

        // O **new Scanner** faz a leitura e a transformação dos dados vindos do **System.in**, 
        // que por sua vez intercepta os dados inseridos via teclado.
        var scanner = new Scanner(System.in);

        // O **System.out** sai com uma mensagem que é exibida pelo terminal usando **println**, 
        // que printa o texto e faz um _line-break_ (quebra de linha).
        System.out.println("Informe o primeiro número: ");

        // O scanner processa a entrada do terminal e armazena o valor na variável 'value1'.
        var value1 = scanner.nextInt();
        
        // Mesmo processo da primeira variável, resultando em um segundo valor de entrada.
        System.out.println("Informe o segundo número: ");
        var value2 = scanner.nextInt();
        
        // -- SAÍDA DE DADOS --
        
        // O **printf** faz a exibição formatada usando os %d (place-holders para números), 
        // que recebem os valores declarados sequencialmente após a vírgula.
        System.out.printf("%d + %d = %d\n", value1, value2, value1 + value2);

        // Boa prática: fecha o fluxo de leitura após o uso.
        scanner.close();
    }
}
```
