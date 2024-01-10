package demo;

import java.util.Scanner;

public class bai11 {

    static boolean kiemTra(int n){
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int n = 100;
        System.out.println("Các số hoàn hảo từ 1 đến " + n + " là:");
        for (int i = 1; i <= n; i++) {
            if (kiemTra(i)) {
                System.out.println(i);
            }
        }
    }


}
