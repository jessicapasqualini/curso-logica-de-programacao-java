package estrutura.condicional;

/*
 Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara.
 Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”,
 caso haja uma divisão por 0 ou raiz de numero negativo.

 Entrada
 Leia três valores de ponto flutuante (double) A, B e C.

 Saída
 Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular".
 Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem
 correspondente conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem.

 Exemplos de Entrada
 10.0 20.1 5.1
 Exemplos de Saída
 R1 = -0.29788
 R2 = -1.71212

 Exemplos de Entrada
 0.0 20.0 5.0
 Exemplos de Saída
 Impossivel calcular
 */

import java.util.Locale;
import java.util.Scanner;

public class beecrowd1036 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double A, B, C, R1, R2, delta;

        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();

        delta = Math.pow(B, 2) - 4 * A * C;

        if (A == 0 || delta < 0.0){
            System.out.println("Impossivel calcular");
        }
        else{
            R1 = (-B + Math.sqrt(delta)) / (2.0 * A);
            R2 = (-B - Math.sqrt(delta)) / (2.0 * A);

            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);
        }
        input.close();
    }
}
