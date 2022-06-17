package 등수구하기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 5
 * 87 89 92 100 76
 */
public class Main {
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
        List<Integer> tmpList = new ArrayList<>();

        int beforeBigNum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            int bigNum = 0;
            for (int j = 0; j < inputArray.length; j++) {
                if (beforeBigNum == 0) {
                    if (inputArray[j] > bigNum) {
                        bigNum = inputArray[j];
                    }
                } else {
                    if (inputArray[j] > bigNum && inputArray[j] < beforeBigNum) {
                        bigNum = inputArray[j];
                    }
                }
            }
            beforeBigNum = bigNum;
            tmpList.add(bigNum);
        }

        int[] resArr = new int[inputArray.length];

        for (int i = 0; i < tmpList.size(); i++) {
            for (int j = 0; j < inputArray.length; j++) {
                if (tmpList.get(i) == inputArray[j]) {
                    resArr[j] = i + 1;
                }
            }
        }

        for (int i = 0; i < resArr.length; i++) {
            if (i == 0) {
                res = resArr[i] + "";
            } else {
                res = res + " " + resArr[i];
            }
        }

        return res;
    }
}
