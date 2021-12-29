package com.solvd.socialNetwork.utils.collections;

import java.util.Collection;

public class MyLinkedList<T> {
    private MyNode<T> head;
    private int counter;

    public MyLinkedList() {

    }

    public int getCounter() {
        return counter;
    }

    public void incrementCounter() {
        this.counter++;
    }

    public void decrementCounter() {
        this.counter--;
    }

    public void add(T t) {

        if (head == null) {
            head = new MyNode(t);
        }

        MyNode nodeTemp = new MyNode(t);
        MyNode currentNode = head;

        if (currentNode != null) {
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
        }
        currentNode.setNext(nodeTemp);
        incrementCounter();
    }

    public void add(long index, T t) {
        MyNode nodeTemp = new MyNode(t);
        MyNode currentNode = head;

        if (currentNode != null) {
            for (int i = 0; i < index && currentNode.getNext() != null; i++) {
                currentNode = currentNode.getNext();
            }
        }

        nodeTemp.setNext(currentNode.getNext());

        currentNode.setNext(nodeTemp);

        incrementCounter();
    }

    public T get(long index) {
        if (index < 0)
            return null;
        MyNode<T> currentNode = null;
        if (head != null) {
            currentNode = head.getNext();
            for (int i = 0; i < index; i++) {
                if (currentNode.getNext() == null)
                    return null;

                currentNode = currentNode.getNext();
            }
            return currentNode.getElement();
        }
        return (T) currentNode;

    }

    public boolean remove(long index) {

        if (index < 1 || index > size())
            return false;

        MyNode currentNode = head;
        if (head != null) {
            for (int i = 0; i < index; i++) {
                if (currentNode.getNext() == null)
                    return false;

                currentNode = currentNode.getNext();
            }
            currentNode.setNext(currentNode.getNext().getNext());

            decrementCounter();
            return true;

        }
        return false;
    }

    public int size() {
        return getCounter();
    }

    public String toString() {
        String output = "";

        if (head != null) {
            MyNode currentNode = head.getNext();
            while (currentNode != null) {
                output += "[" + currentNode.getElement().toString() + "]";
                currentNode = currentNode.getNext();
            }

        }
        return output;
    }

}
