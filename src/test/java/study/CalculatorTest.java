package study;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.floorDiv;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * 요구사항
 * 사용자가 입력한 문자열 값에 따라 사칙연산을 수행할 수 있는 계산기를 구현해야 한다.
 * 문자열 계산기는 사칙연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정된다. 즉, 수학에서는 곱셈, 나눗셈이 덧셈, 뺄셈 보다 먼저 계산해야 하지만 이를 무시한다.
 * 예를 들어 "2 + 3 * 4 / 2"와 같은 문자열을 입력할 경우 2 + 3 * 4 / 2 실행 결과인 10을 출력해야 한다.
 */
public class CalculatorTest {

  private boolean operation(String index){
    return index.equals("+") || index.equals("-") || index.equals("*") || index.equals("/");
  }

  @DisplayName("입력값 숫자 / 연산기호 구분 테스트")
  @Test
  void testInput() {
    //given
    int expect = 10;
    //when
    Stack<Integer> number = new Stack<>();
    String input = "2 + 3 * 4 / 2";
    String[] index = input.split(" ");
    if(operation(index[0])){
      if (index.equals("+")){
        int add = Integer.parseInt(index) + Integer.parseInt(index);
        number.push(add);
      }
      if (index.equals("-")){
        int minus = Integer.parseInt(index) + Integer.parseInt(index);
        number.push(minus);

      }
      if (index.equals("*")){
        int multiple = Integer.parseInt(index) + Integer.parseInt(index);
        number.push(multiple);

      }
      if (index.equals("/")){
        int division = Integer.parseInt(index) + Integer.parseInt(index);
        number.push(division);
      }
    }

    Integer actual = number.peek();


    assertEquals(expect, actual);

  }



}