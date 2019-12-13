package excjava;

import java.util.Scanner;
import java.util.ArrayList;

public class impar {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		ArrayList<Object> impar = new ArrayList<Object>();
		
		int a, b, d, i;
	    
		a= 1;
	    i= 1;
	    d= 0;
	  
	  while (a > 0) {
	      
	      System.out.println("Informe o número máximo. Por favor, só números impares");
	        b= input.nextInt();
	        
	            if (b%2>0) {
	      
	                a= 0;
	      
	                while (i <= b) {
	      
	                    System.out.print(i + " ");
	                    impar.add(i);
	                    ++i;
	  
	  }while (d == 0) {
	      
	      impar.remove(0);
	      impar.remove(impar.size()-1);
	      System.out.println(impar.toString());
	      
	        if (impar.size() == 1) {
	      
	        d= 1;
	      
	            }else {
	      
	            d= 0;
	      
	  }
	  
	  }
	  
	  }else {
	      
	      System.out.println("O número, não é impar. Por favor, digite novamente");
	      a= 1;
	 }
	}

	}

}