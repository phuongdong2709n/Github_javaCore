package Lesson01;

import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
           System.out.println("-------------mời chọn số-----------.");
           System.out.println("1.Búa");
            System.out.println("2.Kéo");
            System.out.println("3.giấy");
            int chonNguoi= sc.nextInt();
            int chonMay= (int) (Math.random()*3)+1;
            if(chonNguoi>3 || chonNguoi<0 ){
                System.out.println("mời bạn nhập lại");
                continue;
            }
            if(chonNguoi==4){
                System.exit(0);
            }
            switch (chonNguoi){
                case 1:
                    System.out.println("bạn chọn: búa");
                    break;
                case 2:
                    System.out.println("bạn chọn: kéo");
                    break;
                case 3:
                    System.out.println("bạn chọn: giấy");
                    break;
                default:
                    System.out.println("lựa chọn không hợp lệ");
                    break;
            }

            switch (chonMay){
                case 1:
                    System.out.println("máy chọn: búa");
                    break;
                case 2:
                    System.out.println("máy chọn: kéo");
                    break;
                case 3:
                    System.out.println("máy chọn: giấy");
                    break;
                default:
                    System.out.println("lựa chọn không hợp lệ");
                    break;
            }

            if(chonNguoi==chonMay){
                System.out.println("Kết quả: Hòa nhau");
            }else if((chonNguoi==1 && chonMay==2) || (chonNguoi==2 && chonMay==3) || (chonNguoi==3 && chonMay==1) ){
                System.out.println("Kết quả: Người thắng");
            }else {
                System.out.println("Kết quả: Người thua");
            }
            System.out.println("----------------------------------");
            System.out.println("Bạn có muốn chơi nữa không ");
            System.out.println("1.có");
            System.out.println("2.không");
            int choi=sc.nextInt();
            if(choi==1){
                continue;
            }
            if(choi==2){
                System.exit(0);
            }
        }

    }
}
