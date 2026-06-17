
# Java 01

> We have to convert the actual code that we're writing-- our source code-- into a form the computer can execute-- binary 1s and 0s that it can execute.
> So what the compile does is convert the code that we write-- the source code that we write-- into a form that the computer can execute.

```text
  [ Seu Código ] (.java)
        │
        ▼
 ⚙️ Compilador (javac)
        │
        ▼
  [ Bytecode ] (.class)  ◄─── Este arquivo pode ser levado para QUALQUER sistema!
        │
        ▼
 ☕ Máquina Virtual Java (JVM)
        │
        ▼
[ Código de Máquina ] (010101 binário local)
```

### Programas Java

* O programa JAVA é executado dentro de um pedaço de código chamado *Java Virtual machine*. - O **JVM** emula o **CPU** e o computador que o programa está rodando, e traduz o **bytecode** que foi criado pelo compilador.


### Java Language

* ***Class***: - Basic units of code / - Describe data and logical of your program 
* ***Package***: - Intermediate logical code aggregation / - Group of classes
* **Module**: - High-level physical code aggregation / - Group of packages

  >This is a high-level physical code aggregation, and it allows you to override the lower-level code aggregation of the package and choose, explicitly, what parts of your code you want to expose for reuse and people to access and what parts you don't

Enquanto o **package**(pacote) é composto por **nenhum ou mais *classes* ** -- tipicamente um grupo de classes que são **LOGICAMENTE RELACIONADAS** juntas. 

* Temos o **module** (modulo), que sobre-escreve a agregação de código de nível menor, escolhendo assim, quais partes do seu código vocẽ gostaria de export

* **Java Syntax**: Java code is gouped into classes

  ```java
  package hr.app;
  public class Employee { // ◄─── class employee
    private String name; /* vars que armazena valore */
    private float salary; /* vars que armazena valore */
    public void setSalary(float value) { // ◄─── methods
      salary = value;
    }
    public String getName() { ◄─── // carrega o código e faz coisas
    ...
  ```
 <details>
   Olhando para o bloco de cima, observamos que a **Java Syntax** é agrupado por classes.
 </details>

 * **Java Exception Handling**(Exceção de linhas Java): Interrupt normal program execution when problems occur.


