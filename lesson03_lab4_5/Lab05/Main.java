package Lab05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GeneralManager quanly=new GeneralManager();
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("xin mời lựa chọn.");
            System.out.println("1.nhập thông tin.");
            System.out.println("2.hiển thị thông tin.");
            System.out.println("3.thoát.");
            int luaChon=sc.nextInt();
            switch (luaChon){
                case 1:
                    quanly.Nhap();
                    break;
                case 2:
                    quanly.hienThiThongTin();
                    break;
                case 3:
                    quanly.thoat();
                default:
                    System.out.println("chọn lại.");
                    break;
            }
        }
    }
}
