package ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Criar um algoritmo que armazene números em
            dois vetores inteiros de cinco elementos cada.
            Gere e imprima o vetor soma.
        * */

        Scanner scanner = new Scanner(System.in);

        int[] numerosA = new int[5];
        int[] numerosB = new int[5];
        int[] numerosC = new int[5];

        for(int counter = 0; counter < 5; counter ++) {
            String messageA = String.format("Digite o %d valor do vetor A", counter + 1);
            String messageB = String.format("Digite o %d valor do vetor B", counter + 1);

            System.out.println(messageA);
            numerosA[counter] = scanner.nextInt();

            System.out.println(messageB);
            numerosB[counter] = scanner.nextInt();

            numerosC[counter] = numerosA[counter] + numerosB[counter];
        }

        for (int counterShowC = 0; counterShowC < 5; counterShowC ++) {
            String message = String.format("%d", numerosC[counterShowC]);
            System.out.println(message);
        }
    }
}
