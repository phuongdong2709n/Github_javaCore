package demo;

import java.util.Scanner;

public class bai12 {
    static void kiemtra(int n) {
        int a = 0, b = 1;

        // In ra số 0 nếu n > 0 hoặc nếu n = 0
        if (n >= 0) {
            System.out.print(a + " ");
        }

        // In ra số 1 nếu n > 1
        if (n >= 1) {
            System.out.print(b + " ");
        }

        // Bắt đầu từ số thứ 3 trong dãy Fibonacci
        int sum = a + b;
        while (sum <= n) {
            System.out.print(sum + " ");
            a = b;
            b = sum;
            sum = a + b;

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();
        System.out.println("Dãy Fibonacci có giới hạn từ 1 đến " + n + " là:");
        kiemtra(n);
    }
}
