package Lab11.BaiTap;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bai2 {
    public static void main(String[] args) {
        Set<String> str=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap n thanh pho");
        int n=Integer.parseInt(sc.nextLine());
        System.out.println("nhap thanh pho:");
        for (int i=0;i<n;i++){
            //convert từ String sang int
//            int x=Integer.parseInt(sc.nextLine());
            String x=sc.nextLine();
            str.add(x);

        }

        System.out.println("xuat thanh pho:");
        for (String s : str){
            System.out.println(" " +s);
        }
    }
}

