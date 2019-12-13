package excjava;

import java.util.Scanner;

public class primo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a;
		
		System.out.println("Informe o valor:");
		a= input.nextInt();
		
	if (a/1 == a && a/a == 1) {
		
		System.out.println("Ele não é um número primo");
	
	}else {
		
		System.out.println("Ele é um número primo");
	}

	}

}