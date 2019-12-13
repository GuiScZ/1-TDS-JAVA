package excjava;

import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a= 1, x, y, z;
		
		while (a >= 3) {
			
			System.out.println("Informe um valor");
			x= input.nextInt();
			y= input.nextInt();
			z= input.nextInt();
			++a;
		}

	}

}
