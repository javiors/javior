package lList;

/**
 * Created by javior on 15/6/20.
 */
public class Node<T> {
    public T getValue() {
        return value;
    }

    public Node(T value, Node next) {
        this.value = value;
        this.next = next;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    private T value;
    private Node next;

    @Override
    public String toString(){
        return this.value.toString();
    }

}
