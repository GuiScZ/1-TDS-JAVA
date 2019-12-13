package excjava;

public class SomaNumero {

	public static void main(String[] args) {
		
		int a, b, c;
		
		a= 1;
		b= 0;
		c= 1;
		
	while(a <= 100) {
		
		c= b + a;
		b= b + 1;
		
	System.out.println(c);
	++a;
	}

	}

}
