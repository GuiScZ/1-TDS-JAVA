package excjava;

import java.util.Scanner;

public class MenuPotenciaRaiz {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int op;
		Double x;
		
		System.out.println("Informe qual potencia ou raiz você quer fazer: \n1: Quadrado\n2: Cubo\n3: Raiz quadrada\n4: Raiz cubica");
		op= input.nextInt();
		
	switch (op) {
	
	case 1:
	
		System.out.println("Informe um valor:");
		x= input.nextDouble();
		
		x= Math.pow(x, 2);
		
		System.out.printf("seu valor ao quadrado é " + "%.1f", x);
		
	break;
	
	case 2:
		
		System.out.println("Informe um valor:");
		x= input.nextDouble();
		
		x= Math.pow(x, 3);
		
		System.out.printf("seu valor ao cubo é " + "%.1f", x);
		
	break;
	
	case 3:
		
		System.out.println("Informe um valor:");
		x= input.nextDouble();
		
		x= Math.sqrt(x);
		
		System.out.printf("A raiz quadrada do seu valor é " + "%.1f", x);
		
	break;
	
	case 4:
		
		System.out.println("Informe um valor:");
		x= input.nextDouble();
		
		x= Math.cbrt(x);
		
		System.out.printf("A raiz cubica do seu valor é " + "%.1f", x);

	}

}
}