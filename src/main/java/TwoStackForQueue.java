import java.util.Stack;

public class TwoStackForQueue<T> {

    private Stack<T> input;
    private Stack<T> output;

    public TwoStackForQueue() {
        this.input = new Stack<>();
        this.output = new Stack<>();
    }

    // 인큐로 데이터를 추가한다
    public void enqueue(T data) {
        // 널체크
        if (data.equals(null) || (data instanceof String
                && ((String) data)
                .trim()
                .isEmpty())) {
            throw new NullPointerException("입력이 누락되었습니다");
        }
        input.push(data);
    }

    public T dequeue() {
        if(output.isEmpty()) {
            while(!input.isEmpty()){
                output.push(input.pop());
            }
        }
        // output 스택에서 요소를 pop하여 반환
        return output.pop();
    }

    public boolean isEmpty() {
        return input.isEmpty() && output.isEmpty();
    }
}
