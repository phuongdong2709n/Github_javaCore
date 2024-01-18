package lab06;

import java.util.Scanner;

public class Bai9 {
    static void SapXep(int[] a){
        int n=a.length;
        int temp;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j] > a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap n ptu");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("nhap mảng:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("xuất mảng.");
        for(int i=0;i<n;i++){
            System.out.println(" " +a[i]);
        }
        //sắp xếp
        SapXep(a); //gọi đến mảng a
        System.out.println("kết quả să xếp");
        for (int i = 0; i < n; i++) {
                System.out.println(a[i] + " ");
        }

    }
}
