package excjava;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String msg1, msg2;
		
		System.out.println("Insira a primeira mensagem:");
			msg1= input.nextLine();
		System.out.println("Insira a segunda mensagem:");
			msg2= input.nextLine();
			
		System.out.println(msg1 + msg2);

	}

}