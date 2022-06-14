import java.util.Scanner;

/**
 * 설명
 * - 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 엉어 알파벳만 뒤집고
 *    특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요
 * 입력
 * - 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
 * 출력
 * - 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 *
 * 예시 입력1
 * - a#b!GE*T@S
 * 예시 출력1
 * - S#T!EG*b@a
 */
public class Test5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(solution(input));

    }

    public static String solution(String input){

        char[] chars = input.toCharArray();
        int lt = 0;
        int rt = chars.length -1;

        while(lt < rt){
            if(Character.isAlphabetic(chars[lt]) && Character.isAlphabetic(chars[rt])){
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                rt--;
            }else if(Character.isAlphabetic(chars[lt]) && !Character.isAlphabetic(chars[rt])){
                rt--;
            }
            else if(!Character.isAlphabetic(chars[lt]) && Character.isAlphabetic(chars[rt])){
                lt++;
            }else {
                lt++;
                rt--;
            }
        }

        return String.valueOf(chars);
    }
}
