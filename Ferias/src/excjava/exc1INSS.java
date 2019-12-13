package excjava;

import java.util.Scanner;

public class exc1INSS {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double salario_hora, salario_total;
		int horas_dia, horas_mes;
		
		System.out.println("Informe o seu salario por hora:");
			salario_hora= input.nextDouble();
		System.out.println("Informe quantas horas você trabalha no dia:");
			horas_dia= input.nextInt();
			
		horas_mes= horas_dia * 26;
		
	if (salario_hora <= 1751.81) {
		
		salario_total= ((salario_hora * horas_mes) * 8) / 100;
		
		System.out.printf("Seu salario total é: " + "%.2f", salario_total);
		System.out.println("\nHoras trabalhadas por mês: " + horas_mes);
		
	}if (salario_hora >= 1751.82 && salario_hora <= 2919.72) {
		
		salario_total= ((salario_hora * horas_mes) * 9) / 100;
		
		System.out.printf("Seu salario total é: " + "%.2f", salario_total);
		System.out.println("\nHoras trabalhadas por mês: " + horas_mes);
		
	}if(salario_hora >= 2919.73 && salario_hora <= 5839.45) {
		
		salario_total= ((salario_hora * horas_mes) * 11) / 100;
		
		System.out.printf("Seu salario total é: " + "%.2f", salario_total);
		System.out.println("\nHoras trabalhadas por mês: " + horas_mes);
		
	}

	}

}