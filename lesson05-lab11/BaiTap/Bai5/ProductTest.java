package Lab11.BaiTap.Bai5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductTest {
    Map<Integer,Product> mapPro=new HashMap<>();
    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap n san pham.");
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            sc.nextLine();
            System.out.println("san pham thu : " +(i+1));
            System.out.println("proId: " );
            String proId=sc.nextLine();
            System.out.println("proName: " );
            String proName=sc.nextLine();
            System.out.println("producer: " );
            String producer=sc.nextLine();
            System.out.println("yearMaking: " );
            int yearMaking=sc.nextInt();
            System.out.println("price: " );
            float price=sc.nextFloat();
            Product p=new Product(proId,proName,producer,yearMaking,price);
            mapPro.put((i+1),p);

        }
    }
    public void hienThi(){
        System.out.println("------------thông tin--------------");
        mapPro.forEach((integer, product) -> {
            System.out.println(" " +integer +" " +product );
            
        });
        System.out.println("---------------------");
}

    public void thoat(){
        System.exit(0);
}


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ProductTest pro=new ProductTest();
        while (true){
            System.out.println("lựa chọn.");
            System.out.println("1.nhập thông tin");
            System.out.println("2.hiển thị thông tin");
            System.out.println("3.thoát");
            System.out.println("chọn số");
            int chon=sc.nextInt();
            switch (chon){
                case 1:
                    pro.Nhap();
                    break;
                case 2:
                    pro.hienThi();
                    break;
                case 3:
                    pro.thoat();
                    break;
                default:
                    System.out.println("chọn lại số từ 1->3");
                    break;
            }
        }
    }
}
