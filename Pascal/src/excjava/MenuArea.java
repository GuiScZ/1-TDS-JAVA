package excjava;

import java.util.Scanner;

public class MenuArea {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
			int op;
			
			Double raio, diametro, x, area;
			final Double pi= 3.14;
			
			Double comprimento, largura, altura, casa;
			
			Double base, triangulo;
		
		System.out.println("Informe qual area voc� quer descobrir: \n1: Circufer�ncia\n2: Casa\n3: Circulo\n4: Tri�ngulo");
			op= input.nextInt();
			
	switch (op) {
	case 1:
		
		System.out.println("Informe o diam�tro da circufer�ncia: ");
			diametro= input.nextDouble();
			
		raio= diametro/2;
		x= Math.pow(raio, 2);
		area= pi * x;
		
		System.out.printf("Area da circufer�ncia: " + "%.2f", area);
	break;
		
	case 2:
		
		System.out.println("Informe o comprimento da casa: ");
			comprimento= input.nextDouble();
		System.out.println("Informe a largura da casa: ");
			largura= input.nextDouble();
		System.out.println("Informe a altura da casa: ");
			altura= input.nextDouble();
			
		casa= comprimento * largura * altura;
		
		System.out.printf("Area da casa: " + "%.2f", casa);
		
	break;
	
	case 3:
		
		System.out.println("Informe o di�metro do circulo:");
		diametro= input.nextDouble();
		
		raio= diametro/2;
	
		area= pi * raio * raio;
		comprimento= 2 * pi * raio;
	
		System.out.printf("Sua area �: " + "%.2f", area);
		System.out.printf("\nSeu comprimento �: " + "%.2f", comprimento);
		
	break;
	
	case 4:
		
		System.out.println("Informe a base do tri�ngulo:");
			base= input.nextDouble();
		System.out.println("Informe a altura do tri�ngulo:");
			altura= input.nextDouble();
			
		triangulo= base * altura;
		
		System.out.printf("O tamanho do tri�ngulo �: " + "%.2f", triangulo);
	
	}
		
		
		
		
	}

}