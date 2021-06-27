package newstack.linkedlist.myinterface;

public interface StackADT<E> {
    void push(E data);
    void pop();
    E peek();
    int size();
    boolean isEmpty();
    void traverse();
}
