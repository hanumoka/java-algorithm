package 등수구하기;

import java.util.Scanner;

/**
 * 5
 * 87 89 92 100 76
 */
public class GoodMain {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int cnt = scanner.nextInt();
            scanner.nextLine();
            int[] array = new int[cnt];
            for (int i = 0; i < cnt; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.println(solution(array));
        }
    }

    public static String solution(int[] inputArray) {
        String res = "";

        int[] answer = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            int grade = 1;
            for (int j = 0; j < inputArray.length; j++) {
                if (inputArray[j] > inputArray[i]) {
                    grade++;
                }
            }
            answer[i] = grade;
        }

        for (int i = 0; i < answer.length; i++) {
            if (i == 0) {
                res = "" + answer[i];
            } else {
                res = res + " " + answer[i];
            }
        }

        return res;
    }
}
