package org.example.exerc2;

import java.util.Scanner;

public class Exer2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número inteiro: ");
        int numero = scanner.nextInt();

        boolean pertence = pertenceNaSequencia(numero);

        if (pertence) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean pertenceNaSequencia(int numero) {
        if (numero == 0 || numero == 1) {
            return true;
        }

        int anterior = 0;
        int atual = 1;
        while (atual < numero) {
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        return atual == numero;
    }
}


