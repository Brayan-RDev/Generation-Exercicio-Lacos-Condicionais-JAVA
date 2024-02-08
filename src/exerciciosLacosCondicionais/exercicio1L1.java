package exerciciosLacosCondicionais;

import java.util.Scanner;

public class exercicio1L1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float A, B, C, compara ;
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor de A: ");
		A = scan.nextFloat();
			
		System.out.println("Digite o valor de B: ");
		B = scan.nextFloat();
			
		System.out.println("Digite o valor de C: ");
		C = scan.nextFloat();
		
		compara = A + B;	
		
		if(compara > C)  
		System.out.println("A Soma de A + B é Maior do que C");
		
		else if(compara < C)
		System.out.println("A Soma de A + B é Menor do que C");
		
		else if(compara == C)
		System.out.println("A Soma de A + B é Igual a C");	
		
	}

}
