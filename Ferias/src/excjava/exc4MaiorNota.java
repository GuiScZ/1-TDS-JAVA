package excjava;

import java.util.Scanner;

public class exc4MaiorNota {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int nota1, nota2, nota3;
		
		System.out.println("Informe sua 1° nota");
			nota1= input.nextInt();
		System.out.println("Informe sua 2° nota");
			nota2= input.nextInt();
		System.out.println("Informe sua 3° nota");
			nota3= input.nextInt();
			
	if (nota1 > nota2 && nota1 > nota3) {
		
		System.out.println("A primeira nota é a maior");
		
	}if (nota2 > nota1 && nota2 > nota3) {
		
		System.out.println("A segunda nota é a maior");
		
	}if (nota3 > nota1 && nota3 > nota2) {
		
		System.out.println("A terceira nota é a maior");
	}

	}

}
