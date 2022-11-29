package t4;

public class Main {
    public static void main(String[] args) {

        MyCircularDoublyLinkedList myList = new MyCircularDoublyLinkedList();

        //CHECK IF THE LIST IS EMPTY
        System.out.println("Is the list empty? - " + myList.isEmpty());

        //INSERT AT FIRST AND LAST POSITION
        myList.insertFirst(5);
        myList.insertFirst(1);
        myList.insertFirst(1);

        myList.insertLast(9);

        myList.insertFirst(5);
        myList.insertFirst(10);

        //DISPLAY THE LIST
        myList.display();

        //CHECK IF THE LIST IS EMPTY
        System.out.println("Is the list empty? - " + myList.isEmpty());

        //INSERT AT A SPECIFIC POSITION (INDEX)
        myList.insertAtPosition(18, 5);
        myList.insertAtPosition(77, 0);
        myList.display();

        //SEARCH FOR THE POSITION OF A SPECIFIC VALUE
        myList.search(19);
        myList.search(1);

        //DELETE THE CURRENT HEAD VALUE
        myList.deleteFirst();
        myList.display();

        //DELETE AT A SPECIFIC POSITION
        myList.deleteAtPosition(1);
        myList.display();

        //DELETE THE CURRENT TAIL VALUE
        myList.deleteLast();
        myList.display();

        System.out.println("CURRENT HEAD: " + myList.getHead().getData());
        System.out.println("CURRENT TAIL: " + myList.getTail().getData());
        System.out.println("CURRENT SIZE: " + myList.getSize());
       }
}