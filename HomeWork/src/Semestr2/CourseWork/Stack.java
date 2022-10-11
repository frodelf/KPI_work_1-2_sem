package Semestr2.CourseWork;

public class Stack {
    private int size = 100;
    private int index;
    private int arr[];

    Stack(){
        arr = new int[size];
        index = -1;
    }

    public void addStaack(int value){
        arr[++index] = value;
    }

    public int remove(){
        return arr[index--];
    }

    public int peek(){
        return arr[index];
    }

    public boolean isEmpty(){
        if(index == -1)return true;
        else return false;
    }
}
