package estrutura.sequencial;

/**
 * Enunciado:
 *
 * Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2)
 * e calcule a distância entre eles, mostrando 4 casas decimais, segundo a fórmula:
 *
 * Distancia = raiz quadrada de (x2-x1) * (x2-x1) + (y2-y1) * (y2-y1)
 *
 * Entrada
 * O arquivo de entrada contém duas linhas de dados.
 * A primeira linha contém dois valores de ponto flutuante: x1 y1 e
 * a segunda linha contém dois valores de ponto flutuante x2 y2.
 *
 * Saída
 * Calcule e imprima o valor da distância segundo a fórmula fornecida, considerando 4 casas decimais..
 */

import java.util.Locale;
import java.util.Scanner;

public class beecrowd1015 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double x1, x2, y1, y2, Distancia;

        x1 = input.nextDouble();
        y1 = input.nextDouble();

        x2 = input.nextDouble();
        y2 = input.nextDouble();

        Distancia = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));

        System.out.printf("%.4f%n", Distancia);

        input.close();
    }
}