package course.sessao15;

import java.awt.image.FilteredImageSource;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import course.sessao3.entities.Product;

public class ProgramacaoFuncional {

	public static void main(String[] args) {
		
		//--interfaces funcionais---------------------------
		
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
		
		//removendo com interface Predicate.............. (method => test)
		list.removeIf(p -> p.getPrice() > 900.0);
		
		
		for (Product product : list) {
			System.out.println(product);
		}
		
		System.out.println("------------");
		
		//update com interface Consumer.............. (method => accept)
		list.forEach(p -> p.setPrice( p.getPrice() * 1.1) );
		list.forEach(System.out :: println);

		System.out.println("------------");
		
		//gerar nova lista com interface Function.............. (method => apply)
		List<String> listNames = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		listNames.forEach(System.out :: println);
		
		System.out.println("------------");
		
		double sum = filterdSum(list, p -> p.getName().charAt(0) == 'T');
		System.out.println("Sum: " + String.format("%.2f", sum));

	}
	
	
	
	
	public static double filterdSum(List<Product> list, Predicate<Product> criteria) {
		double sum = 0.0;
		for (Product p : list) {
			if(criteria.test(p)) {
				sum += p.getPrice();			
			}

		}
		return sum;
		
	}

}
