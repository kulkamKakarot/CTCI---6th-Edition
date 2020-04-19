import java.util.Stack;

/**
 * sortStack
 */
public class sortStack {

    Stack<Integer> sort(Stack<Integer> s){
        Stack<Integer> newStack = new Stack<>();
        while(!s.empty()){
            int temp = s.pop();
            while(!newStack.empty() && newStack.peek() > temp){
                s.push(newStack.pop());
            }
            newStack.push(temp);
        }
        while (!newStack.empty()) {
            s.push(newStack.pop());
        }
        return s;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        sortStack s = new sortStack();

        stack.push(1);
        stack.push(5);
        stack.push(3);
        stack.push(12);
        stack.push(2);
        System.out.println("Unsorted stack: 1 --> 5 --> 3 --> 12 --> 2");
        Stack<Integer> s1 = s.sort(stack);
        System.out.print("Sorted stack:   ");
        int size = s1.size();
        for (int i = 0; i < size-1; i++) {
            int x = s1.pop();
            System.out.print(x+" --> ");
        }
        int x = s1.pop();
        System.out.print(x);
        /*OUTPUT: 
            Unsorted stack: 1 --> 5 --> 3 --> 12 --> 2
            Sorted stack:   1 --> 2 --> 3 --> 5 --> 12
        */
    }
}