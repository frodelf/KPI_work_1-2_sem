package Semestr2.Lr4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть послідовність з трьох чисел від 0 до 2: ");
        int key1 = sc.nextInt();
        int key2 = sc.nextInt();
        int key3 = sc.nextInt();
        int res[] = {key1, key2, key3};

        long m1 = System.currentTimeMillis();
        System.out.println();

        int matrix[][] = new int[10][10];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int) (Math.random() * 3);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        linearSearch(matrix, res);

        int time = (int) (System.currentTimeMillis() - m1);
        System.out.println("\nчас: " + time + "мс");
    }

    static void linearSearch(int[][] matrix, int[] res) {
        int s = 0;
        for (; s < matrix.length; s++) {
            int r = 0;
            for (int i = 0; i < matrix.length-2; i++) {
                int j = 0;
                while (j < 3) {
                    //System.out.println(j);
                    if (matrix[s][i+j] != res[j]) break;
                    j++;
                }
                if (j == 3)
                    System.out.println("Початок шуканої послідрвності знаходиться на " + (s + 1) + " рядочку " + (i + 1) + " стовпця");
                r++;
            }
        }
    }
}


