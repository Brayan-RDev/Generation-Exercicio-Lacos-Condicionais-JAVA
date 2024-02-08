package exerciciosLacosCondicionais;

import java.util.Scanner;

public class exercicio1L2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escolha o item e digite o número do item: \n  "
						+ "| 1 | Cachorro Quente | R$ 10.00| \n  "
						+ "| 2 | X-Salada        | R$ 15.00| \n  "
						+ "| 3 | X-Bacon         | R$ 18.00| \n  "
						+ "| 4 | Bauru           | R$ 12.00| \n  "
						+ "| 5 | Refrigerante    | R$ 8.00 | \n  "
						+ "| 6 | Suco de laranja | R$ 13.00|  ");
		
		int numeroItem = scan.nextInt();
		
		System.out.println("Escolha a quantidade");
		float numeroValor = scan.nextInt();
		
		String[] item = {"", "Cachorro Quente", "X-Salada", "X-Bacon", "Bauru", "Refrigerante", "Suco de laranja"};
		int[] valor = {0, 10, 15, 18, 12, 8, 13 };
		
		switch(numeroItem) {
		
			case 1:
			System.out.println("Produto: " + item[numeroItem] + "Valor : R$ " + valor[numeroItem] * numeroValor);
			break;
			
			case 2:
			System.out.println("Produto: " + item[numeroItem] + "Valor : R$ " + valor[numeroItem] * numeroValor);
			break;
			
			case 3:
			System.out.println("Produto: " + item[numeroItem] + "Valor : R$ " + valor[numeroItem] * numeroValor);
			break;
			
			case 4:
			System.out.println("Produto: " + item[numeroItem] + "Valor : R$ " + valor[numeroItem] * numeroValor);
			break;
			
			case 5:
			System.out.println("Produto: " + item[numeroItem] + "Valor : R$ " + valor[numeroItem] * numeroValor);
			break;
			
			case 6:
			System.out.println("Produto: " + item[numeroItem] + "Valor : R$ " + valor[numeroItem] * numeroValor);
			break;
			
			default:
			System.out.println("Produto Inválido ");
			break;

		}

	}

}
