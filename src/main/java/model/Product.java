package model;

public class Product {
	private int productId;
	private String productName;
	private String productColor;
	private double productPrice;
	private int productQuantity;
//	private String productCategory;
//	private String productDescription;
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

	public String getProductColor() {
		return productColor;
	}

	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

//	public String getProductCategory() {
//		return productCategory;
//	}
//	public void setProductCategory(String productCategory) {
//		this.productCategory = productCategory;
//	}
//	public String getProductDescription() {
//		return productDescription;
//	}
//	public void setProductDescription(String productDescription) {
//		this.productDescription = productDescription;
//	}
	public Product(int productId, String productName, String productColor, double productPrice, int productQuantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productColor = productColor;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
//		this.productCategory = productCategory;
//		this.productDescription = productDescription;
	}

	public Product() {
		super();
	}

}
