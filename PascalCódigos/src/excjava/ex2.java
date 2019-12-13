package excjava;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String nome;
		int quantidade_professor, quantidade_sala;
		
		System.out.println("Informe o nome da escola: ");
			nome= input.nextLine();
		System.out.println("Informe a quantidade de professores que a escola possui: ");
			quantidade_professor= input.nextInt();
		System.out.println("Informe a quantidade de salas que a escola possui: ");
			quantidade_sala= input.nextInt();
		
		System.out.println("Nome da escola: " + nome);
		System.out.println("Quantidade de professores: " + quantidade_professor);
		System.out.println("Quantidade de salas: " + quantidade_sala);

	}

}
