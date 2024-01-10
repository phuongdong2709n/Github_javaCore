package demo;

import java.util.Scanner;

public class bai2 {
    void xuatTongN(int n){
        int sum=0;
        for (int i=1;i<n;i++){
            sum+=i;
        }
       System.out.println("kq : " +sum);

    }

    //cách 2
//    int xuatTongN(int n){
//        int sum=0;
//        for (int i=1;i<n;i++){
//            sum+=i;
//        }
//      return sum;
//
//    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap n= ");
        int n=sc.nextInt();
        bai2 b=new bai2();
        b.xuatTongN(n);
//        int sum=0;
//        for (int i=1;i<n;i++){
//            sum+=i;
//        }
//        System.out.println("kq 2: " +sum);
    }
}
