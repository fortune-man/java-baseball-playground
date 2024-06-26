package study;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * 요구사항
 * 사용자가 입력한 문자열 값에 따라 사칙연산을 수행할 수 있는 계산기를 구현해야 한다.
 * 문자열 계산기는 사칙연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정된다. 즉, 수학에서는 곱셈, 나눗셈이 덧셈, 뺄셈 보다 먼저 계산해야 하지만 이를 무시한다.
 * 예를 들어 "2 + 3 * 4 / 2"와 같은 문자열을 입력할 경우 2 + 3 * 4 / 2 실행 결과인 10을 출력해야 한다.
 */
public class CalculatorTest {


    @ParameterizedTest
    @ValueSource(strings = {"1", "2", "3", "4"})
    void 문자열_입력_테스트(String request) {
        // given
        int[] expect = {1, 2, 3, 4};

        int actual = Integer.parseInt(request);

        boolean assertion = Arrays.stream(expect).anyMatch(i -> i == actual);
        assertTrue(assertion);
    }

    @DisplayName("사용자 입력 덧셈 연산")
    @ParameterizedTest
    @ValueSource(strings = {"1", "2"})
    void addGiven(String request) {
        // given
        System.setIn(new ByteArrayInputStream(request.getBytes()));
        Scanner scanner = new Scanner(System.in);

        int expect = 10;
        int actual = Integer.parseInt(scanner.nextLine());

        int[] adds = Arrays
                .stream(request.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // when
        for (int add : adds) {
            actual += add;
        }

        // then
        assertEquals(expect, actual);
    }

    @DisplayName("사용자 입력 뺄셈 연산")
    @ParameterizedTest
    @ValueSource(strings = {"3", "2"})
    void minusGiven(String request) {
        // given
        int expect = 3 - 2;
        int minus = Integer.parseInt(request);

        int actual = minus - minus;

        assertEquals(expect, actual);
    }

    @DisplayName("사용자 입력 곱셈 연산")
    @ParameterizedTest
    @ValueSource(strings = {"1", "2"})
    void multipleGiven(String request) {
        // given
        int expect = 1 * 2;
        int multiple = Integer.parseInt(request);

        int actual = multiple * multiple;

        assertEquals(expect, actual);
    }

    @DisplayName("사용자 입력 나눗셈 연산")
    @ParameterizedTest
    @ValueSource(strings = {"10", "5"})
    void divisionGiven(String request) {
        // given
        int expect = 10 / 5;
        int division = Integer.parseInt(request);

        int actual = division * division;

        assertEquals(expect, actual);
    }

    //dddsdkgewogdos;nagkewnkavd
}