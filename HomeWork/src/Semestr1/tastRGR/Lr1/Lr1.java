package Semestr1.tastRGR.Lr1;
import java.util.Date;
import java.util.Scanner;
public class Lr1 {
    public static void main(String[] args) {
        int m = 2;
        int c = -1;
        double t = 1.2;
        double b = 0.7;
//Ввів початкові дані з таблички 1
        double F,Z;
        F=calcF(m,c,t,b);
        Z=calcZ(m,c,t,b);
//Ввів зміну F,Z і присвоїв їй метод calcF і calcZ
        System.out.printf("F=%.4f\n",F);
        System.out.printf("Z=%.4f\n",Z);
//Вивів змінні F,Z і округлив їх значення до десятитисячних
        outputDate();
//виклик методу в якому організовується виведення поточної дати і часу у вказаному форматі
        Scanner sk = new Scanner(System.in);
//Ввів сканер для вводу чисел з клавіатури самостійно в консоль
        m = sk.nextInt();
        c = sk.nextInt();
        t = sk.nextDouble();
        b = sk.nextDouble();
//Присвоїв сканеру змінні які використовуються в формулі
        F=calcF(m,c,t,b);
        Z=calcZ(m,c,t,b);
//Ввів зміну F,Z і присвоїв їй метод calcF і calcZ
        System.out.printf("F=%.4f\n",F);
        System.out.printf("Z=%.4f\n",Z);
//Вивів змінні F,Z і округлив їх значення до десятитисячних
        outputDate();
//виклик методу в якому організовується виведення поточної дати і часу у вказаному форматі
    }
    public static double calcF (int m, int c, double t, double b )
//Ввів новий метод calcF
    {
        double A = m*Math.tan(t);
//Ввів зміну для визначення 1-го доданку, який знаходиться  під кубічним коренем в формулі
        double B = Math.abs(c * Math.sin(t));
//Ввів зміну для визначення 2-го доданку, який знаходиться  під кубічним коренем в формулі
        double result1 = Math.cbrt(A+B);
//Визначення результату формули
        return result1;
//Переміщає значення result1 в метод main
    }
    public static double calcZ (int m, int c, double t, double b)
//Ввів новий метод calcZ
    {
        double result2=m*Math.cos(b*t*Math.sin(t));
//Визначення результату формули
        return result2;
//Переміщає значення result2 в метод main
    }
    public static void outputDate ()
//Ввів новий метод outputDate
    {
        Date d = new Date();
        System.out.printf("%1$te %1$tB %1$tY %1$tH : %1$tM : %1$tS : %1$tL \n", d); //Вивів в конслоль дату з точністю до мілісекунд
    }
}
