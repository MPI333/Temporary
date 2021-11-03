package geekbrains.study;

public class MyLinkedStack<T> {
    private Node top;

    private class Node {
        T data;
        Node link;
    }

    MyLinkedStack() {
        this.top = null;
    }

    public void push(T element) {
        Node tmp = new Node();
        if (tmp == null) {
            System.out.println("Overflow!");
        } else {
            tmp.data = element;
            tmp.link = top;
            top = tmp;
        }
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Empty!");
            return null;
        }
        return top.data;
    }

    public void pop() {
        if (top == null) {
            System.out.println("Underflow!");
        } else {
            top = top.link;
        }
    }

    public void display() {
        if (top != null) {
            Node tmp = top;
            while (tmp != null) {
                System.out.print(tmp.data + " ");
                tmp = tmp.link;
            }
        } else {
            System.out.println("Underflow!");
        }
    }

    public boolean isEmpty() {
        return (top == null);
    }
}
