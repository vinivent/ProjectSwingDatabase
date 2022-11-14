package Model.Entity;

public class Product {

  
	private String productName, productCategory, productPurchase, productSale, productId, productQtd;
    java.sql.Date productDate;

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

    public String getProductPurchase() {
        return productPurchase;
    }

    public void setProductPurchase(String productPurchase) {
        this.productPurchase = productPurchase;
    }

    public String getProductSale() {
        return productSale;
    }

    public void setProductSale(String productSale) {
        this.productSale = productSale;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductQtd() {
        return productQtd;
    }

    public void setProductQtd(String productQtd) {
        this.productQtd = productQtd;
    }

    public java.sql.Date getProductDate() {
        return productDate;
    }

    public void setProductDate(java.sql.Date productDate) {
        this.productDate = productDate;
    }

}