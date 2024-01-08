package Lesson01;

import java.util.Scanner;

public class bai14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập chỉ số cũ: ");
        int chiSoCu=sc.nextInt();
        System.out.println("Nhập chỉ số mới: ");
        int chiSoMoi=sc.nextInt();
        int soKW=chiSoMoi-chiSoCu;
        int tienThue=1000;
        int DichMuc=50;
        int giaDinhMuc=230;
        int vuotDichMuc1=480;
        int vuotDichMuc2=700;
        int vuotDichMuc3=900;
        int tong=0;
        int tienVuotDinhMuc=0;
        int tienDinhMuc=0;
       if(soKW<=50){
           tienDinhMuc=soKW*DichMuc;
            System.out.println(" Tiền định mức:" +tienDinhMuc);
            System.out.println("tổng tiền điện: " +(tienThue+tienDinhMuc));
       }else{
           // Tính tiền định mức
            tienDinhMuc=giaDinhMuc*DichMuc;
            int soKWvuotDinhMuc=soKW-DichMuc;

            if(soKWvuotDinhMuc<=50){
                System.out.println("tiền vượt định mức: " );
               tienVuotDinhMuc=(soKWvuotDinhMuc*vuotDichMuc1);
            }else if(soKWvuotDinhMuc<=100 && soKWvuotDinhMuc>50){
                System.out.println("Tiền vượt định mức: " );
                tienVuotDinhMuc=(50 * vuotDichMuc1 + (soKWvuotDinhMuc - 50) * vuotDichMuc2);
            }else{
                System.out.println("Tiền vượt định mức: " );
                 tienVuotDinhMuc= (50 * vuotDichMuc1 + 50 * vuotDichMuc2 + (soKWvuotDinhMuc - 100) * vuotDichMuc3);
            }
             tong=(tienThue+tienDinhMuc+tienVuotDinhMuc);
           System.out.println("tổng tiền: " + tong);
       }
        System.out.println("Chỉ số cũ: " + chiSoCu);
        System.out.println("Chỉ số mới: " + chiSoMoi);
        System.out.println("Tiền trả định mức: " + tienDinhMuc + "đ");
        System.out.println("Tiền trả vượt định mức: " + tienVuotDinhMuc + "đ");
        System.out.println("Tổng tiền: " + tong + "đ");
    }
}
