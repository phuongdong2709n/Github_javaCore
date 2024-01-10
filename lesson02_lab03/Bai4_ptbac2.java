package Lesson01;

import java.util.Scanner;

public class Bai4_ptbac2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap a = " );
        float a= sc.nextFloat();
        System.out.println("Nhap b = " );
        float b= sc.nextFloat();
        System.out.println("Nhap c = " );
        float c= sc.nextFloat();

        if(a==0  ){
            if(c!=0){
                System.out.println("phuong trình có nghiem x = 0 ");
            }else{
                System.out.println("phuong trình có nghiem: " + (-b/c));
            }

        }else if(a!=0){
            float d= (b*b - 4*a*c);
            System.out.println("delta = " +d);
            if(d<0){
                System.out.println("phuong trinh vo nghiem" );
            }else if(d==0){
                System.out.println("phuong có nghiem kep x1 = x2 = " +(-b/2*a) );
            }else if(d>0){
//                System.out.println("phuong trinh co nghiem x1 = %.2f " + ((-b + (Math.sqrt(d)))/2*a));
//                System.out.println("phuong trinh co nghiem x2 = " + ((-b - (Math.sqrt(d)))/2*a));

                System.out.printf("phuong trinh co nghiem x1 = %.2f " , ((-b + (Math.sqrt(d)))/2*a));
                System.out.printf(" \n phuong trinh co nghiem x2 = %.2f " , ((-b - (Math.sqrt(d)))/2*a));
            }
        }

    }
}
