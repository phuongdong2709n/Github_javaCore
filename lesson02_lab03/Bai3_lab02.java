package Lesson01;

import java.util.Scanner;

public class Bai3_lab02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("nhap diem a: ");
//        float  a= sc.nextFloat();
//        while (a>4){
//            System.out.println("lon hon");
//        }

        System.out.println("nhap diem ly thuyet: ");
        float  lyThuyet= sc.nextFloat();
        System.out.println("nhap diem thuc hanh: ");
        float  thucHanh= sc.nextFloat();
        float tb;
        tb=((lyThuyet+thucHanh)/2);
        System.out.println("diem trung binh: " + tb);
        if(tb<=4){
            System.out.println("sinh vien hoc lai.");
        }else if(tb>4 && tb<=7){
            System.out.println("sinh vien dat mon java.");
        }else if(tb>7){
            System.out.println("sinh vien xuat sac.");
        }
    }
}
