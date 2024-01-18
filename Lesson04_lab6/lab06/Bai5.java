package lab06;

import java.util.Scanner;

public class Bai5 {
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap n ptu: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        //nhập
        System.out.println("Nhap. ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        //xuất
        System.out.println("xuất. ");
        for(int i=0;i<n;i++){
            System.out.println(" " +a[i]);
        }
        //in số nguyên tố
        System.out.println("Kết quả kiểm tra số nguyên tố trong mảng:");
        for (int i = 0; i < n; i++) {
            if (isPrime(a[i])) {
                System.out.println(a[i] + " là số nguyên tố.");
            } else {
                System.out.println(a[i] + " không là số nguyên tố.");
            }
        }
    }
}
