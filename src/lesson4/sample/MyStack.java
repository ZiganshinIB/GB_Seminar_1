package lesson4.sample;

public class MyStack<T> {
    private Node<T> top;
    private int count;

    public MyStack() {
        this.top = null;
        this.count = 0;
    }

    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.prevision = this.top;
        this.top = newNode;
        this.count++;
    }

    public T pop() {
        T result = this.top.value;
        this.top = this.top.prevision;
        this.count--;
        return result;
    }
}
