package demo;

import java.util.Scanner;

public class bai3 {


    int UocChungLonNhat(int a, int b){
        int maxAB=0;
        int n= a < b ? a : b;
        for(int i=n;i>0;i--){
            if(a%i==0 && b%i==0){
                maxAB=i;
                System.out.println("nhung so chia het cho a va b: " +maxAB);
                break;
            }
        }
        return maxAB;
    }

    int BCNN(int a, int b){
        int bcnn=0;
        int n=a*b;
        for(int i=1;i<n;i++){
                bcnn=i;
                System.out.println("boi chunng nho nhat cua a va b: " +bcnn );
                break;
        }
        return bcnn;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap a = ");
        int a=sc.nextInt();
        System.out.println("nhap b = ");
        int b=sc.nextInt();
        bai3 m=new bai3();
        m.UocChungLonNhat(a,b);
       m.BCNN(a,b);
    }
}
