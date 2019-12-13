package excjava;

import java.util.Scanner;

public class exc6Media {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int nota1, nota2, nota3, media;
		String aluno;
		
		System.out.println("Insira seu nome:");
			aluno= input.nextLine();
		System.out.println("Informe sua 1° nota");
			nota1= input.nextInt();
		System.out.println("Informe sua 2° nota");
			nota2= input.nextInt();
		System.out.println("Informe sua 3° nota");
			nota3= input.nextInt();
		
		media= (nota1 + nota2 + nota3) / 3;
		
	if (media > 6) {
		
		System.out.println("O aluno " +aluno+ " foi aprovado");
		
	}if (media < 4) {
		
		System.out.println("O aluno " +aluno+ " foi reprovado");
		
	}if (media >= 5 && media < 6) {
		
		System.out.println("O aluno " +aluno+ " irá fazer recuperação");
	}

	}

}