package excjava;

import java.util.Scanner;

public class metro {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double metro, decimetro, centimetro, milimetro;
				
			System.out.println("Informe o tamanho em metros: ");
			  metro= input.nextDouble();
				
			  	decimetro= metro * 10;
			  	centimetro= metro * 100;
			  	milimetro= metro * 1000;
				
			  	System.out.printf("Metro -> Decímetro: " + "%.2f", decimetro);
			  	System.out.printf("\nMetro -> Centímetro: " + "%.2f", centimetro);
			  	System.out.printf("\nMetro -> Milímetro: " + "%.2f", milimetro);

	}

}
