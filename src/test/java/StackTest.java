import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private Stack<String> stack;

    @BeforeEach
    void setUp() {
        stack = new Stack<>();
        String[] lifo = {"last", "in", "first", "out"};

        // 스택에 요소를 추가
        for (String index : lifo) {
            stack.push(index);
        }
    }

    @Test
    void 비어있는_값_입력시_널_포인터_반환() {
        // given
        stack.push(""); // 입력값을 스택에 추가

        // when
        NullPointerException given = assertThrows(NullPointerException.class, () -> {
            stack.pop();
        });

        // then
        assertEquals("비어있는 값이 입력되었습니다. \n 올바른 값을 입력해주세요", given.getMessage());
    }

    @Test
    void 가장_최근에_추가된_데이터를_삭제한다() {

        //then

        // 정상 동작 체크
        assertEquals("out", stack.pop());
        assertEquals("first", stack.pop());
        assertEquals("in", stack.pop());
        assertEquals("last", stack.pop());
    }
}