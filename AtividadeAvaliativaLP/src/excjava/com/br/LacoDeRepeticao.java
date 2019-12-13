package excjava.com.br;

import java.util.Scanner;

public class LacoDeRepeticao {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a, b;
		
		a= 1;
		
		b= input.nextInt();
		
		while (a <= b) {
			
			System.out.println(a);
			++a;
		}

	}

}
