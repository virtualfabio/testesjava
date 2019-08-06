package course.sessao15;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

import course.sessao3.entities.Product;

public class UmaExperienciaComComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> list = new ArrayList<>();

		Product p1 = new Product("tv", 890, 1);
		Product p2 = new Product("radio", 750, 1);
		Product p3 = new Product("geladeira", 1900, 2);

		list.add(p1);
		list.add(p2);
		list.add(p3);

		for (Product product : list) {
			System.out.println(product);
		}

		System.out.println("------------");

		list.sort((prod1, prod2) -> prod1.getName().toUpperCase().compareTo(prod2.getName().toUpperCase()));

		for (Product product : list) {
			System.out.println(product);
		}

		System.out.println("------------");

		list.sort((prod1, prod2) -> new Double(prod1.getPrice()).compareTo(prod2.getPrice()));

		for (Product product : list) {
			System.out.println(product);
		}
		
		
	}

}
