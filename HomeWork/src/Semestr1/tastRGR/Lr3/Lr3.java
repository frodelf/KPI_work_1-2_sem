package Semestr1.tastRGR.Lr3;
import static java.lang.Math.*;
import java.util.Scanner;
public class Lr3 {
    public static void main(String[] args) {
        task1();
        // визвав метод task1

        System.out.println("_________Завдання 2_________\n");
        double sum = 0;
        double[] a = {3.3, 4.8, 12.2, 2.23, 1.231, 3.34, 34.3, 3.2, 3.3, 2.43};
        //ввів масив "а"
        System.out.println("Елементи першого масиву:");
        for(int q=0; q<a.length; q++){
            // цикл за допомогою якого в консоль виводяться елементи масиву "а"
            System.out.print(a[q]+"  ");
        }
        System.out.print("\nВідповідь: ");
        System.out.printf("%.4f", task21(a, sum));
        //Виводить в консоль значення яке я вернув в методі task21
        double[] b = {3.3, 4.8, 12.2, 2.23, 1.231, 3.34, 23.34, 2.45, 33.34, 3, 2.323432, 2.3};
        System.out.println("\n\nЕлементи другого масиву:");
        for(int q=0; q<b.length; q++){
            // цикл за допомогою якого в консоль виводяться елементи масиву "b"
            System.out.print(b[q]+"  ");
        }
        System.out.print("\nВідповідь ");
        System.out.printf("%.4f", task22(b, sum));
        //Виводить в консоль значення яке я вернув в методі task22


        System.out.println("\n_________Завдання 3_________");
        Scanner sc = new Scanner(System.in);
        //Сканер за допомогою якого я ввожу вручну 2 змінні значення "х1" і "х2"
        System.out.printf("\nВведіть значення 'х1' i 'x2'  ");
        double x1=sc.nextDouble();
        double x2=sc.nextDouble();
        task3(x1,x2);
    }
    public static double task1() {
        System.out.println("_________Завдання 1_________");
        System.out.println("  x \t  y(x)\t     z(x) ");
        double x, y , z;
        //Ввів зімнні x, y, z
        double h=0.2;
        //Ввів крок для "х" яки1 задано в умові
        for (x=-6; x<1.1; x=x+h){
//Цикл в якому "х" буде змінюватись від -6 до 1 з кроком "h"
            y = atan(x+3.1);
            //формула яка буде обчислювати "у"
            z = pow(E, x);
            //формула яка буде обчислювати "z"
            System.out.printf("%.1f  ", x);      //
            System.out.printf("\t%.4f", y);      // буде виводити змінні "х" "у" "z" в стовпчик
            System.out.printf("\t    %.4f\n", z);//
        }
        return 0;
    }
    public static double task21(double[] a, double sum){

        if(a.length>9){
//Ввів умову в якій буде перевірятись розмір масиву і якщо він буде менший 10 то буде виводитись на екран сторока 60
            for(int i=1; i<a.length; ++i){
//Цикл а якому значення "і" буде змінюватись від 1 до розміру масиву "а"
                if(a[0]>a[i]){
//Умова: якщо значення першого елемента масива "а" більше за інше то вони сумуються
                    sum = sum + a[i];
                }
                else{
                } } }
        else{
            System.out.println("В масиві мало елементів ");
        }
        return sum;
    }

    public static double task22(double[] b, double sum){
        if(b.length>9){
//Ввів умову в якій буде перевірятись розмір масиву і якщо він буде менший 10 то буде виводитись на екран сторока 74
            for(int i=1; i<b.length; ++i){
//Цикл а якому значення "і" буде змінюватись від 1 до розміру масиву "b"
                if(b[0]>b[i]){
//Умова: якщо значення першого елемента масива "b" більше за інше то вони сумуються
                    sum = sum + b[i];
                }
                else{
                } } }
        else{
            System.out.println("В масиві мало елементів ");
        }
        return sum;
    }
    public static double task3(double x1, double x2){
        double sum1 = 0;
        double sum2 = 0;
        //зробив значення які будуть рівняться як результат в типі double і прарівняв їх до 0
        for(int i=1;i<=6;i++){
            // Цикл в якому значення "і" змінюватисься від 1 до 6
            double y1=(pow(-1,i)*pow(x1,2*i))/factorial(3*i - 1) ;
            sum1 += y1; //Обчислює результат при х=0.6
        }
        for(int i=1;i<=6;i++){
            // Цикл в якому значення "і" змінюватисься від 1 до 6
            double y2=(pow(-1,i)*pow(x2,2*i))/factorial(3*i - 1) ;
            sum2 += y2; //Обчислює результат при х=2.8
        }
        System.out.println("результати функції коли в формулу підставимо значення х1: \n");
        System.out.printf("result1=  %.4f \n", sum1);//Виводить результат при х=0.6
        System.out.println("\nрезультат функції коли в формулу підставимо значення х2: \n");
        System.out.printf("result2=  %.4f \n", sum2);//Виводить результат при х=2.8
        return 0;
    }
    public static int factorial(int n) {
        if (n == 1 || n == 0) return 1;
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact*=i;
        }
        return fact;
        //зробив метод, який буде працювати як факторіал
    }
}
