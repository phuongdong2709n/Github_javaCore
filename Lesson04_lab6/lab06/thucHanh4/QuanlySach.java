package lab06.thucHanh4;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanlySach {
    ArrayList<Book> book=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    public int Menu(){
        System.out.println("Menu.");
        System.out.println("1.Nhập dữ liệu.");
        System.out.println("2.Hiển thị dữ liệu.");
        System.out.println("3.Xóa.");
        System.out.println("4.Thoát.");
        System.out.println("Chọn từ 1 đến 4.");
        Scanner sc=new Scanner(System.in);
        return sc.nextInt();
    }
    public void Nhap(){

        System.out.println("Số sách muốn nhập. ");
        int soLuong=sc.nextInt();
       for(int i=0;i<soLuong;i++){
           System.out.println("Nhập cuốn thứ: " +(i+1));
           Book b=new Book();
           b.Nhap();
           book.add(b);
       }

    }

    public void hienThi(){
        System.out.println("Sô sách trong thu viện.");
        for (int i=0;i<book.size();i++){
            Book g=book.get(i);
            System.out.println(i+" . "+g.toString());
        }
        System.out.println("----------------------");
    }

    public void Xoa(){
        System.out.println("Nhập số thứ tự sách muốn xóa.");
        int id=sc.nextInt();
        if(id<book.size() && id>=0){
            book.remove(id);
        }
        System.out.println("xóa thành công");
    }

    public void thoat(){
        System.exit(0);
    }

    public static void main(String[] args) {
        QuanlySach qly=new QuanlySach();
        int chon;
        do {
            chon=qly.Menu();
            switch (chon){
                case 1:
                    qly.Nhap();
                    break;
                case 2:
                    qly.hienThi();
                    break;
                case 3:
                    qly.Xoa();
                    break;
                case 4:
                    qly.thoat();
                    break;
                default:
                    System.out.println("chon lại");
                    break;
            }
        }while (true);


    }


}
