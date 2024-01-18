package lab06;

import java.util.Random;

public class bai2 {
    public static void main(String[] args) {
        int[] a=new int[10];
        Random rd= new Random();

        for (int i=0;i<a.length;i++){
            a[i]=rd.nextInt(100);
        }
        System.out.println("hiển thị. ");
        for (int i=0;i<a.length;i++){
            System.out.println(" " +a[i] );
        }
    }
}
