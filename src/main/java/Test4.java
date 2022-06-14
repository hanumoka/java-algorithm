import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 설명 : N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 *
 * 입력
 *  - 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
 *  - 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
 *
 *  출력
 *  - N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
 *
 *  예시 입력1
 *  3
 *  good
 *  Time
 *  Big
 *
 *  예시 출력1
 *  doog
 *  emiT
 *  giB
 */
public class Test4 {
    public static void main( String [] args){
//        System.out.println("main start...");
        final int min = 3;
        final int max = 20;

        int inputNumber = 0;

        Scanner scanner = new Scanner(System.in);
        while(true){
            inputNumber =scanner.nextInt();
            if(inputNumber >= 3 && inputNumber <= 20){
                break;
            }
        }

        List<String> lists = new ArrayList<>();


        while(inputNumber > 0){
            char[] chars = String.valueOf(scanner.next()).toCharArray();
            StringBuilder stringBuilder = new StringBuilder();
            for(int i = chars.length - 1 ; i >= 0; i--){
                stringBuilder.append(chars[i]);
            }
            lists.add(String.valueOf(stringBuilder));

            inputNumber--;
        }

        for (String list : lists) {
            System.out.println(list);
        }

//        System.out.println("main end...");
    }

}
