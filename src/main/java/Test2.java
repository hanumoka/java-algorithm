import java.util.Scanner;

/**
 * 2. 대소문자 변화
 *
 * 설명
 *  - 대소문자와 소문자가 같이 종재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성
 *
 * 입력
 *  - 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
 *  - 문자열은 영어 알파벳으로만 구성되어 있습니다.
 *
 * 출력
 *  - 첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
 *
 * 예시 입력1
 *  - StuDY
 *
 * 예시 출력1
 *  - sTUdy
 */
public class Test2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr1 = scanner.nextLine();

        solution(inputStr1);
    }

    public static void solution(String inputStr){
//        System.out.println("solution start...");
        char [] chars = inputStr.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();

        for(char c : chars){
            if(Character.isUpperCase(c)){
                stringBuilder.append(String.valueOf(c).toLowerCase());
            }else {
                stringBuilder.append(String.valueOf(c).toUpperCase());
            }
        }

        System.out.println(stringBuilder);
    }

}
