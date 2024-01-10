package Lesson01;

import java.util.Scanner;

public class bai05 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap n: ");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("n là so chan.");
        }else{
            System.out.println("n la so le.");
        }
    }
}
