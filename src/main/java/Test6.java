import java.util.*;

/**
 * 중복문자제거
 * 설명
 * - 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는
 * 프로그램을 작성하세요ㅣ
 * <p>
 * 입력
 * - 첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
 * <p>
 * 출력
 * - 첫 줄에 중복문자가 제거된 문자열을 출력한다.
 * <p>
 * 입력예시
 * - ksekkset
 * <p>
 * 예시출력
 * - kset
 */
public class Test6 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.next();
            System.out.println(solution(input));
        }

    }

    public static String solution(String input) {

        StringBuilder result = new StringBuilder();
        char[] chars = input.toCharArray();
        for(char x : chars){
            boolean flag = false;
            for(char y : result.toString().toCharArray()){
                if(x == y){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                result.append(x);
            }
        }

        return result.toString();
    }
}
