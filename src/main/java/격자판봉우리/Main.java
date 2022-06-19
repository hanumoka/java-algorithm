package 격자판봉우리;

import java.util.Scanner;

/**
 * 5
 * 5 3 7 2 3
 * 3 7 1 6 1
 * 7 2 5 3 4
 * 4 3 6 4 1
 * 8 7 3 5 2
 */
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            a = a + 2;
            scanner.nextLine();

            int[][] table = new int[a][a];

            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    if(i == 0 || i == a -1 || j == 0 || j == a -1){
                        table[i][j] = 0;
                    }else{
                        table[i][j] = scanner.nextInt();
                    }//else
                }//for
            }//for

            System.out.println(solution(table));
        }
    }

    public static int solution(int[][] table) {
        int result = 0;

        // 1. 봉우리 대상 찾기 , 상하좌우 값이 있는경우
        // 행 인덱스 범위 : 시작 + 1, 인덱스 길이 -1
        // 열 인덱스 범위 : 시박 + 1, 인덱스 길이 -1
        for (int i = 1; i < table.length - 1; i++) {
            for(int j = 1; j < table[i].length -1; j++){
                int target = table[i][j];

                int up = table[i][j-1];
                int down = table[i][j+1];
                int left = table[i-1][j];
                int right = table[i+1][j];

                if(target > up && target > down && target > left && target > right){
                    result++;
                }
            }
        }

        return result;
    }
}
