package excjava;

import java.util.Scanner;

public class IsoscelesEscalenoEquilatero {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Insira o valor do lado a:");
			a= input.nextInt();
		System.out.println("Insira o valor do lado b:");
			b= input.nextInt();
		System.out.println("Insira o valor do lado c:");
			c= input.nextInt();
			
	if (a == b && b == c) {
		
		System.out.println("O triangulo é equilátero");
		
	}if (a == b && b != c) {
		
		System.out.println("O triangulo é isósceles");
		
	}if (a != b && b == c) {
		
		System.out.println("O triangulo é isósceles");
		
	}if (a == b && b != c) {
		
		System.out.println("O triangulo é isósceles");
		
	}if (a != b && b != c) {
		
		System.out.println("O triangulo é escaleno");
		
	}

	}

}