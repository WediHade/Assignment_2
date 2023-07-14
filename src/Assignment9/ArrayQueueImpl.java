package Assignment9;

import java.util.Arrays;

public class ArrayQueueImpl {

    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;
    public int peek() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front + 1];
    }
    public void enqueue(int obj){

        if(rear == arr.length)
            resize();
        arr[rear] = obj;
        rear++;
    }
    public int dequeue() {

        if (rear == (front + 1)) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int x = arr[front + 1];
        front++;
        return x;
    }
    public boolean isEmpty(){

        if ( rear == (front + 1))
            return true;
        return false;
    }
    public int size(){

        return rear - (front + 1);
    }
    private void resize(){

        int [] temp = new int[arr.length * 2];
        System.arraycopy(arr, 0,temp, 0, size());
        arr = temp;
    }
    @Override
    public String toString(){
        return Arrays.toString(Arrays.copyOfRange(arr, front + 1, rear));
    }
}
