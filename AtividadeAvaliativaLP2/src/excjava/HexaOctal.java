package excjava;

import java.util.Scanner;

public class HexaOctal {

	public static void main(String[] args) {
		
		Scanner valor= new Scanner(System.in);
		
        int x, y, a;
        a=0;
				
	while(a!=1) {
				
		System.out.println("Informe o valor em decimal");
		  x = valor.nextInt();
		System.out.println("Você deseja conveter esse valor para hexa ou octa \nDigite 1 para hexa, 2 para octa ou 3 para sair");
		  y = valor.nextInt();
				
	if(y == 1) {
					
		System.out.println("Valor em hexa: " + Integer.toHexString(x));
		System.out.println("Deseja voltar ao inicio? \nDigite 1 para sim ou 2 para não");
		  y = valor.nextInt();
					
	if(y==2) {
						
		a++;
	}
				
	} else if(y == 2) {
				
		System.out.println("Valor em octa: " + Integer.toOctalString(x));
		System.out.println("Deseja voltar ao inicio? \nDigite 1 para sim ou 2 para não");
		y = valor.nextInt();
					
	if(y==2) {
						
		a++;
	}
					
	} else if(y == 3) {
					
		System.exit(0);
				
	} else if(y > 3) {
					
		System.out.println("No momento de escolhe para qual deseja converter, escolha apenas um dos numero citados");
				
			    
			

		   }
				
				
		  }
				

	}

}