package demo;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap n= ");
        int n= sc.nextInt();
        if(n<=0){
            System.out.println("nhap lai!" );
        }else{
            for(int i=2;i< Math.sqrt(n);i++){
                if(n%i!=0){
                    System.out.println("la So nguyen to ");
                }else{
                    System.out.println("khong la So nguyen to ");
                }
                
            }

        }

    }
}
