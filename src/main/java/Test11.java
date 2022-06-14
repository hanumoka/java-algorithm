import java.util.Scanner;

/**
 * 문자열 압축
 * 설명
 * <p>
 * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
 * 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
 * 단 반복횟수가 1인 경우 생략합니다.
 * <p>
 * 입력
 * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
 * <p>
 * <p>
 * 출력
 * 첫 줄에 압축된 문자열을 출력한다.
 * <p>
 * 입력예시1
 * KKHSSSSSSSE
 * <p>
 * 출력예시1
 * K2HS7E
 * <p>
 * 입력예시2
 * KSTTTSEEKFKKKDJJGG
 * <p>
 * 출력예시2
 * KST3SE2KFK3DJ2G2
 */
public class Test11 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.next();
            System.out.println(solution(input));
        }
    }

    public static String solution(String input) {

        char[] chars = input.toCharArray();

        String result = "";

        char beforeC = '@';
        int count = 1;

        for (char c : chars) {

            if (c == beforeC) {
                count++;
            } else {
                if (count == 1) {
                    result += c;
                } else {
                    result += count;
                    result += c;
                    count = 1;
                }
            }

            beforeC = c;
        }

        if(count != 1){
            result += count;
        }

        return result;
    }
}

