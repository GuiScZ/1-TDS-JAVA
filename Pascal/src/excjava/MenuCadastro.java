package excjava;

import java.util.Scanner;

public class MenuCadastro {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
			int op;
		
			String nome, cidade, estado, endereco;
			char sexo;
			int idade, telefone;
			Double peso, altura, idade_quadrado, altura_cubo, idade_cubo;

			int serie;
					
			int quantidade_professor, quantidade_sala;
			
		System.out.println("Informe qual cadastro você quer fazer: \n1: Pessoal\n2: Aluno\n3: Escola");
			op= input.nextInt();
			
	switch (op) {
	case 1:
		
		System.out.println("Informe seu nome: ");
			nome= input.nextLine();
		System.out.println("Informe seu estado (Exemplo: 'PE'): ");
			estado= input.nextLine();
		System.out.println("Informe sua cidade: ");
			cidade= input.nextLine();
		System.out.println("Informe seu endereço: ");
			endereco= input.nextLine();
		System.out.println("Informe seu sexo [M/F]: ");
			sexo= input.next().charAt(0);
		System.out.println("Informe seu telefone: ");
			telefone= input.nextInt();
		System.out.println("Informe sua idade: ");
			idade= input.nextInt();
		System.out.println("Informe seu peso: ");
			peso= input.nextDouble();
		System.out.println("Informe sua altura: ");
			altura= input.nextDouble();
			
	if (estado.length()>2) {
				String cutName = estado.substring(0, 2);
				estado = cutName;   
	}
			
		idade_quadrado= Math.pow(idade, 2);
		idade_cubo= Math.pow(idade, 3);
		altura_cubo= Math.pow(altura, 3);
		
		System.out.println("Seu nome: " + nome);
		System.out.println("Sua cidade: " + cidade);
		System.out.println("Seu estado: " + estado);
		System.out.println("Seu endereço: " + endereco);
		System.out.println("Seu sexo: " + sexo);
		System.out.println("Seu telefone: " + telefone);
		System.out.println("Sua idade: " + idade);
		System.out.printf("Seu peso: " + "%.2f", peso);
		System.out.printf("\nSua altura" + "%.2f", altura);
		System.out.println("\nSua idade ao quadrado: " + idade_quadrado);
		System.out.println("Sua idade ao cubo: " + idade_cubo);
		System.out.printf("Sua altura ao cubo: " + "%.2f", altura_cubo);
		
			
	break;
	
	case 2:
		
		System.out.println("Informe seu nome: ");
			nome= input.nextLine();
		System.out.println("Informe sua serie: ");
			serie= input.nextInt();
		System.out.println("Informe sua idade: ");
			idade= input.nextInt();
		
		System.out.println("Seu nome: " + nome);
		System.out.println("Sua serie: " + serie);
		System.out.println("Sua idade: " + idade);
		
	break;
	
	case 3:
		
	System.out.println("Informe o nome da escola: ");
		nome= input.nextLine();
	System.out.println("Informe a quantidade de professores que a escola possui: ");
		quantidade_professor= input.nextInt();
	System.out.println("Informe a quantidade de salas que a escola possui: ");
		quantidade_sala= input.nextInt();
		
		System.out.println("Nome da escola: " + nome);
		System.out.println("Quantidade de professores: " + quantidade_professor);
		System.out.println("Quantidade de salas: " + quantidade_sala);
		
	break;
		
	}

	}

}