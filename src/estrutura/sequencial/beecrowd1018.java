package estrutura.sequencial;

/**
 * Enunciado:
 *
 * Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto.
 * As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.
 *
 * Entrada
 * O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).
 *
 * Saída
 * Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido.
 *
 * 576
 * 5 nota(s) de R$ 100,00
 * 1 nota(s) de R$ 50,00
 * 1 nota(s) de R$ 20,00
 * 0 nota(s) de R$ 10,00
 * 1 nota(s) de R$ 5,00
 * 0 nota(s) de R$ 2,00
 * 1 nota(s) de R$ 1,00
 *
 * Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
 */

import java.util.Scanner;

public class beecrowd1018 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N, quociente, notasDe100, notasDe50, notasDe20, notasDe10, notasDe5, notasDe2, notasDe1;

        N = input.nextInt();

        notasDe100 = N / 100;
        quociente = N % 100;

        notasDe50 = quociente / 50;
        quociente = quociente % 50;

        notasDe20 = quociente / 20;
        quociente = quociente % 20;

        notasDe10 = quociente / 10;
        quociente = quociente % 10;

        notasDe5 = quociente / 5;
        quociente = quociente % 5;

        notasDe2 = quociente / 2;
        notasDe1 = quociente % 2;

        System.out.println(N);
        System.out.println(notasDe100 + " nota(s) de R$ 100,00");
        System.out.println(notasDe50 + " nota(s) de R$ 50,00");
        System.out.println(notasDe20 + " nota(s) de R$ 20,00");
        System.out.println(notasDe10 + " nota(s) de R$ 10,00");
        System.out.println(notasDe5 + " nota(s) de R$ 5,00");
        System.out.println(notasDe2 + " nota(s) de R$ 2,00");
        System.out.println(notasDe1 + " nota(s) de R$ 1,00");

        input.close();
    }
}