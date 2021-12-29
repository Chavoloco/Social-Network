package com.solvd.socialNetwork.utils.collections.linkedList;

public class MyNode<T> {
    MyNode<T> next;
    T element;

    public MyNode(T elementValue){
        next = null;
        element = elementValue;
    }

    public MyNode(T elementValue, MyNode<T> nextValue){
        next = nextValue;
        element = elementValue;
    }

    public T getElement(){
        return element;
    }

    public void setElement(T elementValue){
    element = elementValue;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode nextValue) {
        next = nextValue;
    }
}
