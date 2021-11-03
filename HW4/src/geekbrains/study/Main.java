package geekbrains.study;

public class Main {

    public static void main(String[] args) {
        // Create MyLinkedStack
        MyLinkedStack<Integer> myLinkedStack = new MyLinkedStack<>();

        // Insert elements
        myLinkedStack.push(1);
        myLinkedStack.push(2);
        myLinkedStack.push(3);

        // Display elements
        myLinkedStack.display();

        // Peek top element
        myLinkedStack.peek();

        // Delete element
        myLinkedStack.pop();

        // Display elements
        myLinkedStack.display();
    }

}
