package t4;

public class MyCircularDoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    //OPERATIONS
    public void insertFirst(int value) {

        if (this.head == null) {
            this.head = new Node();
            this.head.setData(value);
            this.tail = this.head;
        } else {

            Node newNode = new Node();
            newNode.setData(value);
            newNode.setNext(this.head);
            newNode.setPrevious(this.tail);

            this.head.setPrevious(newNode);
            this.tail.setNext(newNode);

            this.head = newNode;
        }
        size++;
    }

    public void insertAtPosition(int value, int position) {
        Node newNode = new Node();
        newNode.setData(value);

        if (position > (size + 1)) {
            System.out.println("Invalid position.");
        } else if (this.head == null) {
            this.head = newNode;
            this.tail = this.head;
        } else {
            int currentIndex = 0;
            Node currentNode = this.head;

            while (position > currentIndex) {
                currentNode = currentNode.getNext();
                currentIndex++;
            }

            newNode.setPrevious(currentNode.getPrevious());
            newNode.setNext(currentNode);
            currentNode.getPrevious().setNext(newNode);
            currentNode.setPrevious(newNode);

            if (position == 0) { // Make new node the head
                head = newNode;
            }

            if (position == size) { // Make new node the tail
                tail = newNode;
            }
            size++;
        }
    }

    public void insertLast(int value) {

        if (this.head == null) {
            this.head = new Node();
            this.head.setData(value);
            this.tail = this.head;
        } else {
            Node newNode = new Node();
            newNode.setData(value);
            newNode.setPrevious(this.tail);
            newNode.setNext(this.head);

            this.tail.setNext(newNode);
            this.tail = newNode;
        }
        size++;
    }

    public void deleteFirst() {

        if (this.head != null) {

            if (this.head.getNext() == this.head) {
                this.head = null;
            } else {

                Node currentNode = this.head;

                while (currentNode.getNext() != this.head) {
                    currentNode = currentNode.getNext();
                }
                System.out.println("Deleted the head node with value " + this.head.getData());

                this.head = this.head.getNext();
                this.head.setPrevious(currentNode);
                currentNode.setNext(this.head);
            }
        }
        size--;
    }

    public void deleteAtPosition(int position) {

        if (this.head != null) {

            int currentIndex = 0;

            Node currentNode = this.head;
            Node previousNode = this.head;

            while (currentIndex != position) {

                previousNode = currentNode;

                if (currentNode.getNext() != null) {
                    currentNode = currentNode.getNext();
                }

                currentIndex++;
            }
            System.out.println("Deleted node at index " + position + " with value " + currentNode.getData());
            previousNode.setNext(currentNode.getNext());

            if (currentNode.getNext() != null) {
                currentNode.getNext().setPrevious(previousNode);
            }
        }
        size--;
    }

    public void deleteLast() {

        if (this.head != null) {

            if (this.head.getNext() == this.head) {
                this.head = null;
            } else {

                Node currentNode = this.head;

                while (currentNode.getNext().getNext() != this.head) {
                    currentNode = currentNode.getNext();
                }
                System.out.println("Deleted the tail node with value " + this.tail.getData());

                currentNode.setNext(this.head);
                this.head.setPrevious(currentNode);
                this.tail = currentNode;
            }
        }
        size--;
    }

    public void search(int value) {
        Node currentNode = this.head;

        int index = 0;
        int found = 0;

        if (currentNode != null) {
            while (true) {
                if (currentNode.getData() == value) {
                    found++;
                    break;
                }
                index++;
                currentNode = currentNode.getNext();
                if (currentNode == this.head) {
                    break;
                }
            }
            if (found == 1) {
                System.out.println("Found first occurrence of value " + value + " at position " + index);
            } else {
                System.out.println("The list doesn't contain value " + value);
            }
        } else {
            System.out.println("The list is empty!");
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        if (this.head != null) {
            Node currentNode = this.head;
            while (currentNode != null) {
                System.out.print(currentNode.getData() + " <-> ");

                if (currentNode.getNext() == this.head) {
                    break;
                }

                currentNode = currentNode.getNext();
            }

            System.out.println("CIRCLE GOES BACK TO HEAD");

        } else {
            System.out.println("Linked list is empty.");
        }
    }


    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }
}

