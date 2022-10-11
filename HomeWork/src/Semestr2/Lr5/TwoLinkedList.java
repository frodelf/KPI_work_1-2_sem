package Semestr2.Lr5;

public class TwoLinkedList {
    private Node head;
    private Node tail;

    public TwoLinkedList() {
        head = null;
        tail = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            tail = newNode;
        } else {
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
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

    public void task(int data){
        Node currentNode = head;

        int index1 = 0, index2 = -1;
        while (currentNode != null){

            if(currentNode.data == data && index2 > index1){
                break;
            }
            if(currentNode.data == data && index1 > index2){
                index2 += index1 + 2;
            }
            if(index1 > index2){
                index1++;
            }
            if(index2 > index1){
                index2++;
            }

            currentNode = currentNode.next;
        }
        Node currentNode1 = head;
        int indexDelta = index2 - index1;
        int index = 0;
        while (index != index1){
            System.out.println(currentNode1.data);
            currentNode1 = currentNode1.next;
            index++;
        }
        System.out.println(currentNode1.data);
        while (index != (index2-1)){
            currentNode1 = currentNode1.next;
            index++;
        }
        while (index != index1){
            System.out.println(currentNode1.previous.data);
            currentNode1 = currentNode1.previous;
            index--;
        }
        while (index != index2){
            currentNode1 = currentNode1.next;
            index++;
        }
        while (currentNode1.next != null){
            System.out.println(currentNode1.data);
            currentNode1 = currentNode1.next;
        }
        System.out.println(currentNode1.data);
    }

    public void task2(){

        Node currentNode = head;
        int summ = 0;
        int a = 0;

        while (currentNode != null){
            summ += currentNode.data;
            a++;
            currentNode = currentNode.next;
        }
        System.out.println(summ);
        System.out.println(a);
        double res = summ / a;
        System.out.println("seredne arifm = " + res);
    }
}

