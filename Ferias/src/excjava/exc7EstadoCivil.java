package excjava;

import java.util.Scanner;

public class exc7EstadoCivil {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int estado;
		
		System.out.println("1 - Solteiro(a)\n2 - Desquitado(a)\n3 - Casado(a)\n4 - Divorciado(a)\n5 - Viúvo(a)");
		estado= input.nextInt();
		
	switch (estado) {
	case 1:
		
		System.out.println("Você é solteiro(a)");
		break;
		
	case 2:
		
		System.out.println("Você é desquitado(a)");
		break;
		
	case 3:
		
		System.out.println("Você é casado(a)");
		break;
		
	case 4:
		
		System.out.println("Você é divorciado(a)");
		break;
		
	case 5:
		
		System.out.println("Você é viúvo(a)");
		break;
		
	}

	}

}