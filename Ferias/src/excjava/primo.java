package excjava;

import java.util.Scanner;

public class primo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a;
		
		System.out.println("Informe o valor:");
		a= input.nextInt();
		
	if (a/1 == a && a/a == 1) {
		
		System.out.println("Ele n�o � um n�mero primo");
	
	}else {
		
		System.out.println("Ele � um n�mero primo");
	}

	}

}