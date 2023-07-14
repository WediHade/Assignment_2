package Assignment9.Stack;

public class LinkedStackMain {
    public static void main(String[] args) {
        LinkedStack test = new LinkedStack();
        test.push(1);
        test.push(2);
        test.push(3);
        test.push(4);
        test.push(5);
        test.push(6);

        System.out.println(test);

        test.pop();
        System.out.println(test);
        test.pop();
        //test.pop();
        System.out.println(test.peek());
        System.out.println("Size of linked list: " + test.size());
    }
}
