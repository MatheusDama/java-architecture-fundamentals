
//Achei interessante, tenho que saber mais!!

public class Averaging {

    // implement the sum method here again
    public static int sum(int number1, int number2, int number3, int number4) {
        // write some code here
        //Quanto eu falo, para apenas retornar o elemento da soma: Quando esse método for chamado, vai apenas resultar na soma, seguida do seu retorno.
        return (number1 + number2 + number3 + number4);
    }

    public static double average(int number1, int number2, int number3, int number4) {
        //write some code here
        //return ((float) sum(number1, number2, number3, number4));
        // O que isso faz?
        int[] numbers = {number1,number2,number3,number4};

        //Isso vai pegar a soma, que retornamos o resultado no método "sum", e dividir pelo conjunto de elmentos presentes no array.
        return ((float) sum(number1, number2, number3, number4) / numbers.length);
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------

//Aqui faz o chamado dos ademais métodos, que pode resultar em um triangulo.

public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        // first part of the exercise
        int initial = 0;
        while (initial < number) {
            System.out.print("*");
            initial++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        // second part of the exercise
        //h = height e l = lenght/ Altura e largura, me sequência;
        for (int h = 1; h <= size; h++){
            for (int l = 1; l<= size; l++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        for (int h = 1; h <= height; h++){
            for(int w = 1; w <= width; w++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    //Não peguei como funciona, mas vamos lá...

    public static void printTriangle(int size) {
        // fourth part of the exercise
        for (int h = 1; h <= size; h++){
            printStars(h);
        }
    }
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------

public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int initial = 0;
        while (initial < number){
            System.out.print("*");
            initial++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        //Aqui vai ser adicionado o "space++" uma no looping for e outro dentro do looping for?
        /* 
        int space = 0;
        while (space <= number) {
            System.out.print(" ");
            space++;
        }
        */
        //Aqui foi a opção do looping for, o outro vai ser o looping while
        
        for (int space = 0; space < number; space++){
            System.out.print(" ");
            //space++; Sim, isso daria problema. Contabilizaria 1 do laço for, e mais um 1 dentro do mesmo. 
        }        
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = 1; i <= size; i++){
            printSpaces(size-i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        for (int i = 1; i <= height; i++){
            printSpaces(height - i);
            printStars(2 * i - 1); //Quantidades impares de estrelas
        }

        //Parte do tronco
        for (int i = 0; i< 2; i++){
            printSpaces(height -2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printStars(3);
        System.out.println("---");
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}

