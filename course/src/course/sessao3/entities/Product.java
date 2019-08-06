package course.sessao3.entities;

public class Product {
	private String name;
	private double price;
	private int quantity;

	public Product() {
		
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double totalValueInStock() {
		return (double) this.quantity * this.price;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public void showDetails() {
		System.out.print("data: " + this.name);
		System.out.printf(", $ %.2f", this.price);
		System.out.printf(", %d units", this.quantity);
		System.out.printf(", Total $ %.2f%n", this.totalValueInStock());
	}

	public String toString() {
		return this.name + ", $ " + String.format("%.2f", this.price) + ", " + this.quantity + " units " + ", Total $ "
				+ String.format("%.2f", this.totalValueInStock());
	}
}
