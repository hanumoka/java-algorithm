package 임시반장정하기;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int[][] table = new int[n][5];
            for(int i = 0 ; i < n; i++){
                for(int j = 0; j < 5; j++){
                    table[i][j] = scanner.nextInt();
                }
            }
            System.out.println(solution(n, table));
        }

    }

    public static int solution(int a, int[][] table) {

        int bigCnt = Integer.MIN_VALUE;
        int bigPos = -1;

        for (int i = 0; i < a; i++) {
            Set<Integer> same = new HashSet<>();
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < a; k++) {
                    if (i != k) {
                        if (table[i][j] == table[k][j]) {
                            same.add(k + 1);
                        }
                    }
                }//for
            }//for
            if (bigCnt < same.size()) {
                bigPos = (i + 1);
                bigCnt = same.size();
            }//if
        } //for

        return bigPos;
    }
}
