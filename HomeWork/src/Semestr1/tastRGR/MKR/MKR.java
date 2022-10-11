package Semestr1.tastRGR.MKR;

public class MKR {
    public static void main(String[] args) {
        System.out.println("_________task1_________");
        String a1 = "axxbb", a2 = "axaxax", a3 = "xxxxx";
        char[] b1 = a1.toCharArray(), b2 = a2.toCharArray(), b3 = a3.toCharArray();
        System.out.println("task1(" + a1 + ")-->" + task1(b1));
        System.out.println("task1(" + a2 + ")-->" + task1(b2));
        System.out.println("task1(" + a3 + ")-->" + task1(b3));

        System.out.println("\n_________task2_________");
        double x = 0.6;
        System.out.println("при х="+x);
        System.out.println("kє[1;3)U(3;6]");
        System.out.printf("y=%.3f", task2(x));
    }

    public static boolean task1(char[] b) {
        int sum = 0;
        boolean c = false;
        for (int i = 0; b[i] != 'x'; i++) {
            sum += 1;
        }
        if (b[sum] == b[sum + 1]) {
            c = true;
        }
        return c;
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

