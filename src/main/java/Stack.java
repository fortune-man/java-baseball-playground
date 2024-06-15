import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private List<T> stack;
    private int size;

    public Stack() {
        this.stack = new ArrayList<>();
        this.size = stack.size();
    }

    // 요소 추가하는 stack push
    public void push(T stringOrInteger) {
        stack.add(stringOrInteger);
    }

    // 요소 제거와 반환하는 stack pop
    public T pop() {
        try {
            // 입력값 널 체크
            if (isValid()) {
                throw new NullPointerException("비어있는 값이 입력되었습니다. \n 올바른 값을 입력해주세요");
            }
            // 가장 최근에 추가된 요소 제거후 최상위값 return
            return stack.remove(stack.size() - 1);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


    private boolean isValid() {
        return stack.isEmpty();
    }
}
