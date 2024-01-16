package Lab05;

public class ThaiLanImportPrice extends Product{
    private float taxImport;
    private float importPricaSupport;

    public ThaiLanImportPrice(String prodId, String prodName, String manufacturer, float producerPrice, float taxImport, float importPricaSupport) {
        super(prodId, prodName, manufacturer, producerPrice);
        this.taxImport = taxImport;
        this.importPricaSupport = importPricaSupport;
    }

    public float getTaxImport() {
        return taxImport;
    }

    public void setTaxImport(float taxImport) {
        this.taxImport = taxImport;
    }

    public float getImportPricaSupport() {
        return importPricaSupport;
    }

    public void setImportPricaSupport(float importPricaSupport) {
        this.importPricaSupport = importPricaSupport;
    }

}
