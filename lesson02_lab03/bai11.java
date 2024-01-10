package Lesson01;

import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap a: ");
        float a=sc.nextFloat();
        System.out.println("nhập b: ");
        float b=sc.nextFloat();
        while (true){
            System.out.println("Nhập toán tử +,-,*,/ ");
            char kiTu=sc.next().charAt(0);
            switch (kiTu){
                case '+':
                    System.out.println("kết quả là: " +(a+b));
                    break;
                case '-':
                    System.out.println("kết quả là: " +(a-b));
                    break;
                case '*':
                    System.out.println("kết quả là: " +(a*b));
                    break;
                case '/':
                    if(b>0){
                        System.out.println("kết quả là: " +(a/b));
                    }else{
                        System.out.println("kết quả là: Không chia được ");
                    }
                    break;
                default:
                    System.out.println("Nhập sai kí tự.");
                    break;
            }

            System.out.println("----------------------------------");
            System.out.println("Bạn có muốn tiếp tục nữa không ");
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
