package Semestr2.Practic;

public class Pract_6_Derkach {
    public static void main(String[] args) {
    Queue queue = new Queue();
        queue.add(9);
        queue.add(8);
        queue.add(7);
        queue.add(6);
        queue.add(5);
        queue.add(4);
        queue.add(3);
        queue.add(2);
        queue.add(1);

        System.out.println("Черга:");
        queue.print();
        System.out.println("\nВидалили елемент:");
        queue.remove(5);
        queue.print();
        System.out.println("\nВикликали елемент з черги по індексу:");
        queue.printIndex(3);
    }
}

class Queue {
    Node head;
    Node tail;

    public Queue() {
        head = null;
        tail = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        newNode.previous = tail;
        tail = newNode;
    }

    public void remove(int data) {
        Node currentNode = head;

        while (currentNode != null){
            if (currentNode.data == data){
                currentNode.previous.next = currentNode.next;
                currentNode.next.previous = currentNode.previous;

            }
            currentNode = currentNode.next;
        }
    }

    public void print() {
        Node currentNode = head;

        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public void printIndex(int data){
        Node currentNode = head;
        data--;
        while (data != 0){
            data--;
            currentNode = currentNode.next;
        }
        if(data == 0) System.out.println(currentNode.data);
    }
}

class Node {
    public int data;
    public Node next;
    public Node previous; // силка яка вказує на попередній елемент і в однозв'язному списку не використовується

    public Node(int data) {
        this.data = data;
        next = null;
        previous = null;
    }
}
