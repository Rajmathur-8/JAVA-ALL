import java.util.*;

public class InBuildExamples {
    public static void main(String[] args) throws StackException {
       CustomStack stack = new DynamicStack(5);

    System.out.println(stack.push(30));
    stack.push(54);
    stack.push(10);
    stack.push(38);
    stack.push(75);
    stack.push(8);
        //stack.displayStack();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println();
//        stack.displayStack();
//

        Queue<Integer> queue = new LinkedList<>();

        queue.add(3);
        queue.add(6);
        queue.add(8);
        queue.add(7);
        queue.add(0);
        queue.add(2);
        queue.add(1);
        System.out.println(queue);
        queue.remove();
        queue.remove();
        System.out.println(queue);

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(12);
        deque.add(15);
        deque.add(19);
        deque.add(22);
        deque.addFirst(25);
        deque.addFirst(30);
        deque.addLast(5);
        deque.addLast(50);
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);

    }
}