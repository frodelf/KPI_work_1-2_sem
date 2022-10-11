package Semestr2.Lr1;

import java.util.Scanner;

public class task1 {
    static int n, iter = 0;
    static int[][] adf;

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
                    int r = (int) (Math.random() * 100);
                    matrix[i][j] = r;
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
            adf = matrix;
        } else if (a == 2) {
            System.out.println("Генерую матрицю розміром 50х50");

            n = 50;
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int r = (int) (Math.random() * 100);
                    matrix[i][j] = r;
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
            adf = matrix;
        } else if (a == 3) {
            System.out.println("Генерую матрицю розміром 100х100");
            n = 100;
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int r = (int) (Math.random() * 100);
                    matrix[i][j] = r;
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
            adf = matrix;
        } else if (a == 4) {
            System.out.println("Генерую матрицю розміром 500х500");
            n = 500;
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int r = (int) (Math.random() * 100);
                    matrix[i][j] = r;
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
            adf = matrix;
        }
        //Використав введення числа з клавіатури для того щоб вибрати
        //якого розміру матрицю згенерувати

        int res[][] = task(adf);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res.length; j++) {
                System.out.print(res[i][j] + "\t");
            }
            System.out.println();
        }
        //Вивід в консоль результат
        int time = (int) (System.currentTimeMillis() - m1);
        System.out.println("\nчас: "+time+"мс");
        System.out.println("кількість ітерацій: "+iter);
        //виводим на екран кількість ітерацій і час виконання прогарами(в мілісекундах)
    }

    static int[][] task(int[][] m) {

        int result[][] = new int[m.length][m.length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                result[i][j] = m[i][j];
            }
        }
        //присвоюю новому масиву елементи масива який передається в метод

        System.out.println("\n");
        for (int i = 0; i < m.length; i++) {
            System.out.println("Найбільше число в рядку " + (i + 1) + " рівне " + maxElement(m[i]));
        }
        //Виводить в консоль найбільші числа рядків
        int res[] = new int[n];
        int max;

        for (int i = 0; i < n; i++) {
            iter++;
            res[i] = maxElement(m[i]);
        }
        //створює масив який заповнюю максимальними числами рядів
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res.length - 1; j++) {
                iter++;
                if (res[j] > res[j + 1]) {
                    int n = res[j];
                    res[j] = res[j + 1];
                    res[j + 1] = n;
                }
            }
        }
        //сортурую масив методом бульбашки
        int maxr = 0, minr = 0, k = 0, y = 0;
        for (int i = 0; i < m.length; i++) {
            iter++;
            if (maxElement(m[i]) == res[0] && k == 0) {
                minr = i;
                k++;
            }
            if (maxElement(m[i]) == res[res.length - 1] && y == 0) {
                maxr = i;
                y++;
            }
        }
        //визначив номера рядів які потрібно змінити
        System.out.println("\nЗмінив місцями рядки " + (minr + 1) + " і " + (maxr + 1)+"\nРезультат:");
        result[minr] = m[maxr];
        result[maxr] = m[minr];
        return result;
        //змінив рядки в матриці і повернув кінцевий результат
    }

    static int maxElement(int[] a) {
        int result = a[0];
        for (int i = 0; i < a.length; i++) {
            iter++;
            if (result < a[i]) result = a[i];
        }
        return result;
    }
    //мотод який визначає максимальне число в масиві
}


