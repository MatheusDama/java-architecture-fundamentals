
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
