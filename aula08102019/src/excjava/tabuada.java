package excjava;

import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a, b, d, f;
		int numero;
		int tabuada;
		
		a= 0;
		b= 1;
		f= 0;
			
		System.out.println("Informe a tabuada: ");
		  tabuada= input.nextInt();
		System.out.println("Informe um número de 1 a 10: ");
		  numero= input.nextInt();
			
	if (tabuada == 1) {
			
	while(b <= 10) {
		
		d = b * numero;
		f = f + 1;
		System.out.println(numero + " x " + f + " = " + d);
	++b; 
	}

}

}
}