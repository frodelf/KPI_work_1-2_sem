package Semestr2.Lr2;

import static java.lang.Math.*;

public class Rekursia {
    static double s = 1;
    static int x = 0;
    public static void main(String[] args) {
        long m1 = System.currentTimeMillis();
        int n = 5000;
        double result = rekursia(n);
        System.out.printf("s = %.9f", result);
        int time = (int) (System.currentTimeMillis() - m1);
        System.out.println("\nчас: "+time+"мс");
        System.out.println("Значення n = "+n);
    }

    static double rekursia(int n){
        if(n==0)return s;
        x++;
        double s1 = x / (exp(x) - pow(x, 2));
        s *= s1 * rekursia(n-1);
        return s;
    }
}
