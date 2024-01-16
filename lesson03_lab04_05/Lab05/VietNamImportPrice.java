package Lab05;

public class VietNamImportPrice extends Product{
    private float taxImported;
    private float import_price;
    private float sale_priceVN;
    public VietNamImportPrice(){}
    public VietNamImportPrice(String prodId, String prodName, String manufacturer, float producerPrice, float taxImported,float import_price) {
        super(prodId, prodName, manufacturer, producerPrice);
        this.taxImported = taxImported;
        this.import_price = import_price;
        caculateSaleprice();
    }

    public float getTaxImported() {
        return taxImported;
    }

    public void setTaxImported(float taxImported) {
        this.taxImported = taxImported;
    }

    public float getImport_price() {
        return import_price;
    }

    public void setImport_price(float import_price) {
        this.import_price = import_price;
    }

    public float getSale_priceVN() {
        return sale_priceVN;
    }

    public void setSale_priceVN(float sale_priceVN) {
        this.sale_priceVN = sale_priceVN;
    }
    public void caculateSaleprice(){
       this.sale_priceVN= (float) (this.import_price+(this.taxImported*this.import_price) + (0.1)*(this.import_price+(this.taxImported*this.import_price))
                      +(0.05)*this.import_price);

    }
    @Override
    public void hienThiThongTin(){
        //gọi đến phương thức cha
        super.hienThiThongTin();
        System.out.println("Thuế nhập khẩu taxImported:  " +taxImported );
        System.out.println("Nhập giá bán import_price:  " +import_price );
    }


}
