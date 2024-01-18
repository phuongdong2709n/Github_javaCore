package lab06;


import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
//        List<Integer> list =new ArrayList<>();

        Scanner sc=new Scanner(System.in);
        System.out.println("nhap n ptu: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("ptu thu " +i);
             a[i]=sc.nextInt();

        }
        System.out.println("hien thị. ");
        for (int i=0;i<n;i++){
            System.out.println(" " +a[i]);
        }
        //sắp xêps
        //max
        int max=a[0];
        int min=a[0];
        for(int i=0;i<n;i++){
            if (max < a[i]) {
                max = a[i];
                System.out.println("max: " + max);
            }
        }
        //min
        for(int i=0;i<n;i++){
            if (min > a[i]) {
                min = a[i];
                System.out.println("max: " + min);
            }
        }
    }
}
