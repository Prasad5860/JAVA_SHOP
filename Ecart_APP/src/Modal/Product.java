package Modal;

public class Product {
	private int productId;
	private String productName;
	private double productPrice;
	private String productCategory;
	private String HSNCode;
	private String productImageId;

	public void setHSNCode(String HSNCode) {
		this.HSNCode = HSNCode;
	}

	public String getHSNCode() {
		return HSNCode;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductImageId() {
		return productImageId;
	}

	public void setProductImageId(String productImageId) {
		this.productImageId = productImageId;
	}
}
