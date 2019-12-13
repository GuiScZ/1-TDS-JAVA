package matematica;

public class Mat {

	public static void main(String[] args) {
		
		double a_fixo, b_fixo, c_fixo1, c_fixo2;
		double total_a, total_b, total_c;
		int tempo_hora_a, tempo_hora_c;
		int tempo_minuto_b, tempo_minuto_c;
		
		a_fixo= 15.00; b_fixo= 0.27; c_fixo1= 15.00; c_fixo2= 0.35;
		tempo_hora_a= 6; tempo_hora_c= 4;
		tempo_minuto_b= 330; tempo_minuto_c= 85;
				
		//adriana
		
		total_a= a_fixo * tempo_hora_a;
		System.out.println("Valor total de Adriana: " + total_a);
		
		//bruna
		
		total_b= b_fixo * tempo_minuto_b;
		System.out.printf("Valor total de Bruna: " + "%.2f", total_b);
		
		//cristina
		
		total_c= (c_fixo1 * tempo_hora_c) + (c_fixo2 * tempo_minuto_c);
		System.out.println("\nValor total de Cristina: " + total_c);
		
		if (total_c > total_a && total_a > total_b) {
			
			System.out.println("A) Cristina recebeu mais do que Adriana, que, por sua vez, recebeu mais do que Bruna");
			
		}if (total_a > total_b && total_b > total_c) {
			
			System.out.println("B) Adriana recebeu mais do que Bruna, que, por sua vez, recebeu mais do que Cristina");
		
		}if (total_a > total_c && total_c > total_b) {
			
			System.out.println("C) Adriana recebeu mais do que Cristina, que, por sua vez, recebeu mais do que Bruna");
		
		}if (total_c > total_b && total_b > total_a) {
		
			System.out.println("D) Cristina recebeu mais do que Bruna, que, por sua vez, recebeu mais do que Adriana");
			
		}if (total_b > total_c && total_c > total_a) {
			
			System.out.println("E) Bruna recebeu mais do que Cristina, que, por sua vez, recebeu mais do que Adriana");
		}

	}

}
