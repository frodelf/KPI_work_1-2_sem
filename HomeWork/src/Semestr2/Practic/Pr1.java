package Semestr2.Practic;

import java.util.Scanner;

public class Pr1 {
    public static void main(String[] args) {

        int a[] = {0, 9, 8, 7, 65, 4, 32, 1};
        Scanner s = new Scanner(System.in);
        int n = 0;
        System.out.print("Введіть ключ пошуку - ціле число: ");
        int w = s.nextInt();
        for (int i = 0; i < a.length; i++) {
            if(a[i] == w)break;
            n++;
        }
        System.out.println("Знайдено значення в елементі: "+ n);
    }
}