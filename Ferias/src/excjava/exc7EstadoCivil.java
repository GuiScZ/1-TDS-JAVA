package excjava;

import java.util.Scanner;

public class exc7EstadoCivil {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int estado;
		
		System.out.println("1 - Solteiro(a)\n2 - Desquitado(a)\n3 - Casado(a)\n4 - Divorciado(a)\n5 - Vi�vo(a)");
		estado= input.nextInt();
		
	switch (estado) {
	case 1:
		
		System.out.println("Voc� � solteiro(a)");
		break;
		
	case 2:
		
		System.out.println("Voc� � desquitado(a)");
		break;
		
	case 3:
		
		System.out.println("Voc� � casado(a)");
		break;
		
	case 4:
		
		System.out.println("Voc� � divorciado(a)");
		break;
		
	case 5:
		
		System.out.println("Voc� � vi�vo(a)");
		break;
		
	}

	}

}