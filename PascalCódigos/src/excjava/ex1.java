package excjava;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String nome;
		int idade, serie;
		
		System.out.println("Insira seu nome: ");
			nome= input.nextLine();
		System.out.println("Insira sua serie: ");
			serie= input.nextInt();
		System.out.println("Insira sua idade: ");
			idade= input.nextInt();
	
	System.out.println("Seu nome é " + nome);
	System.out.println("Sua idade é " + idade);
	System.out.println("Sua serie é " + serie);

	}

}