package Model.Entity;

public class Product {

  
	private String productName, productCategory;
    private Double productPurchase, productSale;
    private Integer productId, productQtd;
    java.sql.Date productDate;


    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return this.productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public Double getProductPurchase() {
        return this.productPurchase;
    }

    public void setProductPurchase(Double productPurchase) {
        this.productPurchase = productPurchase;
    }

    public Double getProductSale() {
        return this.productSale;
    }

    public void setProductSale(Double productSale) {
        this.productSale = productSale;
    }

    public Integer getProductId() {
        return this.productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductQtd() {
        return this.productQtd;
    }

    public void setProductQtd(Integer productQtd) {
        this.productQtd = productQtd;
    }

    public java.sql.Date getProductDate() {
        return this.productDate;
    }

    public void setProductDate(java.sql.Date productDate) {
        this.productDate = productDate;
    }
   

}