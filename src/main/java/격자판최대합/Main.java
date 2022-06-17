package 격자판최대합;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            scanner.nextLine();
            int[][] table = new int[a][a];

            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    table[i][j] = scanner.nextInt();
                }
                scanner.nextLine();
            }

            System.out.println(solution(table));
        }
    }

    public static int solution(int[][] table) {
        int answer = 0;

        // 대각선 합 구하기
        int aSum = 0; // 왼쪽 위에서 오른쪽 하단 합
        int bSum = 0; // 오른쪽 위에서 왼족 하단 합

        for (int i = 0; i < table.length; i++) {
            int widthSum = 0;
            int heightSum = 0;
            for (int j = 0; j < table[i].length; j++) {
                widthSum += table[i][j];
                heightSum += table[j][i];

                if (i == j) {
                    aSum += table[i][j];
                }

                if (i + j == table.length - 1) {
                    bSum += table[i][j];
                }
            }

            if (widthSum > answer) {
                answer = widthSum;
            }

            if (heightSum > answer) {
                answer = heightSum;
            }
        }// for

        if (aSum > answer) {
            answer = aSum;
        }

        if (bSum > answer) {
            answer = bSum;
        }

        return answer;
    }
}