package Semestr2.Lr2;

import static java.lang.Math.sin;

public class Lr2 {
    static double s = 1;
    static int k = 0;
    public static void main(String[] args) {
        long m1 = System.currentTimeMillis();
        int n = 5;
        double result = cycle(n);
        System.out.printf("s = %.9f", result);
        int time = (int) (System.currentTimeMillis() - m1);
        System.out.println("\nчас: "+time+"мс");
        System.out.println("Значення n = "+n);
    }


    static double cycle(int n){
        double result = 1;
            for (int k = 1; k <= n; k++) {
                double res1 = sin(k) / k;
                result *= res1;
            }
        return result;
        }

    static double rekursia(int n){
        if(n==0)return s;
        k++;
        double s1 = sin(k) / k;
        s *= s1 * rekursia(n-1);
        return s;
    }
}
