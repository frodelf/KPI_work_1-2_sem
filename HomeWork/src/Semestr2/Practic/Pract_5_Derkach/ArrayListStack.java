package Semestr2.Practic.Pract_5_Derkach;

import java.util.ArrayList;

public class ArrayListStack {
    private int[] stackArray;
    ArrayList<Integer> stack = new ArrayList<>(10);
    public static void main(String[] args) {

        ArrayListStack stackAct = new ArrayListStack();
        stackAct.addElementToStack(89);
        stackAct.addElementToStack(69);
        stackAct.addElementToStack(45);
        stackAct.addElementToStack(34);
        stackAct.addElementToStack(5);
        stackAct.addElementToStack(35);
        stackAct.addElementToStack(1545);
        stackAct.addElementToStack(675);
        stackAct.addElementToStack(545);

        stackAct.task3();
        while (!stackAct.isEmpty()) {
            stackAct.deleteElementFromStack();
        }
        System.out.println(stackAct.isEmpty());

    }
    static int size = -1;

    public void addElementToStack(int element) {
        size++;
        stack.add(element);
    }

    public void deleteElementFromStack() {
        System.out.println(stack.get(size));
        stack.remove(size--);
    }

    public boolean isEmpty() {
        return (size == -1);
    }

    public void task1(){
        int a1 = stack.get(size);
        int a = stack.get(0);
        stack.set(0, a1);
        stack.set(size, a);
    }

    public void task3(){
        int min = stack.get(size);
        int i = 0;
        for(; i < size; i++){
            if(min > stack.get(i))min = stack.get(i);
        }
        int j = 0;
        for (; j < size; j++) {
            if(stack.get(j) == min){
                size--;
                stack.remove(j);
                break;
            }
        }
    }


    public void task8() {
        int min = stack.get(size);
        int i = 0;
        for (; i < size; i++) {
            if (min > stack.get(i)) min = stack.get(i);
        }
        int j = 0;
        for (; j < size; j++) {
            if (stack.get(j) == min) {
                size--;
                stack.remove(j);
                break;
            }
        }
        stack.set(0, min);
    }

    public void task10() {
        int max = stack.get(size);
        int i = 0;
        for (; i < size; i++) {
            if (max < stack.get(i)) max = stack.get(i);
        }
        int j = 0;
        for (; j < size; j++) {
            if (stack.get(j) == max) {
                size--;
                break;
            }
        }
        size+=2;
        stack.add(j+1, 0);
    }
}