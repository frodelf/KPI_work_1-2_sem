package Semestr2.Lr5;

public class OneLinkedList {
    private Node head;

    public OneLinkedList() {
        head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        newNode.next =  head;
        head = newNode;
    }

    public void remove(int data) {
        Node currentNode = head;
        Node previousNode = null;

        while (currentNode.next != null) {

            if (currentNode.data == data) {
                previousNode.next = currentNode.next;
                int rezerv = previousNode.data;
                previousNode.data = currentNode.next.data;
                currentNode.next.data = rezerv;
            }
            previousNode = currentNode;
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
        System.out.println(index1 + "    " + (index2-1));
    }
}

