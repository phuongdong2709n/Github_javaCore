package Lab11.BaiTap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Map<Integer, String> map1=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap n quoc gia: ");
        int n=Integer.parseInt(sc.nextLine());
        System.out.println("nhap quoc gia:");

        for (int i=0;i<n;i++){
            System.out.println(" mang thu" +i);
            int key = sc.nextInt();
            String value = sc.nextLine();
            map1.put(key,value);
        }
//        System.out.printf(" " +map1);

        map1.forEach((key, value) -> {
            System.out.println(" " +key +" - " +value);
//            System.out.printf("[%s,%s] \n",key,value);
        });
    }
}
