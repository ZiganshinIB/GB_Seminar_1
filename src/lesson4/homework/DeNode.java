package lesson4.homework;

import lesson4.sample.Node;

public class DeNode<T> {
    private DeNode<T> prevision;
    private DeNode<T> next;
    private T value;
    DeNode(T value){
        this.next = null;
        this.prevision = null;
        this.value = value;
    }

    void setNext(DeNode<T> next) {
        this.next = next;
    }

    void setPrevision(DeNode<T> prevision){
        this.prevision = prevision;
    }

    DeNode<T> getNext(){
        return this.next;
    }

    DeNode<T> getPrevision(){
        return this.prevision;
    }

    T getValue(){
        return this.value;
    }

    void setValue(T value){
        this.value = value;
    }


}
