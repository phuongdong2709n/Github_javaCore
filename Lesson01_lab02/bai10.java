package Lesson01;

import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("Xin mời bạn hãy nhập màu");
            char color = sc.next().charAt(0);
            if(color=='R' || color=='r'){
                System.out.println("Color = Red.");
            }else if(color=='G' || color=='g'){
                System.out.println("Color = Gree.");
            }else if(color=='B' || color=='b'){
                System.out.println("Color = Blue.");
            }else{
                System.out.println("Color = Black.");
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
