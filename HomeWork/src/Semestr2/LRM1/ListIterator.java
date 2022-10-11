package Semestr2.LRM1;

import java.util.Iterator;

public class ListIterator implements Iterator {
    //в клас імплементувала інтерфайс Iterator
    private Node current;
    //зробила приватнний об'єкт current класа Node
    public ListIterator(Node first) {
        current = first;
    }
    //зробила конструктор
    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Node next() {
        Node tempo = current;
        current = current.getNext();
        return tempo;
    }
    // переписала методи ітератора
}