package excjava;

import java.util.Scanner;

public class media {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
			String nome;
			double nota1pt, nota2pt, nota3pt, nota4pt, mediab1pt, mediab2pt, mediaapt;
			double nota1mt, nota2mt, nota3mt, nota4mt, mediab1mt, mediab2mt, mediaamt;
				
			System.out.println("Informe seu nome: ");
			  nome= input.nextLine();
			System.out.println("Informe sua 1� nota de portugu�s: ");
			  nota1pt= input.nextDouble();
			System.out.println("Informe sua 2� nota de portugu�s: ");
			  nota2pt= input.nextDouble();
			System.out.println("Informe sua 3� nota de portugu�s: ");
			  nota3pt= input.nextDouble();
			System.out.println("Informe sua 4� nota de portugu�s: ");
			  nota4pt= input.nextDouble();
			System.out.println("Informe sua 1� nota de matem�tica: ");
			  nota1mt= input.nextDouble();
			System.out.println("Informe sua 2� nota de matem�tica: ");
			  nota2mt= input.nextDouble();
			System.out.println("Informe sua 3� nota de matem�tica: ");
			  nota3mt= input.nextDouble();
			System.out.println("Informe sua 4� nota de matem�tica: ");
			  nota4mt= input.nextDouble();
				  
			  	mediab1pt= (nota1pt + nota2pt)/2;
			  	mediab2pt= (nota3pt + nota4pt)/2;
			  	mediaapt= (mediab1pt + mediab2pt)/2;
				  
			  	mediab1mt= (nota1mt + nota2mt)/2;
			  	mediab2mt= (nota3mt + nota4mt)/2;
			  	mediaamt= (mediab1mt + mediab2mt)/2;
				  
	if (mediaapt >= 6) {
					 
		System.out.println("Media anual em portugu�s: " + mediaapt);
		System.out.println("Aprovado");
					 
	}else {
					 
		System.out.println("Media anual em portugu�s: " + mediaapt);
		System.out.println("Reprovado");
				 
	}if (mediaamt >= 6) {
					 
		System.out.println("Media anual em matem�tica: " + mediaamt);
		System.out.println("Aprovado");
				 
	}else {
					 
		System.out.println("Media anual em matem�tica: " + mediaamt);
		System.out.println("Reprovado");
		
	}
	
}
}