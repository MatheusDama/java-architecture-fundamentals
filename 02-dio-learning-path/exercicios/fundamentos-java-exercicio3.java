

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args){

        var scanner = new Scanner(System.in);

        System.out.println("Insira o valor da base: ");
        float base = scanner.nextFloat();

        System.out.println("Insira o valor da altura: ");
        float height = scanner.nextFloat();

        float value = base * height;

        System.out.printf("A área do retângulo com base %.2f e altura * %.2f é: %.2fm² %n", base, height, value);

        scanner.close();

    }

}
