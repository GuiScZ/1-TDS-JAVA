package excjava.com.br;

import java.util.Scanner;

public class LeiaDoisValores {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Insira o primeiro n�mero:");
			a= input.nextInt();
		System.out.println("Insira o segundo n�mero:");
			b= input.nextInt();
		
	if (a >= 100 && a<=200) {
		
		System.out.println("O primeiro n�mero est�");
		
	}else {
		
		System.out.println("O primeiro n�mero n�o est�");
		
	if (b >= 100 && b <= 200) {
		
		System.out.println("O segundo n�mero est�");
		
	}else {
		
		System.out.println("O segundo n�mero n�o est�");
	}
	}

	}

}