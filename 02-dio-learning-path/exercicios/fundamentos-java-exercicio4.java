import java.util.Scanner;
import java.io.*;

public class Exercise4 {


    public static void main(String[] args){

        var scanner = new Scanner(System.in);

        System.out.println("Insira o Primeiro nome: ");
        var firstName = scanner.next();

        System.out.println("Qual a sua idade: ");
        var firstAge = scanner.nextInt();

        System.out.println("Insira o segundo nome: ");
        var secondName = scanner.next();

        System.out.println("Qual sua idade: ");
        var secondAge = scanner.nextInt();

        int result;

        if (firstAge < secondAge) {
            result = secondAge - firstAge;
        } else {
            result = firstAge - secondAge;
        }

        System.out.printf("A diferença entre %s e %s é de %d anos! %n", firstName, secondName, result);

    }
}
