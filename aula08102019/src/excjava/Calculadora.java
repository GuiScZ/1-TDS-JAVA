package excjava;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a, b, op;
		double c, d;
		
		System.out.println("Insira o operador que você deseja: \n1: +\n2: -\n3: X\n4: /");	
		op= input.nextInt();
			
	if(op == 4) {
	
		System.out.println("Insira o primeiro valor:");
		  c= input.nextDouble();
		System.out.println("Insira o segundo valor:");
		  d= input.nextDouble();
	
		System.out.println("Total: " + c / d);

	}if(op == 1) {
	
		System.out.println("Insira o primeiro valor:");
		  a= input.nextInt();
		System.out.println("Insira o segundo valor:");
		  b= input.nextInt();
	
		System.out.println("Total: " + (a + b));
	
	}if(op == 2) {
	
		System.out.println("Insira o primeiro valor:");
		  a= input.nextInt();
		System.out.println("Insira o segundo valor:");
		  b= input.nextInt();
	
		System.out.println("Total: " + (a - b));
	
	}if(op == 3) {
	
		System.out.println("Insira o primeiro valor:");
		  a= input.nextInt();
		System.out.println("Insira o segundo valor:");
		  b= input.nextInt();
	
		System.out.println("Total: " + a * b);
	}

	}

}