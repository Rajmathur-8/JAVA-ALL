public class QueueMain {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);
        queue.enqueue(5);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(0);
        queue.enqueue(3);
        queue.display();
       System.out.println(queue.dequeue());
        queue.display();
        queue.enqueue(7);
        queue.display();
        System.out.println(queue.dequeue());
        queue.display();
        queue.enqueue(17);
        queue.display();
       System.out.println(queue.front());


    }
}
