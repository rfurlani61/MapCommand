package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		 Map<String, String> cookies = new TreeMap<>();
		 cookies.put("username","Maria");
		 cookies.put("email","maria@gmail.com");
		 cookies.put("phone","99711122");
		 
		 cookies.remove("email");
		 cookies.put("phone","99711133");  // Como Map não admite repetições de chave, a entrada anterior de phone vai ser sobrescrita.
		 
		 System.out.println("Contem a chave phone? " + cookies.containsKey("phone"));
		 System.out.println("Phone number: " + cookies.get("phone"));
		 System.out.println("Email: " + cookies.get("email")); // Quando a chave não existe get() retorna "null"
		 System.out.println("Size: " + cookies.size());
		 
		 
		 
		 System.out.println("ALL COOKIES");
		 
		 for (String key : cookies.keySet()) {
			 System.out.println(key + ": " + cookies.get(key));
		 }
		 

	}

}
