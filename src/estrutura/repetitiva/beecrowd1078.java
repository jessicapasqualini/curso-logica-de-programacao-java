package estrutura.repetitiva;

/**
 * Enunciado:
 *
 * Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N:
 * 1 x N = N      2 x N = 2N        ...       10 x N = 10N
 *
 * Entrada
 * A entrada contém um valor inteiro N (2 < N < 1000).
 *
 * Saída
 * Imprima a tabuada de N.
 *
 **/

import java.util.Scanner;

public class beecrowd1078 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N, tabuada;

        N = input.nextInt();

        for(int i = 1; i <= 10; i++){
            tabuada = i * N;
            System.out.println( i + " x " + N + " = " +  tabuada);
        }
        input.close();
    }
}