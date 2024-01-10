package Lesson01;

import java.util.Scanner;

public class bai14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập chỉ số cũ: ");
        float chiSoCu= sc.nextFloat();
        System.out.println("Nhập chỉ số mới: ");
        float chiSoMoi=sc.nextFloat();
        float soKW=chiSoMoi-chiSoCu;
        float tienThue=1000;
        float DichMuc=50;
        float giaDinhMuc=230;
        float vuotDichMuc1=480;
        float vuotDichMuc2=700;
        float vuotDichMuc3=900;
        float tong=0;
        float tienVuotDinhMuc=0;
        float tienDinhMuc=0;
       if(soKW<=50){
           tienDinhMuc=soKW*DichMuc;
            System.out.println(" Tiền định mức:" +tienDinhMuc);
            System.out.println("tổng tiền điện: " +(tienThue+tienDinhMuc));
       }else{
           // Tính tiền định mức
            tienDinhMuc=giaDinhMuc*DichMuc;
           float soKWvuotDinhMuc=soKW-DichMuc;

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
