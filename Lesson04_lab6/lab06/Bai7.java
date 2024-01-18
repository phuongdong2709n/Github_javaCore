package lab06;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap n ptu: ");
        int n=sc.nextInt();
        int[] a= new int[n];
        System.out.println("nhap:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
//        System.out.println("xuat.");
//        for(int i=0;i<n;i++){
//            System.out.println(" " +a[i]);
//        }
        //in số chẵn
        System.out.println("so chẵn là: ");
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                System.out.println(" " +a[i]);
            }
        }
    }
}
