package Lab05;

import java.util.Scanner;

public class Product {
    private String prodId;
    private String prodName;
    private  String manufacturer;
    private float producerPrice;
    private float sale_price;
    public Product(){}

    public Product(String prodId, String prodName, String manufacturer, float producerPrice) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.manufacturer = manufacturer;
        this.producerPrice = producerPrice;
        clalculateSalePrice();
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getProducerPrice() {
        return producerPrice;
    }

    public void setProducerPrice(float producerPrice) {
        this.producerPrice = producerPrice;
    }
    public float getSale_price() {
        return sale_price;
    }

    public void setSale_price(float sale_price) {
        this.sale_price = sale_price;
    }

//    public void input(){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Nhap prodId: ");
//        prodId=sc.nextLine();
//        System.out.println("nhap prodName: ");
//        prodName=sc.nextLine();
//        System.out.println("nhap manufacturer: ");
//        manufacturer=sc.nextLine();
//        System.out.println("nhap producerPrice: ");
//        producerPrice=sc.nextFloat();
//    }

    public void clalculateSalePrice(){
        this.sale_price=this.producerPrice+ ((float) (this.producerPrice*0.05));

    }
    public void hienThiThongTin(){
        System.out.println("------------Hien thi thong tin san pham----------");
        System.out.println("id product: " +prodId);
        System.out.println("name product: " +prodName);
        System.out.println("manufacturer: " +manufacturer);
        System.out.println("producerPrice: " +producerPrice);
    }

}

