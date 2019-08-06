package course.sessao3;

import java.util.Locale;
import java.util.Scanner;

import course.sessao3.entities.Product;

public class ProgramaProducts {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
	
		System.out.println("Product data: " + product);
		
		System.out.println("Quantity to added to stock: ");
		product.addProducts(sc.nextInt());
		
		System.out.println("Updated data: " + product);
		
		System.out.println("Quantity to removed to stock: ");
		product.removeProducts(sc.nextInt());
		
		System.out.println("Updated data: " + product);
		
		sc.close();
	}
}
