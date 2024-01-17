package Lab05;

public class ThaiLanImportPrice extends Product{
    private float taxImported;
    private float importPriceSupport;
    private float imported_price;
    private float sale_priceTL;

    public ThaiLanImportPrice(String prodId, String prodName, String manufacturer, float producerPrice, float taxImported
            , float importPriceSupport,float imported_price) {
        super(prodId, prodName, manufacturer, producerPrice);
        this.taxImported = taxImported;
        this.imported_price = imported_price;
        this.importPriceSupport = importPriceSupport;
        caculateSaleprice();
    }

    public float getTaxImported() {
        return taxImported;
    }

    public void setTaxImported(float taxImport) {
        this.taxImported = taxImported;
    }

    public float getImportPriceSupport() {
        return importPriceSupport;
    }

    public void setImportPriceSupport(float importPriceSupport) {
        this.importPriceSupport = importPriceSupport;
    }
    public float getSale_priceTL() {
        return sale_priceTL;
    }

    public void setSale_priceTL(float sale_priceTL) {
        this.sale_priceTL = sale_priceTL;
    }
    public float getImported_price() {
        return imported_price;
    }

    public void setImported_price(float imported_price) {
        this.imported_price = imported_price;
    }

    public void caculateSaleprice(){
        this.sale_priceTL= (float) (this.imported_price+this.taxImported*this.imported_price
                        -(this.importPriceSupport*this.imported_price) +0.1*(this.imported_price+this.taxImported*this.imported_price
                        -this.importPriceSupport*this.imported_price));

    }

    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("Thuế nhập khẩu taxImport:  " +taxImported );
        System.out.println("Nhập giá Giá hỗ tợ nhập khẩu importPriceSupport:  " +importPriceSupport );
    }
}
