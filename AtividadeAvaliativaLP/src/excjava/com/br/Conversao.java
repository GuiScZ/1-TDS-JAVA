package excjava.com.br;

import java.util.Scanner;

public class Conversao {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Double cotacao, dolar, conversao;
		
		cotacao= input.nextDouble();
		dolar= input.nextDouble();
		
		conversao= cotacao * dolar;
		
		System.out.printf("Total em reais: " + "%.2f", conversao);

	}

}
