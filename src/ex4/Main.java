package ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Criar uma função chamada inverte que receba um vetor de números inteiros como parâmetro e seu
tamanho. A função deve inverter a ordem dos elementos do vetor de modo que o 1. vire o último e o 2.
vire o penúltimo e assim sucessivamente.
        * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");

        int arrayLength = scanner.nextInt();

        int numbers[] = new int[arrayLength];

        for (int counter = 0; counter < arrayLength; counter ++) {
            String message = String.format("Digite o valor do %d numero", counter + 1);
            System.out.println(message);

            numbers[counter] = scanner.nextInt();
        }

        System.out.println("Numeros invertidos");
        int[] invertedNumbers = inverte(numbers);

        for (int counter = 0; counter < arrayLength; counter ++) {
            String message = String.format("%d", invertedNumbers[counter]);
            System.out.println(message);
        }
    }

    private static int[] inverte(int[] numeros) {
        int[] invertNumbers = new int[numeros.length];

        int counter = 0;
        int maximum = numeros.length - 1;

        do {
            invertNumbers[counter] = numeros[maximum];
            counter ++;
            maximum --;
        } while (counter < numeros.length);

        return  invertNumbers;
    }
}
