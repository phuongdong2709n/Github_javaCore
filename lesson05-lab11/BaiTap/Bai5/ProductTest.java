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
//            mapPro.put(p);

        }
    }
}
