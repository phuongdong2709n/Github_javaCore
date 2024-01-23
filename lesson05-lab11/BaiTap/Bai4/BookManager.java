package Lab11.BaiTap.Bai4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BookManager {
//    ArrayList<Book> book=new ArrayList<>();
   static Set<Book> book=new HashSet<>();
    public void Nhap()  {
//InputStreamReader để đọc dữ liệu từ System.in
//        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap n quyển sách.");
        int n=sc.nextInt();
//        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            sc.nextLine();
            System.out.println("quyen sach thu:" +(i+1));
            System.out.println(" isbn: " );
            String isbn=sc.nextLine();
            System.out.println("bookName: ");
            String bookName=sc.nextLine();
            System.out.println("author: ");
            String author=sc.nextLine();
            System.out.println("publisher: ");
            String publisher=sc.nextLine();
            System.out.println("price: ");
            float price=sc.nextFloat();
            Book b=new Book(isbn,bookName,author,publisher,price);
            book.add(b);
        }
    }
    public void hienThi(){
        System.out.println("------------thông tin sách-------------");
        for (Book b1 : book){
            System.out.println("isbn: " +b1.getIsbn());
            System.out.println("bookName: " +b1.getBookName());
            System.out.println("author: " +b1.getAuthor());
            System.out.println("publisher: " +b1.getPublisher());
            System.out.println("price: " +b1.getPrice());
        }
        System.out.println("---------------------------------");
    }
    public void thoat(){
        System.exit(0);
    }
    public static void main(String[] args) {
        BookManager qly=new BookManager();
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("lựa chọn.");
            System.out.println("1.nhập thông tin");
            System.out.println("2.hiển thị thông tin");
            System.out.println("3.thoát");
            System.out.println("chọn số");
            int chon=sc.nextInt();
            switch (chon){
                case 1:
                    qly.Nhap();
                    break;
                case 2:
                    qly.hienThi();
//                    book.toString();
                    break;
                case 3:
                    qly.thoat();
                    break;
                default:
                    System.out.println("chọn lại số từ 1->3");
                    break;
            }
        }

    }
}
