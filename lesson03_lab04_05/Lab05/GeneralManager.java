package Lab05;



import java.util.ArrayList;
import java.util.Scanner;

public class GeneralManager {
        ArrayList<Product> product= new ArrayList<>();
        public void Nhap(){
            Scanner sc=new Scanner(System.in);
            System.out.println("bạn muốn bán hàng ở đâu.");
            System.out.println("1.Việt nam");
            System.out.println("2.thái lan");
            int luaChon=sc.nextInt();
            switch (luaChon){
                case 1:
                    System.out.println("nhập số lương phẩm ở việt nam");
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
                    break;
                case 2:
                    System.out.println("nhập số lương phẩm ở thái lan");
                    int soLuongTL=sc.nextInt();
                    for(int i=1;i<=soLuongTL;i++){
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
                        System.out.println("Nhập giá hỗ trợ nhập khẩu importPriceSupport:  " );
                        float importPriceSupport=sc.nextFloat();
                        System.out.println("Nhập giá bán imported_price:  " );
                        float imported_price=sc.nextFloat();

                        ThaiLanImportPrice tl =new ThaiLanImportPrice(prodId,prodName,manufacturer,producerPrice,taxImported,importPriceSupport,imported_price);
                        product.add(tl);
                    }
                    break;
                default:
                    System.out.println("bạn nhập sai số! hãy chọn lại.");
                    break;
            }


        }

        public void hienThiThongTin(){
            Scanner sc=new Scanner(System.in);
            System.out.println("bạn muốn hiển thị sản phẩm nước nào.");
            System.out.println("1.Việt nam");
            System.out.println("2.Thái lan");
            System.out.println("3.Hiển thị tất cả");
            int chon=sc.nextInt();
            switch (chon){
                case 1:
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
                    break;
                case 2:
                    //Duyệt qua tất cả các sản phẩm trong danh sách product
                    for (Product p : product){
                        //Kiểm tra xem đối tượng p có phải là một đối tượng của lớp ThaiLanImportPrice hay không.
                        if (p instanceof ThaiLanImportPrice) {
                            //Nếu p là một đối tượng của lớp ThaiLanImportPrice, thì nó sẽ được ép kiểu thành ThaiLanImportPrice và gán cho biến .t
                            ThaiLanImportPrice t = (ThaiLanImportPrice) p;
                            System.out.println(" proId: " +t.getProdId());
                            System.out.println(" tên sản phẩm prodName: " +t.getProdName());
                            System.out.println(" nhà sản xuất manufacturer: " +t.getManufacturer());
                            System.out.println(" giá sản xuất producerPrice: " +t.getProducerPrice());
                            System.out.println(" Thuế nhập khẩu taxImported:  " +t.getTaxImported() );
                            System.out.println(" Giá hỗ tợ nhập khẩu importPriceSupport  " +t.getImportPriceSupport() );
                            System.out.println(" giá nhập khẩu imported_price:  " +t.getImported_price() );
                            System.out.println(" giá bán sale_price:  " +t.getSale_price());
                            System.out.println(" giá bán ở thái lan sale_priceTL:  " +t.getSale_priceTL());
                        }

                    }
                    System.out.println("================================");
                    break;
                case 3:
                    //VIỆT NAM
                    for (Product p : product){
                        //Kiểm tra xem đối tượng p có phải là một đối tượng của lớp VietNamImportPrice hay không.
                        if (p instanceof VietNamImportPrice) {
                            System.out.println("hiển thị thông tin ở VIỆT NAM " );
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

                    //THÁI LAN
                    for (Product p : product){
                        //Kiểm tra xem đối tượng p có phải là một đối tượng của lớp ThaiLanImportPrice hay không.
                        if (p instanceof ThaiLanImportPrice) {
                            System.out.println("hiển thị thông tin ở THÁI LAN " );
                            //Nếu p là một đối tượng của lớp ThaiLanImportPrice, thì nó sẽ được ép kiểu thành ThaiLanImportPrice và gán cho biến .t
                            ThaiLanImportPrice t = (ThaiLanImportPrice) p;
                            System.out.println(" proId: " +t.getProdId());
                            System.out.println(" tên sản phẩm prodName: " +t.getProdName());
                            System.out.println(" nhà sản xuất manufacturer: " +t.getManufacturer());
                            System.out.println(" giá sản xuất producerPrice: " +t.getProducerPrice());
                            System.out.println(" Thuế nhập khẩu taxImported:  " +t.getTaxImported() );
                            System.out.println(" Giá hỗ tợ nhập khẩu importPriceSupport  " +t.getImportPriceSupport() );
                            System.out.println(" giá nhập khẩu imported_price:  " +t.getImported_price() );
                            System.out.println(" giá bán sale_price:  " +t.getSale_price());
                            System.out.println(" giá bán ở thái lan sale_priceTL:  " +t.getSale_priceTL());
                        }

                    }
                    System.out.println("================================");
                    break;
                default:
                    System.out.println("mời nhập lại.");
                    break;
            }

        }
        public void thoat(){System.exit(0);}

}
