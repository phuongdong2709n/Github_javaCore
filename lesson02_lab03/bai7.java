package demo;

import java.util.Scanner;

public class bai7 {

    void CauA(int n){
        int sum=0;
        float tong=0;
        int count=0;

        System.out.print("so lẻ là:" );
        for(int i= 1;i<n;i+=2){
            //tìm số lẻ
            System.out.print(" " +i);
            // tiính tổng bình phương số lẻ
            sum=sum+i*i;
            //tổng số nguyên dương
            tong=tong+i;
            //đếm số lẻ
            count=i;

        }
        System.out.println();
        System.out.println("tong binh phuong so le là: " +sum);
        System.out.println(" trung bình cộng của n: " +tong/count);

        float s=(tong/count);
        //in các số chẵn lớn hơn trung bình cộng của n
        System.out.print("các số chắn lớn hơn trung bình cộng của n: ");
        for(int i=1;i<n;i++){
            if(i%2==0 && i>s){
                System.out.print(" " +i);
            }
        }
    }


    public static void main(String[] args) {
        bai7 b=new bai7();
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap n = ");
        int n=sc.nextInt();
        if (n>0){
            b.CauA(n);
        }else{
            System.out.println("nhap lại n");
        }
    }
}
