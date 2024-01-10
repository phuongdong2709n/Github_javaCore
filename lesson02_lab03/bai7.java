package Lesson01;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap a = " );
        int a= sc.nextInt();
        System.out.println("Nhap b = " );
        int b= sc.nextInt();
        System.out.println("Nhap c = " );
        int c= sc.nextInt();
        System.out.println("Nhap d = " );
        int d= sc.nextInt();
        int maxAB=Math.max(a,b);
        int maxCD=Math.max(c,d);
        int soMax=Math.max(maxAB,maxCD);
        System.out.println("so lớn nhất là : " +soMax);

    }
}
