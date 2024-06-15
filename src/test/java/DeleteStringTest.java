import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Random;

import static java.lang.String.valueOf;
import static org.junit.jupiter.api.Assertions.*;


class DeleteStringTest {

    @Test
    void 물음표가_있을_경우_0_또는_1을_반환() {
        String S = "0, 1, ? ";
        for(char index : S.toCharArray()) {
            if (valueOf(index).equals("?")) {
                Random random = new Random();
                int temp = random.nextInt(1);
            }
        }

        assertEquals(S, "0,1,1");
    }
    // 문자열 앞의 숫자가 연속될 경우 1개 이상을 지운다
    // 성공은 실패가 주는 패배감을 진정으로 두려워하지 않을 때 시작된다
    @Test
    void 문자열_앞의_숫자가_연속될_경우_1개_이상을_지운다() {
        String given = "110";

        char[] givenCharArray = given.toCharArray();
        for (int i = 0; i < givenCharArray.length; i++) {
            boolean valid = givenCharArray[i] == givenCharArray[i + 1];
            if (valid) {
                given.replace(givenCharArray[i], givenCharArray[i + 1]);
            }
        }


    }
// 문자열 뒤의 숫자가 연속될 경우 1개 이상을 지운다
    @Test
    void 문자열_뒤의_숫자가_연속될_경우_1개_이상을_지운다() {
        String given = "0011110000011000000";

        String[] givenArray = new String[given.length()];


        for (String index : givenArray) {
            // 성공은 실패가 주는 패배감을 진정으로 두려워하지 않을 때 시작된다
            // 매달린다고 뭐가 되나

        }
    }
// 준범과 명섭의 차례를 반환한다
    @Test
    void 준범과_명섭의_차례를_반환한다() {
        boolean joonbeom = false;
        boolean myeongsub = false;
    }
// 패배를 정의한다 (더 이상 할 수 있는 행동이 없는 경우)
    @ParameterizedTest
    @ValueSource(strings = {"0", "1", ""})
    void 패배를_정의한다(String given) {
        boolean end = false;
        String givenZero = "0";
        String givenOne = "1";
        String givenNull = "";
        if (given.equals(givenZero)) {
            end = true;
        }
        if (given.equals(givenOne)) {
            end = true;
        }
        if (given.equals(givenNull)) {
            end = true;
        }

        // 승부는 성장의 기회


    }
}