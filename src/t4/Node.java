package t4;

/**
 * Implementation of a Circular Doubly Linked List in Java.
 * Separate Node class at the top. Followed by the list class.
 * Example and use test is in main method below.
 */

class Node {
    private int data;
    private Node next;
    private Node previous;


    //GETTERS AND SETTERS
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
