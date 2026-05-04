package estrutura.repetitiva;

/**
 * Enunciado:
 *
 * Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.
 *
 * Entrada
 * O arquivo de entrada contém dois valores inteiros.
 *
 * Saída
 * O programa deve imprimir um valor inteiro. Este valor é a soma dos valores ímpares que estão entre os
 * valores fornecidos na entrada que deverá caber em um inteiro.
 *
 **/

import java.util.Scanner;

public class Beecrowd1071 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int X, Y, soma, menor, maior;

        X = input.nextInt();
        Y = input.nextInt();

        soma = 0;

        if (X < Y) {
            menor = X;
            maior = Y;
        } else {
            menor = Y;
            maior = X;
        }

        for (int i = menor + 1; i < maior; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println(soma);

        input.close();
    }
}