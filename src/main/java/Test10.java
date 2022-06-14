import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 가장 짧은 문자거리
 * 설명
 * <p>
 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
 * <p>
 * 입력
 * 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
 * 문자열의 길이는 100을 넘지 않는다.
 * <p>
 * 출력
 * 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
 * <p>
 * 입력예시
 * teachermode e
 * <p>
 * 출력예시
 * 1 0 1 2 1 0 1 2 2 1 0
 */
public class Test10 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine();
            String s = input.split(" ")[0];
            String t = input.split(" ")[1];

            System.out.println(solution(s, t));
        }
    }

    public static String solution(String s, String t) {

        List<Integer> tPos = new ArrayList<>();

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == t.charAt(0)) {
                tPos.add(i);
            }
        }

        String result = "";

        for (int i = 0; i < chars.length; i++) {
            int distance = 0;
            if (chars[i] != t.charAt(0)) {
                for(Integer ti : tPos){
                    int tmpDIs = Math.abs(ti - i);
                    if(distance ==0){
                        distance = tmpDIs;
                    }else if(tmpDIs < distance){
                        distance = tmpDIs;
                    }
                }
            }

            if (i == 0) {
                result += distance;
            } else {
                result += " " + distance;
            }

        }

        return result;
    }
}
