package Lab11.BaiTap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap n ptu:");
        int n=Integer.parseInt(sc.nextLine());
        for (int i=0;i<n;i++){
            System.out.println("nhap so thu " +i);
            int x=Integer.parseInt(sc.nextLine());
            list.add(x);
        }

        for(Integer in : list){
            System.out.printf(" %d ", in);
        }

    }
}
