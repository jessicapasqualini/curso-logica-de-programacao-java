package vetores;


/**
 * Faça um programa que leia N números inteiros e armazene-os
 * em um vetor. Em seguida, mostrar na tela todos os números
 * negativos lidos.
 */

import java.util.Scanner;

public class NumerosNegativos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N;

        N = input.nextInt();

        int [] vetor = new int[N];

        for (int i = 0; i < N; i++) {
            vetor[i] = input.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if (vetor[i] < 0) {
                System.out.println(vetor[i]);
            }
        }
        input.close();
    }
}