package sprint4Evaluation._3QuestionNumber3.model;

public class Product {
	
	private int productId;
	private String productName;
	private int price;
	private int quatity;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuatity() {
		return quatity;
	}
	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}
	public Product(int productId, String productName, int price, int quatity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quatity = quatity;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", quatity="
				+ quatity + "]";
	}
	
	
	
	
	
	

}
