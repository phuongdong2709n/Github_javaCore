package lab06;

import java.util.Scanner;

public class Bai6 {
    static boolean kiemTra(int n){
        if(n<=1){
            System.out.println("nhap lai");
        }
        int sum=1;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                sum+=i;
                if(i!=(n/i)){
                    sum+=n/i;
                }
            }
        }
        return sum==n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap n ptu: ");
        int n=sc.nextInt();
        int[] a= new int[n];
        System.out.println("nhap:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("xuat.");
        for(int i=0;i<n;i++){
            System.out.println(" " +a[i]);
        }
        System.out.println("so hoan hao:");
        for(int so : a){
            if(kiemTra(so)){
                System.out.println(so + " là số hoàn hảo.");
            }else{
                System.out.println(so + " không là số hoàn hảo.");
            }
        }


    }
}
