import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    private Queue<Integer> queue;
    @BeforeEach
    void setUp() {
        queue = new Queue<>();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    void 큐에_요소를_추가하면_널체크가_실패후_가장_먼저_추가된_요소_제거됨(int data){
        queue.enqueue(data);
        assertFalse(queue.isValid());
        assertEquals(data, queue.dequeue());
    }

    @Test
    void 가장_먼저_추가된_요소가_제거된다() {
        int[] given = {1, 2, 3, 4, 5};
        for (int index : given) {
            queue.enqueue(index);
        }

        // FIFO로 먼저 추가된 값이 제거되는지 확인
        for(int expected : given) {
            assertEquals(expected, queue.dequeue());
        }
    }



    @Test
    void 널체크_유효시_익셉션() {
        // given
        String given = "정확한 입력이 필요해요!";

        // when
        NullPointerException exception = assertThrows(NullPointerException.class, () -> {
            queue.dequeue();
        });

        // then
        assertEquals(given, exception.getMessage());
    }
}