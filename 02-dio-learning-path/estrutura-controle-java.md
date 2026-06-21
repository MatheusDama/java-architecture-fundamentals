
| Palavra reservada / Sintaxe | Nome Técnico | Função / Explicação | Exemplo de Uso |
| :--- | :--- | :--- | :--- |
| `if` | Instrução Condicional (*Se*) | Desvia o fluxo de execução do programa com base numa condição booleana. | `if (x > 5) { println("Maior") }` |
| `else` | Cláusula *Senão* | Executa um bloco de código alternativo caso a condição do `if` seja falsa (`false`). | `if (x > 5) { ... } else { println("Menor ou igual") }` |
| `else if` | Condicional Encadeada | Permite avaliar uma nova condição em sequência caso o `if` anterior tenha sido falso. | `if (x > 10) { ... } else if (x > 5) { println("Entre 6 e 10") }` |
| `condicao ? a : b` | Operador Ternário (Condicional) | Uma forma compacta de `if-else`. Avalia a condição: se for `true`, retorna `a`; se for `false`, retorna `b`. | `let status = (nota >= 7) ? "Aprovado" : "Reprovado"` |

### 🧠 Notas Mentais Importantes

* **Regra das chaves `{}` no `if` / `else`:**
  * Se o bloco de código tiver **apenas uma linha**, o uso das chaves `{}` é **opcional** (não obrigatório).
  * Se o bloco tiver **duas ou mais linhas**, o uso das chaves `{}` é **obrigatório** para delimitar o início e o fim do bloco.
  * *Boa prática:* Mesmo para uma única linha, recomenda-se a utilização de chaves para evitar erros futuros ao dar manutenção ao código.
* **Operador Ternário vs. Elvis Operator:**
  * O operador com a sintaxe `? :` separado é o **Operador Ternário**.
  * O **Elvis Operator** legítimo (comum em linguagens como Kotlin, C# ou Groovy) utiliza a sintaxe `?:` (juntos) e serve para fornecer um valor padrão caso o operando seja nulo (ex: `val nome = usuario.nome ?: "Anónimo"`).
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

--- EXEMPLOS EM VÍDEO ---

```java
import java.util.Scanner;

public class MainJava {

    public static void main (String[] args){

        // --- ENTRADA DE DADOS ---

        // O construtor 'new Scanner(System.in)' cria um objeto para ler a entrada do usuário
        // no console. O tipo 'var' permite que o Java infira o tipo automaticamente.
        var scanner = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        var name = scanner.next();

        System.out.println("Informe sua idade: ");
        // O método '.nextInt()' captura o próximo valor numérico inteiro inserido pelo usuário.
        int age = scanner.nextInt();

        System.out.println("Você é emancipado? (s/n)");

        // --- VALIDAÇÃO COM IGNORE CASE ---

        // O método '.next()' captura a entrada do usuário como String.
        // O método '.equalsIgnoreCase("s")' faz a comparação de igualdade textual de forma inteligente,
        // ignorando se a letra digitada está em maiúscula ("S") ou minúscula ("s").
        // Se o usuário digitar qualquer uma das duas opções, o retorno será verdadeiro (true).
        /* Exemplo visual:
           Usuário digita "S" -> "S".equalsIgnoreCase("s") -> true
           Usuário digita "s" -> "s".equalsIgnoreCase("s") -> true
           Usuário digita "n" -> "n".equalsIgnoreCase("s") -> false */
        var isEmancipated = scanner.next().equalsIgnoreCase("s");

        // O método '.next()' captura a entrada do usuário como String.
        // O método '.equals("s")' faz a comparação de igualdade textual de forma segura.
        // Se o usuário digitar exatamente "s", o retorno será verdadeiro (true), caso contrário, falso (false).
        // var isEmancipated = scanner.next().equals("s");


        // --- PROCESSAMENTO E CONDIÇÃO ---

        // A estrutura condicional verifica as regras de negócio baseadas na idade e emancipação.
        /* Regras lógicas:
           - Se age >= 18: Pode dirigir.
           - Se age entre 16 e 17 E for emancipado: Não pode dirigir (conforme lógica do bloco). */
        if (age >= 18 || (age >=16 && isEmancipated)){
            // O 'printf' exibe o texto formatado. Aqui usamos '%s' para Strings ou inteiros convertidos
            // no texto e '%n' para quebrar a linha de forma independente do sistema operacional.
            System.out.printf("%s, você tem %d anos e pode dirigir %n", name, age);

        } /* else if (age >= 16 && isEmancipated) {
            // O operador lógico '&&' representa o AND (E). Ambos os lados precisam ser verdadeiros
            // (idade maior/igual a 16 E ser emancipado) para que o bloco seja executado.
            // O caractere '\n' força a quebra de linha na saída de texto.
            System.out.printf("%s, apesar de ter %s anos, você é emancipado e pode dirigir \n", name, age);
            
        } */ else {
            System.out.printf("%s, você não pode dirigir \n", name);
        }

        // --- SAÍDA DE DADOS E FINALIZAÇÃO ---

        System.out.println("Fim da execução!");

        // O método '.close()' encerra o objeto Scanner, liberando o recurso de memória do sistema.
        scanner.close();
    }
}
```
