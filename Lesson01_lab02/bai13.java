package Lesson01;

import java.util.Scanner;

public class bai13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập giờ làm: ");
        float gioLam=sc.nextFloat();
        System.out.println("Nhập lương giờ");
        float luongGio=sc.nextFloat();
        float luong=gioLam*luongGio;
        if(gioLam>40){
            System.out.println("Tiền lương:" +(luong*1.5));
        }else if(gioLam<=40){
            System.out.println("Tiền lương:" +luong);
        }
    }
}
