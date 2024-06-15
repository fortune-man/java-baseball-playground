import java.util.Random;
import java.util.Scanner;

import static java.lang.String.valueOf;

// 기능 목록 정의
// 문자열에 존재하는 ? 하나를 0 또는 1로 바꾼다
// 문자열 앞의 숫자가 연속될 경우 1개 이상을 지운다
// 문자열 뒤의 숫자가 연속될 경우 1개 이상을 지운다
// 준범과 명섭의 차례를 반환한다
// 패배를 정의한다 (더 이상 할 수 있는 행동이 없는 경우)

public class DeleteString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        // 기능 목록 정의
        // 문자열 S를 입력받으면 연속 여부를 가장 앞의 숫자와 가장 뒤의 숫자 순서로 검사
        char[] arrayFirst = S.toCharArray();
        for (int i = 0; i < S.length(); i++) {
            if(arrayFirst[i] == arrayFirst[i+1]) {
                // 연속된 숫자는 1개 이상 제거
                S = S.substring(i);
            }
        }
        char[] arrayLast = S.toCharArray();
        for (int i = S.length(); i > 0 ; i--) {
            if(arrayLast[i] == arrayLast[i-1]) {
                // 연속된 숫자는 1개 이상 제거
                S = S.substring(0, i);
            }
        }

        // 준범과 명섭의 순서로 차례를 주고 받으며 진행
        // 준범 true, 명섭 false
        boolean turn = false;


        // 더 이상 연속되는 숫자가 없는 경우 차례 정보를 저장
        // 저장된 차례 정보를 통해 준범과 명섭의 승패 결과를 return
        // return 결과를 출력
        if (S.length() < 2) {
            System.out.println(getWinner(turn));
        }

        sc.close();
    }

    private static int getWinner(boolean turn) {
        if (turn) {
            return  1;
        }
        return 0;
    }


    // 승부는 성장의 기회
    // 경쟁은 언제나 좋은것
    // 보자.. 먹히나 안먹히나
}
