package lab06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap n ptu.");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("nhap ptu thu " +i);
            int a=sc.nextInt();
            list.add(a);
        }
        System.out.println("hiển thị.");
        for (int i=0;i<n;i++){
            System.out.println(" " +list.get(i));
        }
    }
}
