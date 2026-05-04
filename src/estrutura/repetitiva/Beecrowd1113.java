package estrutura.repetitiva;

/**
 * Enunciado:
 *
 * Leia uma quantidade indeterminada de duplas de valores inteiros X e Y.
 * Escreva para cada X e Y uma mensagem que indique se estes valores foram digitados em ordem crescente ou
 * decrescente.
 *
 * Entrada
 * A entrada contém vários casos de teste. Cada caso contém dois valores inteiros X e Y.
 * A leitura deve ser encerrada ao ser fornecido valores iguais para X e Y.
 *
 * Saída
 * Para cada caso de teste imprima “Crescente”, caso os valores tenham sido digitados na ordem crescente,
 * caso contrário imprima a mensagem “Decrescente”.
 *
 **/

import java.util.Scanner;

public class Beecrowd1113 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int X, Y;

        X = input.nextInt();
        Y = input.nextInt();

        while (X != Y) {
            if (X < Y) {
                System.out.println("Crescente");
            }
            else {
                System.out.println("Decrescente");
            }
            X = input.nextInt();
            Y = input.nextInt();
        }
        input.close();
    }
}