package exerciciosLacosCondicionais;

import java.util.Scanner;

public class exercicio2L1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		A = scan.nextInt();
		
		if(A % 2 == 0 && A > 0) { 
			System.out.println(" O Número "+ A + " é par e positivo!");
		}
	
		else if(A % 2 != 0 && A < 0){
			System.out.println("O Número "+ A + " é impar e negativo!");	
		}

		else if(A % 2 == 0 && A < 0){
			System.out.println("O Número "+ A + " é par e negativo!");
		}
		
		else if(A % 2 != 0 && A > 0){
			System.out.println("O Número "+ A + " é impar e positivo!");
		}
	}
}