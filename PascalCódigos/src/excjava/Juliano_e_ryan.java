package excjava;

import java.util.Scanner;

public class Juliano_e_ryan {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numeroVendedor;
		double SalarioFixo,SalarioFinal, ValorComissao, TotalVendas;
		
		System.out.println("Informe o número do vendedor:");
			numeroVendedor= input.nextInt();
		System.out.println("Informe o salario fixo:");
			SalarioFixo= input.nextDouble();
		System.out.println("Informe o valor total de vendas");
			TotalVendas= input.nextDouble();
			
	if (TotalVendas <= 1000) {
		
		ValorComissao= (TotalVendas * 3)/100;
		
		SalarioFinal= SalarioFixo + ValorComissao;
		
		System.out.println("O total de ganho em comissoes do vendedor " + numeroVendedor + " é de " + ValorComissao);
		System.out.println("O salario final do vendedor " + numeroVendedor + " é de " + SalarioFinal);
		
	}else {
		
		//3% sobre 1000                   //porte que excede os R$ 1000 é 6%
		ValorComissao= ((1000 * 3 )/ 100) + ((TotalVendas - 1000) * 20 / 1000);
		
		SalarioFinal= SalarioFixo + ValorComissao;
		
		System.out.println("O total de ganho em comissoes do vendedor " + numeroVendedor + " é de " + ValorComissao);
		System.out.println("O salario final do vendedor " + numeroVendedor + " é de " + SalarioFinal);
		
	}
	
	}

}