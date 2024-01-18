package lab06;

import java.util.Scanner;

public class BaiThucHanh2 {
    Scanner sc=new Scanner(System.in);
    String[][] NhanVien= new String[2][2];
    public void nhap(){

        for (int i=0;i< NhanVien.length;i++){
            for (int j=0;j<NhanVien.length;j++){
                System.out.println("nhap ten: " );
                NhanVien[i][j]=sc.nextLine();
                System.out.println("nhap luong: ");
                NhanVien[i][j]=sc.nextLine();
            }
        }
    }

    public void Xuat(){
        for (int i=0;i< NhanVien.length;i++){
            for (int j=0;j<NhanVien.length;j++){
                System.out.printf("\n hiển tên: NhanVien[%d][%d] = %s ",i,j,NhanVien[i][j]);
                System.out.printf(" \n hiển lương: NhanVien[%d][%d] = %s ",i,j,NhanVien[i][j]);

            }
        }

    }
    public static void main(String[] args) {
        BaiThucHanh2 t=new BaiThucHanh2();
        t.nhap();
        t.Xuat();

    }
}
