package ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         *  Faça um algoritmo que digite três números e colocá-los em ordem crescente. Use função para elaborar
         * */

        Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[3];

        for (int counter = 0; counter < numeros.length; counter ++) {
            String message = String.format("Digite o valor do %d numero", counter + 1);
            System.out.println(message);

            numeros[counter] = scanner.nextDouble();
        }

        numeros = sortNumbers(numeros);

        for (int counter = 0; counter < numeros.length; counter ++) {
            String message = String.format("%.2f", numeros[counter]);
            System.out.println(message);
        }
    }

    private static double[] sortNumbers(double[] numeros) {
        for (int i = 0; i < numeros.length; i ++) {
            for (int j = i; j < numeros.length; j ++) {
                if(numeros[i] > numeros[j]) {
                    double auxiliar = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = auxiliar;
                }
            }
        }

        return numeros;
    }
}
