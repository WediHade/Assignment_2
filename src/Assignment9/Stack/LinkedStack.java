package Assignment9.Stack;

import java.util.Arrays;
import java.util.LinkedList;

class LinkedStack implements StackInterface {
    class Node {
        Object value;
        Node next;
        Node prev;
    }

    private Node header;
    private Node topIndex;

    public LinkedStack() {
        header = new Node();
        topIndex = header;
    }

    public void push(Object item) {
        Node node = new Node();
        node.value = item;

        topIndex.next = node;
        node.prev = topIndex;
        topIndex = node;

    }

    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }

        Object currentValue = topIndex.value;
        topIndex.prev.next = null;
        topIndex = topIndex.prev;
        return currentValue;
    }

    public Object peek() {
        if (isEmpty()) return null;
        return topIndex.value;
    }

    public boolean isEmpty() {
        return topIndex == header;
    }

    public int size() {
        if (isEmpty()) return 0;

        int size = 0;
        Node startNode = header.next;
        while (startNode != null) {
            size++;
            startNode = startNode.next;
        }
        return size;
    }

    @Override
    public String toString() {
        Node node = header;
        StringBuilder output = new StringBuilder();
        while (node != null) {
            output.append(node.value);
            output.append(" -> ");
            node = node.next;
        }
        return output.toString();
    }
}

