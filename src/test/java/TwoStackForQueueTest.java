import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoStackForQueueTest {

    private TwoStackForQueue<String> queue;

    @BeforeEach
    void setUp() {
        queue = new TwoStackForQueue<>();
    }


    @Test
    void 인큐가_정상이면_널체크_건너뜀() {
        queue.enqueue("hello");
        assertFalse(queue.isEmpty());
    }

    @Test
    void 널체크_유효시_예외_처리() {
        assertThrows(NullPointerException.class, () -> {
            queue.enqueue(null);
        });

        assertThrows(NullPointerException.class, () -> {
            queue.enqueue("");
        });

        assertThrows(NullPointerException.class, () -> {
            queue.enqueue("               ");
        });
    }

    @Test
    void 큐에_가장_먼저_추가된_요소가_제거() {
        String[] given = {"two", "stack", "for", "implements", "queue"};

        for (String value : given) {
            queue.enqueue(value);
        }

        assertEquals("two", queue.dequeue());
        assertEquals("stack", queue.dequeue());
        assertEquals("for", queue.dequeue());
        assertEquals("implements", queue.dequeue());
        assertEquals("queue", queue.dequeue());
    }
}