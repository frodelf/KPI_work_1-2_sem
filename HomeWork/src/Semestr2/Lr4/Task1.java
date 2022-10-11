package Semestr2.Lr4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть число від 1 до 50: ");
        int key = sc.nextInt();
        long m1 = System.currentTimeMillis();

        int matrix[][] = new int[10][10];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int) (Math.random() * 50);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }


        cyclicBarrier(matrix, key);
        int time = (int) (System.currentTimeMillis() - m1);
        System.out.println("\nчас: "+time+"мс");
    }

    static void cyclicBarrier(int[][] matrix, int key){
        int ar[][] = new int[matrix.length+1][matrix.length];
        ar = matrix;
        for (int i = 0; i < matrix.length; i++) {
            ar[matrix.length-1][i] = key;
            int j = 0;
            while (ar[j][i] != key){
                j++;
            }
            if(j < matrix.length-1){
                System.out.println("\nСтовпець " + (i+1) + ", рядок" + (j+1));
            }
        }
    }
}
