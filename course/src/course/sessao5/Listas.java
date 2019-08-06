package course.sessao5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Fabio");
		list.add("Felipe");
		list.add("Sergio");
		list.add("Selma");
		list.add("Maria");
		
		list.add(2, "Cenira");
		
		System.out.println(list.size());
		
		//list.remove(5);
		
		for (String s: list) {
			System.out.println(s);			
		}
		
		System.out.println("------");
		
		list.removeIf(s -> s.charAt(0) == 'M');
		for (String s: list) {
			System.out.println(s);			
		}
		
		System.out.println("------");
		
		System.out.println(list.indexOf("Fabio"));
		System.out.println(list.indexOf("Felipe"));
		System.out.println(list.indexOf("xxxx"));
		
		System.out.println("------");
		
		List<String> list2 = list.stream().filter(s -> s.charAt(0) == 'F').collect(Collectors.toList());
		for (String s: list2) {
			System.out.println(s);			
		}
		
		System.out.println("------");
		String nome = list.stream().filter(s -> s.charAt(0) == 'F').findFirst().orElse(null);
		System.out.println(nome);
		
	}
}
