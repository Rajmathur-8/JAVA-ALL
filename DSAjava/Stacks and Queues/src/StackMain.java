public class StackMain {
    public static void main(String[] args) throws StackException{
        CustomStack stack = new CustomStack(5);

        stack.push(58);
        stack.push(78);
        stack.push(85);
        stack.push(55);
        stack.push(100);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
