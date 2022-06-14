import java.util.Scanner;
/**
 * 1. 문자 찾기
 * 설명
 * - 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
 * - 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
 * <p>
 * <p>
 * 입력
 * - 첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
 * - 문자열은 영어 알파벳으로만 구성되어 있습니다.
 * <p>
 * 출력
 * - 첫 줄에 해당 문자의 개수를 출력한다.
 * <p>
 * 입력예시
 * Computercooler
 * c
 * <p>
 * 출력예시
 * 2
 */
public class Test1 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Scanner 객체
        String firstInputString = scan.next().toLowerCase();
        String secondInputChar = scan.next().toLowerCase();

        char target = secondInputChar.charAt(0);
        solution(firstInputString, target);
    }

    public static void solution(String inputString, char target) {

        char[] chars = inputString.toCharArray();
        int count = 0;
//        for (int i = 0; i < chars.length; i++) {
//            if(chars[i] == target){
//                count++;
//            }
//        }

        for (char c : chars) {
            if(c == target){
                count++;
            }
        }

        // 결과출력
        System.out.println(count);

    }

}
