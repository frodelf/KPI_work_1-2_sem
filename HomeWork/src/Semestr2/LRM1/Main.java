package Semestr2.LRM1;

import java.util.Iterator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        Random random1 = new Random();

        int min = 5, max = 20;
        int size = 8;
        for (int i = 0; i < size; i++) {
            list.addFirst(random1.nextInt(max - min) + min);
        }
        //надав списку елементи рандомно
        System.out.println("Initial list");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString() + "  ");
        }
//

        // removing first and last elements of the list
        System.out.println("\nRemove first element of the list:");
        list.removeFirst();


        // printing the list
        list.printNodes();



        System.out.println("\n");
        System.out.println("List size = " + list.size());


        int index = 3;
        int foundElement = list.get(index);
        System.out.println("Element with index " + index + " = " + foundElement);

        int[] arr = list.toArray();
        System.out.println("\nConverted array:");
        for (int k : arr) {
            System.out.print(k + " ");
        }


        // array selection sorting
        list.selectionSort(arr);
        System.out.println("\n\nSorted array:");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
