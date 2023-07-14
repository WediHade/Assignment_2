package Assignment9;

public class QueueTest {
    public static void main(String[] args) {

        ArrayQueueImpl test = new ArrayQueueImpl();

        int size = test.size();
        //for ()

        test.enqueue(1);
        test.enqueue(2);
        test.enqueue(3);
        test.enqueue(4);
        test.enqueue(5);

        test.enqueue(6);
        test.enqueue(7);
        test.enqueue(8);
        test.enqueue(9);
        test.enqueue(10);

        test.enqueue(11);
        test.enqueue(12);
        test.enqueue(13);
        test.enqueue(14);

        System.out.println(test);
        System.out.println(test.peek());
        System.out.println("Size is " + test.size());
        test.peek();

        System.out.println(test.dequeue());
        System.out.println(test);
        System.out.println("Size is " + test.size());
        System.out.println(test.isEmpty());
    }
}
