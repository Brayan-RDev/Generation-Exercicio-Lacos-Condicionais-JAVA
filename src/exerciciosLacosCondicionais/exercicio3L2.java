package exerciciosLacosCondicionais;

import java.util.Scanner;

public class exercicio3L2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] numero =  new float[2] ;
		int operador;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escolha o primeiro valor");
		numero[0] = scan.nextInt();
		
		System.out.println("Escolha o segundo valor");
		numero[1] = scan.nextInt();
		
		System.out.println("Escolha a operação: \n |1|Soma         | \n "
												+ "|2|Subtração    | \n "
												+ "|3|Multiplicação| \n "
												+ "|4|Divisão      |"					);
		operador = scan.nextInt();
		
		switch(operador) {
		
		case 1:
		System.out.println("O rsultado da operação é: " + (numero[0] + numero[1]));
		break;
		
		case 2:
		System.out.println("O rsultado da operação é: " + (numero[0] - numero[1]));
		break;
		
		case 3:
		System.out.println("O rsultado da operação é: " + (numero[0] * numero[1]));
		break;
		
		case 4:
		System.out.println("O rsultado da operação é: " + (numero[0] / numero[1]));
		break;
		
		default:
		System.out.println("Operação Inválida");
		break;

		}		
	}
}
