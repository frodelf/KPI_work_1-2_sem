package Semestr2.Lr5;

public class Node {
    public int data;
    public Node next;
    public Node previous; // силка яка вказує на попередній елемент і в однозв'язному списку не використовується

    public Node(int data) {
        this.data = data;
        next = null;
        previous = null;
    }
}
