package excjava.com.br;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Insira o primeiro valor:");
			a= input.nextInt();
		System.out.println("Insira o segundo valor:");
			b= input.nextInt();
		
	if (a > b) {
		
		System.out.println("O primeiro valor é o maior");
		
	}else {
		
		System.out.println("O segundo valor é o maior");
	}

	}

}
