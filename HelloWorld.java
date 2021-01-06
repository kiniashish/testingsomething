package introduction;

import java.util.ArrayList;

public class HelloWorld {


	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList<>();
		ArrayList<String> a2 = new ArrayList<>();
		a1.add("Hi");
		a1.add("Bye");
		a1.add("Tata");
		a2.add("Asish");
		a2.add("Nimisha");
		a2.add("Annapoorna");
		
	
		
		a2.clear();
		
		System.out.println("Simply adding a new line");
		
		System.out.println(a2);
	}
}


