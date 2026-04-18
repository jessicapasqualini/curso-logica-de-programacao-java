package estrutura.sequencial;

/**
 * Enunciado:
 *
 * Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário.
 * A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto.
 * As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01.
 * A seguir mostre a relação de notas necessárias.
 *
 * Entrada
 * O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).
 *
 * Saída
 * Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.
 *NOTAS:
 * 5 nota(s) de R$ 100.00
 * 1 nota(s) de R$ 50.00
 * 1 nota(s) de R$ 20.00
 * 0 nota(s) de R$ 10.00
 * 1 nota(s) de R$ 5.00
 * 0 nota(s) de R$ 2.00
 * MOEDAS:
 * 1 moeda(s) de R$ 1.00
 * 1 moeda(s) de R$ 0.50
 * 0 moeda(s) de R$ 0.25
 * 2 moeda(s) de R$ 0.10
 * 0 moeda(s) de R$ 0.05
 * 3 moeda(s) de R$ 0.01
 *
 * Obs: Utilize ponto (.) para separar a parte decimal.
 */

import java.util.Locale;
import java.util.Scanner;

public class beecrowd1021 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double N = input.nextDouble();

        int valor = (int) Math.round(N * 100); // N * 100: transforma reais em centavos; Math.round(...): arredonda corretamente; (int): converte para inteiro

        // Notas //
        int nota100 = valor / 10000; // valor / unidade → descobre quantas notas - 100 reais = 10000 centavos
        valor %= 10000; // valor % unidade → guarda o que sobrou para a próxima etapa

        int nota50 = valor / 5000;
        valor %= 5000;

        int nota20 = valor / 2000;
        valor %= 2000;

        int nota10 = valor / 1000;
        valor %= 1000;

        int nota5 = valor / 500;
        valor %= 500;

        int nota2 = valor / 200;
        valor %= 200;

        // Moedas //
        int moeda1 = valor / 100; // 1 real = 100 centavos
        valor %= 100;

        int moeda50 = valor / 50;
        valor %= 50;

        int moeda25 = valor / 25;
        valor %= 25;

        int moeda10 = valor / 10;
        valor %= 10;

        int moeda05 = valor / 5;
        valor %= 5;

        int moeda01 = valor;

        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00%n", nota100);
        System.out.printf("%d nota(s) de R$ 50.00%n", nota50);
        System.out.printf("%d nota(s) de R$ 20.00%n", nota20);
        System.out.printf("%d nota(s) de R$ 10.00%n", nota10);
        System.out.printf("%d nota(s) de R$ 5.00%n", nota5);
        System.out.printf("%d nota(s) de R$ 2.00%n", nota2);

        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00%n", moeda1);
        System.out.printf("%d moeda(s) de R$ 0.50%n", moeda50);
        System.out.printf("%d moeda(s) de R$ 0.25%n", moeda25);
        System.out.printf("%d moeda(s) de R$ 0.10%n", moeda10);
        System.out.printf("%d moeda(s) de R$ 0.05%n", moeda05);
        System.out.printf("%d moeda(s) de R$ 0.01%n", moeda01);

        input.close();
    }
}