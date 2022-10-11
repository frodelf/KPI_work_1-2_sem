package Semestr1.tastRGR.Lr2;
import java.util.Scanner;
public class Lr22 {
    public static void main(String[] args) {
        System.out.printf("Введіть кут в радіанах\n");
        Scanner scanner = new Scanner(System.in);
        System.out.printf("x=");
        double x = scanner.nextDouble();
        //ввів сканеер для того щоб задати значення(радіани)
        double sin, cos;
        //ввів зміні sin,cos в типі double
        sin = Math.sin(Math.toDegrees(x));
        cos = Math.cos(Math.toDegrees(x));
        //ввів значення sin,cos яке буде перероблювати кути в радіанах в градусах
        System.out.printf("Результат:\n", task3(x, sin, cos));
        //визиває метод task3 в якому визначається що бідбше синус чи косинус
        System.out.printf("sin = %.4f\n",sin );
        //виводить в консоль значення  sin
        System.out.printf("cos = %.4f\n",cos);
        //виводить в консоль значення cos
        System.out.printf("Введіть кут в радіанах\n");
        Scanner scanner1 = new Scanner(System.in);
        System.out.printf("x2=");
        double x2 = scanner1.nextDouble();
        //ввів сканеер для того щоб задати значення(радіани)

        sin = Math.sin(Math.toDegrees(x2));
        cos = Math.cos(Math.toDegrees(x2));
        //ввів значення sin,cos яке буде перероблювати кути в радіанах в градусах
        System.out.printf("Результат:\n", task3(x, sin, cos));
        //визиває метод task3 в якому визначається що бідбше синус чи косинус
        System.out.printf("sin = %.4f\n",sin );
        //виводить в консоль значення  sin
        System.out.printf("cos = %.4f\n",cos);
        //виводить в консоль значення cos

        System.out.printf("Введіть кут в радіанах\n");
        Scanner scanner2 = new Scanner(System.in);
        System.out.printf("x3=");
        double x3 = scanner2.nextDouble();
        //ввів сканеер для того щоб задати значення(радіани)

        sin = Math.sin(Math.toDegrees(x3));
        cos = Math.cos(Math.toDegrees(x3));
        //ввів значення sin,cos яке буде перероблювати кути в радіанах в градусах
        System.out.printf("Результат:\n", task3(x, sin, cos));
        System.out.printf("sin = %.4f\n",sin );
        //виводить в консоль значення  sin
        System.out.printf("cos = %.4f\n",cos);
        //виводить в консоль значення cos
        double y=task4();
        System.out.printf("%.4f\n", y);
    }
    public  static double  task3(double x,double sin, double cos) {

        if (sin>cos)
        //умова
        {
            System.out.println("Синус більший за косинус");
            //що виведеться в консоль якщо умова буде вірною
        } else
        //умова
        {
            System.out.println("Косинус більщий за синус");
            //що виведеться в консоль якщо умова буде вірною
        }
        return x;

    }
    public  static double task4(){
        double a[]={3,2.1,-9};
        double y=0;
        //ввів зміну "у" і всі значення зміної "а" за допомогою масиву
        for(int i=0;i<3;i++){
            //цикл
            if(a[i]==3)
            //умова
            {
                double b = 3.5;
                double c=-2.1;
                y=(a[i]+b+c)/3;
                System.out.printf("y= %.4f\n", y);
                //що буде відбуватись якщо умова буде вірною
            }
            else if(a[i]==2.1)
            //умова
            {
                double b=-6.55;
                double  c=0.1;
                y=(a[i]+b+c)/3;
                System.out.printf("y= %.4f\n", y);
                //що буде відбуватись якщо умова буде вірною
            }
            else{
                double b =-3.7;
                double c=-0.1;
                y=(a[i]+b+c)/3;
                //що буде відбуватись якщо всі умови будуть невірними
            }
        }
        System.out.print("y= ");
        return y;
    }
}

