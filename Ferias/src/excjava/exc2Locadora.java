package excjava;

import java.util.Scanner;

public class exc2Locadora {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int videos, videos_ano, videos_final;
		double locacao, valor_mes, valor_ano, valor_locacao;
		
		System.out.println("Informe quantos videos a locadora possui:");
			videos= input.nextInt();
		System.out.println("Informe o valor que ela cobra por cada locação:");
			locacao= input.nextDouble();
			
		valor_locacao= videos * locacao;
		
		System.out.println("Valo cobrado por locação: " + valor_locacao);
		
	}

	}