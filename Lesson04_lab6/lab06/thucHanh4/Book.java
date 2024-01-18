package lab06.thucHanh4;

import java.util.Scanner;

public class Book {
    private String tenSach;
    private String NhaXuatBan;
    private String NamXuatBan;
    private String TacGia;
    private int SoTrang;
    private float GiaTien;



    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sách:");
        this.tenSach = sc.nextLine();
        System.out.println("Nhập nhà xuất bản:");
        this.NhaXuatBan = sc.nextLine();
        System.out.println("Nhập năm xuất bản:");
        this.NamXuatBan = sc.nextLine();
        System.out.println("Nhập tác giả:");
        this.TacGia = sc.nextLine();
        System.out.println("Nhập số trang:");
        this.SoTrang = sc.nextInt();
        System.out.println("Nhập giá tiền:");
        this.GiaTien = sc.nextFloat();
    }

//    public void Xuat() {
//        System.out.println("======== HIỆN THỊ========");
//        System.out.println("tên sách:" + tenSach);
//        System.out.println("nhà xuất bản:" + NhaXuatBan);
//        System.out.println("năm xuất bản:" + NamXuatBan);
//        System.out.println("tác giả:" + TacGia);
//        System.out.println("số trang:" + SoTrang);
//        System.out.println("giá tiền:" + GiaTien);
//    }
    @Override
    public String toString(){
        return "Tên sách:" +tenSach + " " +
                "Nhà xuất bản:" +NhaXuatBan + " " +
                "năm xuất bản:" +NamXuatBan+  " " +
                "Tác giá:" +TacGia+  " " +
                "Số trang: " +SoTrang+  " " +
                "Giá tiền: " +GiaTien
                ;
    }
}
