package Semestr2.LRM1;

import java.util.Iterator;

public class DoublyLinkedList {

    Node head, tail = null;
    int size = 0;


    public void addFirst(int value) {
        //метод який додає об'єкти в список
        Node newNode = new Node(value);
//зробила об'єкт класу Note

        if (head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        } else {
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
            head.previous = null;
        }
        //перевірила чи є перший елемент в списку, і якщо його немає записати елемент на перше місце
        //якщо є то цей елемент записується на 1 місце а всі інші переходять на слідуюче місце
    }

    public Iterator<Node> iterator() {
        return new ListIterator(head);
    }
//метод який створює новий об'єкт класу ListIterator (через конструктор)

    public void addLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
            head.previous = null;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        //Якщо я провильно поняв то цей метод додає елементи в кінець списку
        tail.next = null;

    }


    public void removeFirst() {
        if (head != null) {
            size--;
            head = head.next;
            head.previous = null;
        }
        //удаляє перший елемент
    }

    public void removeLast() {
        Node current = head;
        if (head == null) {
            return;
        }
        //перевіряє чи є 1 об'єкт в списку
        while (current.next.next != null) {
            current = current.next;
        }
        //шукає останій елемент масиву
        current.next = null;
        size--;
        //удаляє його
    }


    public void printNodes() {
        Node current = head;
        if (head == null) {
            System.out.println("Doubly linked list is empty");
            return;
        }
        //перевіряє чи пустий список
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        //виводить на екран всі об'єкти в списску
        System.out.println();
    }


    public int size() {
        if (head == null) {
            return 0;
        }
        Node current = head;
        int sizeResult = 0;
        while (current != null) {
            sizeResult++;
            current = current.next;
        }
        //обчислює розмір списку
        return sizeResult;
    }


    public int get(int N) {
        if (head == null) {
            System.out.println("Empty List");
        }
        Node current = head;
        int i = 1;
        while (current != null) {
            if (i == N) {
                return current.value;
            }
            current = current.next;
            i++;
        }
        //показує елемент масиву який ти вкажеш в методі
        return 0;

    }

    public int[] toArray() {
        int length = this.size();
        int[] arr = new int[length];
        Node current = head;
        //створив масив розміром списку
        int i = 0;
        while (current != null) {
            arr[i] = current.value;
            current = current.next;
            i++;
        }
        //надав масиву значень елементів
        return arr;
    }

    public void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
            //зрообив сортировку методом selection
        }
    }
}