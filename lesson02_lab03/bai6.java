package Lesson01;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap a = ");
         double a=sc.nextDouble();
        System.out.println("nhap b = ");
        double b=sc.nextDouble();
        System.out.println("nhap c = ");
        double c=sc.nextDouble();
        if(a>0 && b>a && c>0){
            double p=(a+b+c)/2;
            double s =Math.sqrt(p*(p-a)*(p-b)*(p-c));
            if (a+b>c || a+c>b || b+c>a) {
                System.out.println("la tam giac.");
                System.out.println("chu vi = " +(a+b+c));
                System.out.printf("dien tich s = %.2f" , s);
            }
        }else{
            System.out.println("khong phai la tam giac");
        }
    }
}
