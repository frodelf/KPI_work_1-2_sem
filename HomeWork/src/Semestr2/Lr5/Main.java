package Semestr2.Lr5;

public class Main {
    public static void main(String[] args) {
        OneLinkedList list = new OneLinkedList();
        System.out.println("\t\tОднозв'язний список і дії над ним:");
        list.add(89);
        list.add(78);
        list.add(67);
        list.add(56);
        list.add(45);
        list.add(34);
        list.add(23);
        list.add(12);
        System.out.println("Елементи які містяться в однозв'язному списку:");
        list.print();
        System.out.println("\nЕлементи які містяться в однозв'язному списку після роботи методу remove");
        list.remove(67);
        list.print();

        System.out.println("\t\tДвозв'язний список і дії над ним:");
        TwoLinkedList list1 = new TwoLinkedList();
        list1.add(89);
        list1.add(23);
        list1.add(67);
        list1.add(56);
        list1.add(45);
        list1.add(34);
        list1.add(23);
        list1.add(12);
        list1.add(47);
        System.out.println("Елементи які містяться в двозв'язному списку:");
        list1.print();
        System.out.println("\nЕлементи які містяться в двозв'язному списку після роботи методу task:");
        list1.task2();
        System.out.println("\nЕлементи які містяться в двозв'язному списку після роботи методу remove:");
        list1.remove(56);
        list1.print();
    }
}


