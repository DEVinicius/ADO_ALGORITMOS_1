package ex3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        * Criar um algoritmo que receba a qtde de elementos para um vetor. Carregar o vetor com os N elementos
de números inteiros. Criar uma função qu retorne o menor dos números informados
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

        String message = String.format("O menor numero desse vetor eh: %d", getMinimumValue(numbers));
        System.out.println(message);
    }

    private static int getMinimumValue(int[] numbers) {
        int minimum = numbers[0];

        for (int counter = 0; counter < numbers.length; counter++) {
            if(numbers[counter] < minimum) {
                minimum = numbers[counter];
            }
        }

        return minimum;
    }
}
