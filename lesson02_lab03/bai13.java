package demo;

import java.util.Scanner;

public class bai13 {
    public static void kiemTra(int num) {
        for (int i = 2; i <= num; i++) {
            int count = 0;

            while (num % i == 0) {
                count++;
                num /= i;
            }
            if (count > 0) {
                System.out.println(i + "^" + count);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();
        System.out.println("Dạng tích lũy thừa các thừa số nguyên tố của " + n + " là:");
        kiemTra(n);
    }
}
