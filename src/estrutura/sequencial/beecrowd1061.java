package estrutura.sequencial;

/**
 * Enunciado:
 *
 * Pedrinho está organizando um evento em sua Universidade. O evento deverá ser no mês de Abril,
 * iniciando e terminando dentro do mês. O problema é que Pedrinho quer calcular o tempo que o evento vai durar,
 * uma vez que ele sabe quando inicia e quando termina o evento.
 *
 * Sabendo que o evento pode durar de poucos segundos a vários dias, você deverá ajudar Pedrinho a calcular a duração deste evento.
 *
 * Entrada
 * Como entrada, na primeira linha vai haver a descrição “Dia”, seguido de um espaço e o dia do mês no qual o evento vai começar.
 * Na linha seguinte, será informado o momento no qual o evento vai iniciar, no formato hh : mm : ss.
 * Na terceira e quarta linha de entrada haverá outra informação no mesmo formato das duas primeiras linhas, indicando o término do evento.
 *
 * Saída
 * Na saída, deve ser apresentada a duração do evento, no seguinte formato:
 * W dia(s)
 * X hora(s)
 * Y minuto(s)
 * Z segundo(s)
 *
 * Obs: Considere que o evento do caso de teste para o problema tem duração mínima de 1 minuto..
 */

import java.util.Scanner;

public class beecrowd1061 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int W_dia1, X_hora1, Y_minuto1, Z_segundo1;
        int W_dia2, X_hora2, Y_minuto2, Z_segundo2;

        // Variáveis auxiliares para guardar os textos da entrada
        // Ex.: "Dia" e os ":" que aparecem no horário
        String texto;
        String doisPontos1, doisPontos2;

        // Lê a palavra "Dia"
        texto = input.next();
        W_dia1 = input.nextInt();
        X_hora1 = input.nextInt();
        // Lê o primeiro :
        doisPontos1 = input.next();
        Y_minuto1 = input.nextInt();
        // Lê o segundo :
        doisPontos2 = input.next();
        Z_segundo1 = input.nextInt();

        // Lê a palavra "Dia"
        texto = input.next();
        W_dia2 = input.nextInt();
        X_hora2 = input.nextInt();
        doisPontos1 = input.next();
        // Lê o primeiro :
        Y_minuto2 = input.nextInt();
        // Lê o segundo :
        doisPontos2 = input.next();
        Z_segundo2 = input.nextInt();

        // Converte a data/hora inicial para segundos totais
        int totalInicio = W_dia1 * 86400 + X_hora1 * 3600 + Y_minuto1 * 60 + Z_segundo1;

        // Converte a data/hora final para segundos totais
        int totalFim = W_dia2 * 86400 + X_hora2 * 3600 + Y_minuto2 * 60 + Z_segundo2;

        // Calcula a diferença entre o fim e o início
        int duracao = totalFim - totalInicio;

        // Calcula quantos dias completos existem na duração
        int W = duracao / (86400);
        duracao %= (86400);

        // Calcula quantas horas completas sobraram
        int X = duracao / (3600);
        duracao %= (3600);

        // Calcula quantos minutos completos sobraram
        int Y = duracao / 60;
        duracao %= 60;

        // O que sobrar serão os segundos
        int Z = duracao;

        System.out.println(W + " dia(s)");
        System.out.println(X + " hora(s)");
        System.out.println(Y + " minuto(s)");
        System.out.println(Z + " segundo(s)");

        input.close();
    }
}