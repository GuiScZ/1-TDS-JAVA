package excjava;

import java.util.Scanner;

public class valoresAB {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		double x, y;
		double soma, produto, quadrado, quadrado2, raiz, sen, modulo;
		int a, b;

		System.out.println("Informe um número");
		  x = num.nextDouble();
		System.out.println("Informe outro número");
		  y = num.nextDouble();
				
				

		  soma = x+y;
		  quadrado2 = Math.pow(y, 2);
		  produto = quadrado2 * x;
		  quadrado = Math.pow(x, 2);
		  raiz = Math.sqrt(quadrado + quadrado2);
		  sen = Math.sin(x-y);
		  modulo = Math.abs(x);
				
		System.out.println(soma);
		System.out.println(produto);
		System.out.println(quadrado);
		System.out.println(raiz);
		System.out.println(sen);
		System.out.println(modulo);
				
}
}