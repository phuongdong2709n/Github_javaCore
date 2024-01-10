package demo;

import java.util.Scanner;

public class bai8 {
    void CauA(int n){
        int giaithua=1;
        for(int i=1;i<=n;i++){
            giaithua=giaithua*i;
        }
        System.out.print("kết quả: " +giaithua);
    }

    public static void main(String[] args) {
       bai8 b = new bai8();
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap n = ");
        int n=sc.nextInt();
        if (n>0){
            b.CauA(n);
        }else{
            System.out.println("nhap lại n");
        }
    }
}
