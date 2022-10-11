package Semestr1.tastRGR.MKR;

public class MKRtask1 {
    public static void main(String[] args) {
        System.out.println("_________task1_________");
        String a1 = "axxbb", a2 = "axaxax", a3 = "xxxxx";
        char[] b1 = a1.toCharArray(), b2 = a2.toCharArray(), b3 = a3.toCharArray();
        System.out.println("task1(" + a1 + ")-->" + task1(b1));
        System.out.println("task1(" + a2 + ")-->" + task1(b2));
        System.out.println("task1(" + a3 + ")-->" + task1(b3));
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
}
