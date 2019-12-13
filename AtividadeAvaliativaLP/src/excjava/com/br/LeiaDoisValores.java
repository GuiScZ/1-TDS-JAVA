package excjava.com.br;

import java.util.Scanner;

public class LeiaDoisValores {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Insira o primeiro número:");
			a= input.nextInt();
		System.out.println("Insira o segundo número:");
			b= input.nextInt();
		
	if (a >= 100 && a<=200) {
		
		System.out.println("O primeiro número está");
		
	}else {
		
		System.out.println("O primeiro número não está");
		
	if (b >= 100 && b <= 200) {
		
		System.out.println("O segundo número está");
		
	}else {
		
		System.out.println("O segundo número não está");
	}
	}

	}

}