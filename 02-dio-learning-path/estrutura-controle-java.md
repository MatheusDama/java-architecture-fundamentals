
| Palavra reservada / Sintaxe | Nome Técnico | Função / Explicação | Exemplo de Uso |
| :--- | :--- | :--- | :--- |
| `if` | Instrução Condicional (*Se*) | Desvia o fluxo de execução do programa com base numa condição booleana. | `if (x > 5) { System.out.println("Maior"); }` |
| `else` | Cláusula *Senão* | Executa um bloco de código alternativo caso a condição do `if` seja falsa (`false`). | `if (x > 5) { ... } else { System.out.println("Menor ou igual"); }` |
| `else if` | Condicional Encadeada | Permite avaliar uma nova condição em sequência caso o `if` anterior tenha sido falso. | `if (x > 10) { ... } else if (x > 5) { System.out.println("Entre 6 e 10"); }` |
| `condicao ? a : b` | Operador Ternário (Condicional) | Uma forma compacta de `if-else`. Avalia a condição: se for `true`, retorna `a`; se for `false`, retorna `b`. | `String status = (nota >= 7) ? "Aprovado" : "Reprovado";` |
| `switch (var) { case a -> ... }` | Estrutura Condicional Switch Case | Direciona a execução para diferentes blocos baseando-se no valor exato de uma única variável de entrada pré-definida. | `switch(option) { case 1 -> "Domingo"; default -> "Inválido"; }` |
| `for (init; cond; inc)` | Laço de Repetição (*Loop For*) | Executa um bloco de código repetidamente enquanto a condição declarada for verdadeira. | `for (int i = 0; i < 10; i++) { System.out.println(i); }` |
| `break` | Interrupção de Fluxo Total | Aborta e encerra imediatamente a execução de um bloco `switch` ou de um laço de repetição. | `if (name.equalsIgnoreCase("exit")) break;` |
| `continue` | Interrupção de Fluxo Parcial | Pula o restante do código da rodada atual e força o laço a ir direto para a próxima iteração. | `if (i % 2 == 0) continue;` |

### 🧠 Notas Mentais Importantes

* **Regra das chaves `{}` no `if` / `else`:**
  * Se o bloco de código tiver **apenas uma linha**, o uso das chaves `{}` é **opcional** (não obrigatório).
  * Se o bloco tiver **duas ou mais linhas**, o uso das chaves `{}` é **obrigatório** para delimitar o início e o fim do bloco.
  * *Boa prática:* Mesmo para uma única linha, recomenda-se a utilização de chaves para evitar erros futuros ao dar manutenção ao código.
* **Operador Ternário vs. Elvis Operator:**
  * O operador com a sintaxe `? :` separado é o **Operador Ternário**.
  * O **Elvis Operator** legítimo (comum em linguagens como Kotlin, C# ou Groovy) utiliza a sintaxe `?:` (juntos) e serve para fornecer um valor padrão caso o operando seja nulo (ex: `val nome = usuario.nome ?: "Anónimo"`).
  * **Switch case:**
  * 
```java
var canDrive = (age >= 18 || (age >=16 && isEmancipated);
var message = canDrive ?
        name + ", você pode dirigir \n";
        name + ", você não pode dirigir \n";

```

Ex. :
```java
import java.util.Scanner;

public class MainJava {

    public static void main (String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        var name = scanner.next();
        System.out.println("Informe sua idade: ");
        int age = scanner.nextInt();

        if (age >= 18) System.out.printf("%s, você tem %s anos e pode dirigir %n", name, age);
        |____________________________________________________________________________________|
           //A condição apenas é seguinda dentro dessa sequeência, sendo que o "System.out.printf" não afeta a condição.    

        System.out.println("Fim da execução!");

        scanner.close();
    }
}
```

---

### Estrutura Condicional Switch Case

O **`switch-case`** é uma estrutura de controle de fluxo utilizada para direcionar a execução do código para diferentes blocos de saída, baseando-se no valor exato de uma única expressão ou variável de entrada. (Uma opção de saída com base em uma entrada pré-definida)

```java
// Vai receber o valor de Um (1) à Sete (7), por aqui --- ENTRADA DE DADOS 
var option = scanner.nextInt();

// Saida com a condicional `switch` --- SAIDA DO RESULTADO
switch (option){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terceira-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inserida inválida!");
        }
```

* para o switch aceitar uma String, a variável de entrada é que precisa ser do tipo String. Os cases apenas refletem o tipo dessa variável.

```java
switch (option) // Variável de entrada (option){
            case "1": // A entrada para que tenha esse input, tem que ser `string`
                System.out.println("Domingo");
                break; // Se não colocado o `break`, o Java continuará executando todos os códigos dos `cases`
                       // de baixo de forma sequencial (comportamento chamado de *Fall-Through*), mesmo que eles não correspondam à variável de entrada.
            case "2":
                System.out.println("Segunda-feira");
                break;
                ...
```

⚠️ Atenção: A comparação de Strings no switch é case-sensitive (diferencia maiúsculas de minúsculas). Passar "**segunda**" é diferente de "**Segunda**".
* **Obrigatoriedade:** Ele não é obrigatório para o código compilar, mas é indispensável para garantir que **apenas o resultado selecionado** seja executado.
* **Variável de Entrada:** É a variável colocada dentro do `switch(variavel)`. O tipo dela define o que o código aceita.
* **Valor de Comparação (`case`):** São os valores fixos que você testa. Se a variável for `int`, o case usa números (`case 1:`). Se a variável for `String`, o case usa aspas (`case "1":`).

Podemos fazer uma atribuição do `switch-case`, ele fica atrelado a uma variável, podendo assim ser utilizado para retorno de valor.

```java
var message = switch (option) {
    case 1, 7 -> {
        var day = option == 1 ? "Domingo" : "Sábado";
        
        // O yield captura o resultado final e o "embuti" na variável 'message'
        yield "Hoje é " + day; 
    }
    // --- RESTO DO CÓDIGO --
    // ... ... ... ... ... ...
    default -> "Opção inválida";
};

// O programa NÃO parou! Ele continua rodando aqui embaixo normalmente:
System.out.println(message);
```


---

### --- EXEMPLOS EM VÍDEO ---

```java
import java.util.Scanner;

public class MainJava {

    public static void main(String[] args) {

        // --- ENTRADA DE DADOS ---

        // O construtor 'new Scanner(System.in)' cria um objeto para ler a entrada do usuário no console.
        // O tipo 'var' permite que o Java infira o tipo automaticamente.
        var scanner = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        var name = scanner.next();

        System.out.println("Informe sua idade: ");
        // O método '.nextInt()' captura o próximo valor numérico inteiro inserido pelo usuário.
        int age = scanner.nextInt();

        System.out.println("Você é emancipado? (s/n)");
        
        // --- VALIDAÇÃO COM IGNORE CASE ---

        // O método '.next()' captura a entrada do usuário como String.
        // O método '.equalsIgnoreCase("s")' faz a comparação de igualdade de forma inteligente,
        // ignorando se a letra digitada está em maiúscula ("S") ou minúscula ("s").
        /* Exemplo visual:
           Usuário digita "S" -> "S".equalsIgnoreCase("s") -> true
           Usuário digita "s" -> "s".equalsIgnoreCase("s") -> true
           Usuário digita "n" -> "n".equalsIgnoreCase("s") -> false */
        var isEmancipated = scanner.next().equalsIgnoreCase("s");

        // --- PROCESSAMENTO E REGRAS DE NEGÓCIO ---

        // Atribuição de uma expressão lógica para verificar se o usuário está apto a dirigir.
        // Regra: Ter idade maior ou igual a 18 anos OU (ter entre 16 e 17 anos E ser emancipado).
        /* Exemplo visual da lógica:
           Idade: 16, Emancipado: true  -> (16 >= 18)[false] || (16 >= 16 && true)[true]  -> Resulta em true
           Idade: 16, Emancipado: false -> (16 >= 18)[false] || (16 >= 16 && false)[false] -> Resulta em false */
        var canDrive = (age >= 18) || (age >= 16 && isEmancipated);

        // --- ATRIBUIÇÃO CONDICIONAL (OPERADOR TERNÁRIO) ---

        // O operador ternário `? :` funciona como um if-else compacto.
        // Sintaxe: condicao ? valor_se_verdadeiro : valor_se_falso;
        // Ele resolve o problema de escopo, permitindo criar e inicializar a variável na mesma linha.
        var message = canDrive ? name + ", você pode dirigir." : name + ", você não pode dirigir.";

        // --- ESTRUTURA CONDICIONAL TRADICIONAL (Alternativa para logs detalhados) ---

        /* // Nota mental sobre escopo: A variável 'messageDetaled' precisa ser declarada FORA do bloco if/else
        // se quisermos utilizá-la mais abaixo no código, pois blocos `{}` isolam o ciclo de vida das variáveis.
        String messageDetailed;

        if (canDrive) {
            // O 'printf' exibe o texto formatado. Usa '%s' para Strings, '%d' para inteiros e '%n' para quebrar a linha.
            System.out.printf("%s, você tem %d anos e preenche os requisitos para dirigir! %n", name, age);
            messageDetailed = name + ", você está autorizado.";
        } else {
            System.out.printf("%s, você tem %d anos e não cumpre os requisitos. %n", name, age);
            messageDetailed = name + ", você não está autorizado.";
        } 
        */

        // --- SAÍDA DE DADOS E FINALIZAÇÃO ---

        System.out.println(message);
        System.out.println("Fim da execução!");

        // O método '.close()' encerra o objeto Scanner, liberando o recurso de memória do sistema.
        scanner.close();
    }
}
```

**DO SWITCH CASE v1.0.0**

 ```java
import java.util.Scanner;

public class MainJava2 {

    public static void main(String[] args){

        var scanner = new Scanner(System.in);
        System.out.println("Informe um número de 1 até 7");

        var option = scanner.next();
 
        switch (option){
            case "carlos":
                System.out.println("Domingo");
                break;
            case "2":
                System.out.println("Segunda-feira");
                break;
            case "3":
                System.out.println("Terceira-feira");
                break;
            case "4":
                System.out.println("Quarta-feira");
                break;
            case "5":
                System.out.println("Quinta-feira");
                break;
            case "6":
                System.out.println("Sexta-feira");
                break;
            case "7":
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inserida inválida!");
        }
    }
}
```

**SWITCH CASE v1.1.0**

 ```java
import java.util.Scanner;

public class MainJava2 {

    public static void main(String[] args){

        var scanner = new Scanner(System.in);
        System.out.println("Informe um número de 1 até 7");

        var option = scanner.next();
 
        switch (option){
            case "carlos":
                System.out.println("Domingo");
                break;
            case "2":
                System.out.println("Segunda-feira");
                break;
            case "3":
                System.out.println("Terceira-feira");
                break;
            case "4":
                System.out.println("Quarta-feira");
                break;
            case "5":
                System.out.println("Quinta-feira");
                break;
            case "6":
                System.out.println("Sexta-feira");
                break;
            case "7":
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inserida inválida!");
        }
    }
}
```

**Switch Case v1.2.1**

```java
import java.util.Scanner;

public class MainJava2 {

    public static void main(String[] args){

        var scanner = new Scanner(System.in);
        System.out.println("Informe um número de 1 até 7");

        var option = scanner.nextInt();

        // O `switch/case` usando o arrow, não é necessitando usar o break, que esse formato já encerra
        // a sequência do código.
        switch (option){
            case 1, 7 -> System.out.println("Fim de semana uhuuu \\o/");
            case 2 -> System.out.println("Segunda-feira");
            case 3 -> System.out.println("Terça-feira");
            case 4 -> System.out.println("Quarta-feira");
            case 5 -> System.out.println("Quinta-feira");
            case 6 -> System.out.println("Sexta-feira");

            // `default` volta uma mensagem pré-definida, para que caso haja um erro, seja exibido essa mensagem.

            default -> System.out.println("Opção inválida");
        }
    }
}
```

**Switch Case v1.2.2**

```java
import java.util.Scanner;

public class MainJava {

    public static void main(String[] args) {

        // --- ENTRADA DE DADOS ---

        // O construtor 'new Scanner(System.in)' cria um objeto para ler a entrada do usuário no console.
        var scanner = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7 para escolher o dia da semana: ");
        // O método '.nextInt()' captura o próximo valor numérico inteiro inserido pelo usuário.
        var option = scanner.nextInt();
        scanner.nextLine(); // Boa prática: limpa o buffer do teclado após ler um número inteiro.

        // --- PROCESSAMENTO (SWITCH EXPRESSION) ---

        // O 'switch' como expressão permite atribuir o resultado direto a uma variável.
        // O uso da seta (->) elimina a necessidade do comando 'break', pois esse formato já encerra
        // a sequência de execução automaticamente após encontrar o caso correspondente.
        var message = switch (option) {
            // É possível agrupar múltiplos valores na mesma linha separados por vírgula.
            case 1, 7 -> {
                // Operador ternário para definir dinamicamente se é Domingo ou Sábado.
                // A expressão 'option == 1' gera uma condição: se for verdadeira (true), adota o valor
                // à esquerda do ':' ("Domingo"). Se for falsa (false), adota o valor à direita ("Sábado").
                var day = option == 1 ? "Domingo" : "Sábado";

                // O método '.formatted()' aplica a interpolação de Strings na mensagem de fim de semana.
                // Substitui os marcadores '%s' pelas variáveis passadas nos argumentos na ordem correta.
                // A palavra-chave 'yield' é usada dentro de blocos '{}' para retornar o valor final para a variável 'message'.
                yield "Hoje é %s, fim de semana uhuull \\o/".formatted(day);
            }
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";

            // O 'default' é obrigatório no switch expression para garantir que todos os cenários possíveis
            // (inclusive entradas inválidas) retornem um valor.
            default -> "Opção inválida";
        }; // Ponto e vírgula obrigatório aqui, pois estamos finalizando a atribuição da variável 'message'.

        // --- SAÍDA DE DADOS E FINALIZAÇÃO ---

        System.out.println(message);
        System.out.println("Fim da execução!");

        // O método '.close()' encerra o objeto Scanner, liberando o recurso de memória do sistema.
        scanner.close();
    }
}
```
