package Semestr2.Lr2;

import static java.lang.Math.*;

public class Cycle {
    public static void main(String[] args) {
        long m1 = System.currentTimeMillis();
        int n = 5000;
        double result = cycle(n);
        System.out.printf("s = %.9f", result);
        int time = (int) (System.currentTimeMillis() - m1);
        System.out.println("\nчас: "+time+"мс");
        System.out.println("Значення n = "+n);
    }

    static double cycle(int n){
        double result = 1;
        for (int x = 1; x <= n; x++) {
            double res1 = x / (exp(x) - pow(x, 2));
            result *= res1;
        }
        return result;
    }
}
