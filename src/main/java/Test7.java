import java.util.Scanner;

/**
 * 설명
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문
 * 문자열이라고 한다.
 * 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES",
 * 회문 문자열이 아니면 "NO" 를 출력하는 프로그램을 작성해라
 * <p>
 * 입력
 * 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어진다.
 * <p>
 * 출력
 * 첫 먼째 줄에 회문 문자열인지 결과를 YES 또는 NO로 출력한다.
 * <p>
 * 예시 입력
 * gooG
 * <p>
 * 예시 출력
 * YES
 */
public class Test7 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            String input = scanner.next();
            System.out.println(solution(input));
        }
    }

    public static String solution(String input) {

        boolean isCircularLetter = true;

        char[] chars = input.toLowerCase().toCharArray();

        int lf = 0;
        int rf = chars.length - 1;

        while (rf >= lf) {
            if (chars[lf] != chars[rf]) {
                isCircularLetter = false;
                break;
            }
            lf++;
            rf--;
        }

        if (isCircularLetter) {
            return "YES";
        } else {
            return "NO";
        }
    }

}
