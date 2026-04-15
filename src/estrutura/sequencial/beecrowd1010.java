package estrutura.sequencial;

/**
 * Enunciado:
 *
 * Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
 * o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
 * Após, calcule e mostre o valor a ser pago.
 *
 * Entrada
 * O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros
 * e um valor com 2 casas decimais.
 *
 * Saída
 * A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois
 * pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.
 */

import java.util.Locale;
import java.util.Scanner;

public class beecrowd1010 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int codigoPeca1, codigoPeca2, quantidadePecas1, quantidadePecas2;
        double preco1, preco2, valorPago;

        codigoPeca1 = input.nextInt();
        quantidadePecas1 = input.nextInt();
        preco1 = input.nextDouble();

        codigoPeca2 = input.nextInt();
        quantidadePecas2 = input.nextInt();
        preco2 = input.nextDouble();

        valorPago = (preco1 * quantidadePecas1) + (preco2 * quantidadePecas2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPago);

        input.close();
    }
}