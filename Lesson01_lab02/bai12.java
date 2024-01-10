package Lesson01;

import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap toan = " );
        float toan= sc.nextFloat();
        System.out.println("Nhap ly = " );
        float ly= sc.nextFloat();
        System.out.println("Nhap hoa = " );
        float hoa= sc.nextFloat();
        float tong=(toan+ly+hoa);
        if(tong>15 || (toan>4 && ly>4 && hoa>4)){
            System.out.println("đậu.");
             if(toan>5 && ly>5 && hoa>5){
                System.out.println("Học đều các môn.");
            }
        }else if(tong<=15 || (toan<=4 && ly<=4 && hoa<=4)){

                System.out.println("Thi hỏng.");
            if(toan<=5 || ly<=5 || hoa<=5){
                System.out.println("Học chưa đều các môn.");
            }
        }
    }
}
