package excjava;

import java.util.Scanner;

public class fg {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String nome;
		int idade;
		
		System.out.println("Informe seu nome:");
			nome= input.nextLine();
		System.out.println("Informe sua idade:");
			idade= input.nextInt();
			
	if (idade >= 18) {
		
		System.out.println(nome + " � maior de idade");
		
	}else {
		
		System.out.println(nome + " � menor de idade");
	}

	}

}
