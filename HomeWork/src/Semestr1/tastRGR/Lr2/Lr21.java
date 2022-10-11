package Semestr1.tastRGR.Lr2;
import static java.lang.Math.*;
public class Lr21 {
    public static void main(String[] args) {
        double x1 = -2.3 , x2 = 0.6 , x3 = 4.8;
        //ввів значення які будуть підставляться замість"х"в формулах
        System.out.println("Task 1");
        task1(x1);
        task1(x2);
        task1(x3);
        //визвав метод task1 в якому замість "х" вставив всі його змінні
        System.out.println("Task 2");
        task2(x1);
        task2(x2);
        task2(x3);
        //визвав метод task2 в якому замість "х" вставив всі його змінні
    }
    public static double task1 (double x) {
        double a = 0.54, b = 0.34, y, p = a * x + b;
        //ввів зміні a,b,y,p з 1 таблички
        if (Math.abs(x) < 0.7)
        //умова
        {
            y = pow(a, 2 * b) * pow(x, 2) + sqrt(pow(b, 4) + 2.7);
            //який вираз буде обсислюватись якщо умова буде вірна
        } else if (Math.abs(x) == 0.7)
        //умова
        {
            y = atan(pow(3, x) - p * x);
            //який вираз буде обсислюватись якщо умова буде вірна
        } else {
            y = cbrt(Math.log(Math.abs(a - p * x)) + 4.3);
            //який вираз буде обсислюватись якщо всі умови будуть невірними
        }
        System.out.printf("%.4f\n", y);
        return 0;
    }
    public static void task2 (double x) {
        double y = 0;
        //ввів зміну у іп прирівняв її до 0
        double[] a = {0.4, 0.2, 0.7};
        double[] b = {2.3, 0.8, 8.1};
        double[] z = {pow(E,2*x),pow(E,x) , 0.8};
        //ввів за допомогою масиву всі значення зміних a,b,c
        for(int i=0; i<3; i++){

            if(x<3.5*a[i])
            //умова
            {
                y=a[i]*b[i]*x-pow(cos(z[i]*x),2);
                //який вираз буде обсислюватись якщо умова буде вірна
            }
            else if(3.5*a[i]<=x && x<=b[i])
            //умова
            {
                y=pow((a[i]-x),2)-Math.log(z[i]+x);
                //який вираз буде обсислюватись якщо умова буде вірна
            }
            else {
                y=sqrt(b[i]*x-a[i]+z[i]*pow(x,2));
                //який вираз буде обсислюватись якщо всі умови будуть невірними
            }
            System.out.printf("%.4f\n", y);
            //вивів всі значення у
        }
    }
}
