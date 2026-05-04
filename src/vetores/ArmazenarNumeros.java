package vetores;

import java.util.Locale;
import java.util.Scanner;

/**
 * Enunciado:
 *
 * Fazer um programa para ler um número inteiro positivo N, depois ler N números
 * quaisquer e armazená-los em um vetor. Em seguida, mostrar na tela todos elementos
 * do vetor.
 *
 **/

public class ArmazenarNumeros {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int N;

        N = input.nextInt();

        double [] vetor = new double[N];

        for (int i = 0; i < N; i++) {
            vetor[i] = input.nextDouble();
        }
        for (int i = 0; i < N; i++) {
            System.out.printf("%.2f%n", vetor[i]);
        }
        input.close();
    }
}
