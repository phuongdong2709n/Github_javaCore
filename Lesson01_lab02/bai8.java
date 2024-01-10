package Lesson01;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap tháng : ");
        int thang=sc.nextInt();
        System.out.println("nhập năm : ");
        int nam=sc.nextInt();
        switch (thang){
            case 1,3,5,7,8,10,12:
                System.out.println("tháng có 30 ngày");
                break;
            case 4,6,9,11:
                System.out.println("tháng có 31 ngày ");
                break;
            case 2:
                if(nam%4==0 && nam%100!=0 ){
                    System.out.println(" là năm nhuận có 29 ngày");

                }else if(nam%100==0 && nam%400!=0){
                    System.out.println("không phải là năm nhuận có 28 ngày ");

                }else if(nam%100==0 && nam%400==0){
                    System.out.println("là năm nhuận có 29 ngày ");

                }
                break;
            default:
                System.out.println("nhập lại tháng");
                break;
        }


    }
}
