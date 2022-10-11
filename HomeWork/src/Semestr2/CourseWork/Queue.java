package Semestr2.CourseWork;

public class Queue {
    private int arr[];
    private int size = 100;
    private int index;
    private int head;
    private int tail;

    Queue(){
        arr = new int[size];
        head = 0;
        tail = -1;
        index = 0;
    }

    public void addQueue(int value){
        if(tail == size - 1)tail = -1;
        arr[++tail] = value;
        index++;
    }

    public int remove(){
        if(head == size)head = 0;
        index--;
        return arr[head++];
    }

    public boolean isEmpty(){
        return index == 0;
    }
}
