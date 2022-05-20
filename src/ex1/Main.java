package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Um número é capicua quando lido da esquerda para a
        direita ou da direita para a esquerda. O ano 2002 é um
        ano capicua. Elabore uma função que verifique essa
        característica.
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        String numero = scanner.next();

        isCapicua(numero);
    }

    private static void isCapicua(String numero) {
        String inverseNumber = "";

        for (int counterLetter = numero.length(); counterLetter > 0; counterLetter --) {
            inverseNumber = inverseNumber + numero.charAt(counterLetter - 1);
        }

        if(numero.equals(inverseNumber)) {
            System.out.println("Numero Capicua");
        } else {
            System.out.println("Não é capicua");
        }
    }
}
