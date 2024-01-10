package demo;

import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap n= ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                System.out.println(" " +i);
                sum=sum+i;
            }
        }
        System.out.println("tong các ước: " +sum);
        if(sum==n){
            System.out.println("đây la số hoàn hảo");
        }else{
            System.out.println("không phải là số hoàn hảo  ");
        }
    }
}
