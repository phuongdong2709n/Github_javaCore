package Lab05;



import java.util.ArrayList;
import java.util.Scanner;

public class GeneralManager {
        ArrayList<Product> product= new ArrayList<>();
        public void Nhap(){
            Scanner sc=new Scanner(System.in);
            System.out.println("nhập số lương phẩm");
            int soLuong=sc.nextInt();
            for(int i=1;i<=soLuong;i++){
                sc.nextLine();
                System.out.println("Nhập proId: ");
                String prodId=sc.nextLine();
                System.out.println("Nhập tên sản phẩm prodName: ");
                String prodName=sc.nextLine();
                System.out.println("Nhập nhà sản xuất manufacturer: ");
                String manufacturer=sc.nextLine();
                System.out.println("Nhập giá sản xuất producerPrice: ");
                float producerPrice=sc.nextFloat();
                System.out.println("Thuế nhập khẩu taxImported:  " );
                float taxImported=sc.nextFloat();
                System.out.println("Nhập giá bán import_price:  " );
                float import_price=sc.nextFloat();

                VietNamImportPrice vn =new VietNamImportPrice(prodId,prodName,manufacturer,producerPrice,taxImported,import_price);
                product.add(vn);
            }

        }

        public void hienThiThongTin(){
            //Duyệt qua tất cả các sản phẩm trong danh sách product
            for (Product p : product){
                //Kiểm tra xem đối tượng p có phải là một đối tượng của lớp VietNamImportPrice hay không.
                if (p instanceof VietNamImportPrice) {
                    //Nếu p là một đối tượng của lớp VietNamImportPrice, thì nó sẽ được ép kiểu thành VietNamImportPrice và gán cho biến v.
                    VietNamImportPrice v = (VietNamImportPrice) p;
                    System.out.println(" proId: " +v.getProdId());
                    System.out.println(" tên sản phẩm prodName: " +v.getProdName());
                    System.out.println(" nhà sản xuất manufacturer: " +v.getManufacturer());
                    System.out.println(" giá sản xuất producerPrice: " +v.getProducerPrice());
                    System.out.println(" Thuế nhập khẩu taxImported:  " +v.getTaxImported() );
                    System.out.println(" giá nhập khẩu import_price:  " +v.getImport_price());
                    System.out.println(" giá bán sale_price:  " +v.getSale_price());
                    System.out.println(" giá bán ở việt nam sale_priceVN:  " +v.getSale_priceVN());
                }

            }
            System.out.println("================================");
        }

}
