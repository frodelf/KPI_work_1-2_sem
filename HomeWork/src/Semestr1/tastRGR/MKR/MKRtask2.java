package Semestr1.tastRGR.MKR;

public class MKRtask2 {
    public static void main(String[] args) {
        System.out.println("\n_________task2_________");
        double x = 0.6;
        System.out.println("при х="+x);
        System.out.printf("y=%.3f", task2(x));
    }

    public static double task2(double x) {
        double y = 0;
        double a;
        for (int k = 1; k <= 6; k++) {
            if (k == 3) {
                a = 0;
            } else {
                a =(factorial(k - 1)* Math.cos(k*x))/(Math.pow(x,k+2));
            }
            y += a;
        }
        return y;
    }

    public static int factorial(int n) {
        if (n == 1 || n == 0){
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact*=i;
        }
        return fact;
    }
}
