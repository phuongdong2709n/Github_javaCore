package demo;

import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("------------------------------");
            System.out.print("nhap n = ");
            int n=sc.nextInt();
            System.out.println("Cuối tuần bạn muốn làm gì ");
            System.out.println("1. Đi học java");
            System.out.println("2.Đi chơi công viên ngắm gái");
            System.out.println("3.đi về nhà nghỉ");
            System.out.println("4.Ra sông hồng tắm tiên");
            System.out.println("5.ngủ cả ngày");
            System.out.println("6. thoát");

            switch (n){
                case 1:
                    System.out.println("LỰA CHỌN CỦA BẠN LÀ: Đi học java");
                    break;
                case 2:
                    System.out.println("LỰA CHỌN CỦA BẠN LÀ: Đi chơi công viên ngắm gái");
                    break;
                case 3:
                    System.out.println("LỰA CHỌN CỦA BẠN LÀ: đi về nhà nghỉ");
                    break;
                case 4:
                    System.out.println("LỰA CHỌN CỦA BẠN LÀ: Ra sông hồng tắm tiên");
                    break;
                case 5:
                    System.out.println("LỰA CHỌN CỦA BẠN LÀ: ngủ cả ngày");
                    break;
                case 6:
                   System.exit(0);
                    break;
                default:
                    System.out.println("nhap lại");
                    break;
            }
        }
    }
}
