package estrutura.sequencial;

/**
 * Enunciado:
 *
 * Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica,
 * e informe-o expresso no formato horas:minutos:segundos.
 *
 * Entrada
 * O arquivo de entrada contém um valor inteiro N.
 *
 * Saída
 * Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos,
 * conforme exemplo fornecido 0:9:16.
 */

import java.util.Locale;
import java.util.Scanner;

public class beecrowd1019 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int n, hora, minutos, segundos;

        n = input.nextInt();

        hora = n /3600;
        minutos = (n % 3600) / 60;
        segundos = n % 60;

        System.out.println(hora + ":" + minutos + ":" + segundos);

        input.close();
    }
}