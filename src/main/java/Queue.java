import java.util.LinkedList;

public class Queue<T> {

    private LinkedList<T> queue;

    public Queue() {
        this.queue = new LinkedList<>();
    };

    // 데이터 추가
    public void enqueue(T data) {
        if (data.equals(null)) {
            throw new NullPointerException("정확한 입력이 필요해요!");
        }
        // 큐 마지막에 데이터 추가
        queue.addLast(data);
    }

    public T dequeue() {
        // 널체크
        if (isValid()) {
            throw new NullPointerException("정확한 입력이 필요해요!");
        }
        // 가장 먼저 추가된 데이터를 제거하고 return
        return queue.removeFirst();
    }

    public boolean isValid() {
        return queue.isEmpty();
    }


}
