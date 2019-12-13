package excjava;

import java.util.Scanner;

public class ex001 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int idade;
		
		System.out.println("cadastre a sua idade");
			idade= input.nextInt();
			
	if (idade >= 18) {
		
		System.out.println("o usuario tem mais de 18 anos");
		
	}else {
		
		System.out.println("o usuario tem menos de 18 anos");
	}

	}

}
