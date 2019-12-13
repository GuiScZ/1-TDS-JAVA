package excjava;

import java.util.Scanner;

public class equação2grau {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double delta, x1, x2, a, b, c;
		
		System.out.println("Informe o valor a:");
		a= input.nextDouble();
		System.out.println("Informe o valor b:");
		b= input.nextDouble();
		System.out.println("Informe o valor c:");
		c= input.nextDouble();
		
		delta = (Math.pow(b, 2)) - (4 * a * c);
		
	if(delta >= 0 ) {
		
		x1= -(b) + (Math.sqrt(delta))/2 * a;
		x2= -(b) - (Math.sqrt(delta))/2 * a;
		
		System.out.println("Delta: " + delta);
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
	
	}else {
		
		System.out.println("Erro");
	}

}
}