package lesson4.homework;

import lesson4.sample.Node;

public class Deque<T> {
    private DeNode<T> head;
    private DeNode<T> tail;
    private int count;

    public Deque(){
        this.head = null;
        this.tail = null;
        this.count = 0;
    }


    public void enqueue(T value){
        DeNode<T> newElement = new DeNode<>(value);
        newElement.setPrevision(this.tail);
        if(this.head == null && this.tail == null) addFirstElement(newElement);
        else{
            this.tail.setNext(newElement);
            this.tail = newElement;
            count++;
        }
    }

    public T dequeue(){
        T target = this.head.getValue();
        this.head = this.head.getNext();
        this.head.setPrevision(null);
        return target;
    }

    public T first(){
        return this.head.getValue();
    }

    private void addFirstElement(DeNode<T> newElement){
        this.head = newElement;
        this.tail = newElement;
        this.count++;
    }
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("[ ");
        DeNode<T> current = this.head;
        while (null != current.getNext()){
            res.append(current.getValue().toString() + ", ");
            current = current.getNext();
        }
        res.append(current.getValue().toString());
        res.append(" ]");
        return res.toString();
    }
}
