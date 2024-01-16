package Lab04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyHoaDon quanly=new QuanLyHoaDon();
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("chọn chức năng. ");
            System.out.println("1. Nhập thông tin hóa đơn");
            System.out.println("2. Hiển thị thông tin hóa đơn");
            System.out.println("3. Thoát");
            int luaChon=sc.nextInt();
            switch (luaChon){
                case 1:
                    quanly.nhapThongTin();
                    break;
                case 2:
                    quanly.hienThi();
                    break;
                case 3:
                    quanly.Thoat();
                    break;
                default:
                    System.out.println("Nhập lại lựa chọn. ");
                    break;
            }
        }
    }
}
