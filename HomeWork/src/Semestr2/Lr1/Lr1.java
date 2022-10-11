package Semestr2.Lr1;

import java.util.Scanner;

public class Lr1 {
    static int n, iter = 0;
    static int[][] matr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Виберіть розмір масиву (1-4)");
        System.out.println("1. 10x10");
        System.out.println("2. 50x50");
        System.out.println("3. 100x100");
        System.out.println("4. 500x500");
        int a = sc.nextInt();
        long m1 = System.currentTimeMillis();
        if (a == 1) {
            System.out.println("Генерую матрицю розміром 10х10");
            n = 10;
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int r = (int) (Math.random() * 5);
                    matrix[i][j] = r;
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
            matr = matrix;
        } else if (a == 2) {
            System.out.println("Генерую матрицю розміром 50х50");

            n = 50;
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int r = (int) (Math.random() * 5);
                    matrix[i][j] = r;
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
            matr = matrix;
        } else if (a == 3) {
            System.out.println("Генерую матрицю розміром 100х100");
            n = 100;
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int r = (int) (Math.random() * 5);
                    matrix[i][j] = r;
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
            matr = matrix;
        } else if (a == 4) {
            System.out.println("Генерую матрицю розміром 500х500");
            n = 500;
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int r = (int) (Math.random() * 5);
                    matrix[i][j] = r;
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
            matr = matrix;
        }

        int res[][] = Task.task2(matr);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res.length; j++) {
                System.out.print(res[i][j] + "\t");
            }
            System.out.println();
        }
        int time = (int) (System.currentTimeMillis() - m1);
        System.out.println("\nчас: "+time+"мс");
        System.out.println("кількість ітерацій: "+iter);
    }
}


class Task{
    static int[][] task1(int[][] mat){
        int[][] res = new int[mat.length][mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                res[i][j] = mat[i][j];
            }
        }
        int sum[] = new int[Lr1.n];
        for (int i = 0; i < Lr1.n; i++) {
            for (int j = 0; j < Lr1.n; j++) {
                sum[i] += res[j][i];
                Lr1.iter++;
            }
        }
        int index1 = 0, index2 = 0;
        int summ1 = 0, summ2 = 100;
        for (int i = 0; i < Lr1.n; i++) {
            if (summ1 < sum[i]) {
                summ1 = sum[i];
            }
            if (summ2 > sum[i] && sum[i] > 20) {
                summ2 = sum[i];
            }
            Lr1.iter++;
        }
        for (int i = 0; i < Lr1.n; i++) {
            if(summ1 != sum[i] && index1 == i){
                index1++;
            }
            if(summ2 != sum[i] && index2 == i){
                index2++;
            }
            Lr1.iter++;
        }
        System.out.println("\nМіняємо місцями стовпчики "+(index1+1)+" і "+(index2+1));
        System.out.println("Сума чисел в стовпцях з 1 по 10 рівна: ");
        for(int arr:sum)System.out.print(arr+"\t");
        System.out.println();
        return res;
    }


    static int[][] task2(int[][] mat){
        int[][] res = new int[mat.length][mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                res[i][j] = mat[i][j];
            }
        }
        int k = 0;
        int st = 0;
        for (int i = 0; i < mat.length/2; i++) {
            int r1 = 0, r2 = mat.length-1;
            for (int j = 0; j <= k; j++) {
                res[st][r1]=mat[r1][st];
                res[r1][st]=mat[st][r1];
                res[mat.length-1-st][r1] = mat[r1][mat.length-1-st];
                res[r1][mat.length-1-st] = mat[mat.length-1-st][r1];
                r2--;
                r1++;
                Lr1.iter++;
            }
            st++;
            k++;
        }
        System.out.println("\n\nПерероблена матриця:");
        return res;
    }

}