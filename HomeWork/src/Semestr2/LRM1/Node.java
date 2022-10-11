package Semestr2.LRM1;

public class Node {

    int value;
    Node previous;
    Node next;
    //робиш змінні які не мають значення
    public Node(int value) {
        this.value = value;
    }
    //конструктор в якому вказуєш що при створювані об'єкта цього класу йому треба надати значаення для зміної value
    public Node getNext() {
        return next;
    }
    //це метод який показує наступний елемент в списку
    public String toString() {
        return value + "";
    }
    //перезаписала метод toString() який показує значення об'єкта

}
