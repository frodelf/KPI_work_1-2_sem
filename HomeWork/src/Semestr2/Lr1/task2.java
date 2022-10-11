package Semestr2.Lr1;

import java.util.Scanner;

public class task2 {
    static int iter = 0;
    public static void main(String[] args) {
        System.out.print("Введіть розмір матриці: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m1 = System.currentTimeMillis();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int r = (int) (Math.random() * 100);
                matrix[i][j]=r;
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        //Використав введення числа з клавіатури для того щоб вибрати
        //якого розміру матрицю згенерувати і виводимо її на екран
        System.out.println("\n\nрезультат:");
        int res[][] = task2(matrix);
        //створюємо новий масив який рівняємо тому що повертаємо з методу
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res.length; j++) {
                System.out.print(res[i][j]+"\t");
            }
            System.out.println();
        }
        //створюємо новий масив який рівняємо тому що повертаємо
        //з методу і виводим його на екран
        System.out.println("Кількість ітерацій: "+iter);
        int time = (int) (System.currentTimeMillis() - m1);
        System.out.print("час: "+time+"мс");
        //виводим на екран кількість ітерацій і час виконання прогарами(в мілісекундах)
    }



    static int[][] task2(int[][] mat) {
        int[][] res = new int[mat.length][mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                res[i][j] = mat[i][j];
            }
        }
        //Створюємо новий масив і надаєм йому значення масиву, який передається в метод
        int k = 0;
        int st = 0;
        for (int i = 0; i < mat.length / 2; i++) {
            int r1 = 0, r2 = mat.length - 1;
            for (int j = 0; j <= k; j++) {
                res[st][r1] = mat[st][r2];
                res[st][r2] = mat[st][r1];
                res[mat.length - 1 - st][r1] = mat[mat.length - 1 - st][r2];
                res[mat.length - 1 - st][r2] = mat[mat.length - 1 - st][r1];
                r2--;
                r1++;
                iter++;

            }
            st++;
            k++;
        }
        //основний алгоритм виконання завдання
        if (res.length % 2 != 0) {
            int u =res.length/2;
            int end = res.length - 1;
            for (int i = 0; i < res.length/2; i++) {
                iter++;
                res[u][i]=mat[u][end];
                res[u][end]=mat[u][i];
                end--;
            }
        }
        //якщо к-сть елементів масиву не парна то в такому випадку,
        //ми додатково міняєм елементи середнього рядка семетрично
        //середнього елемента
        return res;
    }
}


