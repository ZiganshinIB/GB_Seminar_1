package lesson4.sample;

public class Node<T> {
    Node<T> prevision;
    T value;
    Node(T value){
        this.value = value;
    }
}
