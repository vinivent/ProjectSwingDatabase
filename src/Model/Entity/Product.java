package Model.Entity;

import java.sql.Date;

public class Product {

    private Integer productId, productQtd;
	private String productName, productCategory;
	private Double productPurchase, productSale;
    private Date productDate;

    public Product(Integer productId, Integer productQtd, String productName, String productCategory, Double productPurchase,
        Double productSale, Date productDate) {
        this.productId = productId;
        this.productQtd = productQtd;
        this.productName = productName;
        this.productCategory = productCategory;
        this.productPurchase = productSale;
        this.productSale = productSale;
        this.productDate = productDate;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductQtd() {
        return productQtd;
    }

    public void setProductQtd(Integer productQtd) {
        this.productQtd = productQtd;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public Double getProductPurchase() {
        return productPurchase;
    }

    public void setProductPurchase(Double productPurchase) {
        this.productPurchase = productPurchase;
    }

    public Double getProductSale() {
        return productSale;
    }

    public void setProductSale(Double productSale) {
        this.productSale = productSale;
    }

    public Date getProductDate() {
        return productDate;
    }

    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }

}