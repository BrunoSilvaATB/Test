package course;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		// Primitive types in Java
		
		boolean completed = false;
		char gender = 'F';
		char letter = '\u0041';
		byte n1 = 126;
		int n2 = 1000;
		int n3 = 2147483647;
		long n4 = 2147483648L;
		float n5 = 4.5f;
		double n6 = 4.5;
		double balance = 10.3532132;
		
		System.out.println(completed);
		System.out.println(gender);
		System.out.println(letter);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(n6);
		
		// Strings and objects
		String name = "Maria Green";
		Object obj1 = "Alex Brown";
		Object obj2 = 4.5f;
		
		System.out.println(name);
		System.out.println(obj1);
		System.out.println(obj2);
		
		// Casting (Changing variable types)
		
		double a;
		float b;
		
		a = 5.0;
		b = (float)a;
		
		System.out.println(b);
		
		// Arithmetic operators
		
		// % is the division rest
		// +=, -=, *=, /=, %=  are variable attributions with string name += also works, also exist ++ and -- to increment or decrement
		
		// Logical operators
		
		// && and, || or, ! not and && has always priority
		// Bitwise operators, & and, | or, ^ xor
		
		// Program test
		Scanner sc = new Scanner(System.in);
		
		// Data or variable introduction
		
		
		int teste1 = sc.nextInt();
		sc.nextLine();
		String sentence = sc.nextLine();
		char gender2 = sc.next().charAt(0);
		
		System.out.println(sentence);
		
		String s = sc.next();
		char letter1 = s.charAt(0);
		int digit = Integer.parseInt(s.substring(1));
		double n22 = sc.nextDouble();
		
		// condicional ternaria 
		// condition ? valor se verdadeiro : valor se falso
		
		System.out.println("Hello World!");
		System.out.print("Hello World without new line!");
		System.out.println("Good Night!");
		System.out.printf("%.2f%n", balance);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", balance);
		System.out.printf("%.2f is the balance of %s", balance, name);
		
		sc.close();

	}

}
