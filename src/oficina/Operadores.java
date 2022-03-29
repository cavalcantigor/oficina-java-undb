package oficina;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		String nome;
		int idade;

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com seu nome: ");
		nome = teclado.nextLine();
		
		System.out.println("Entre com sua idade: ");
		idade = teclado.nextInt();
		
		int idadeFutura = idade + 8;
		
		System.out.println("Sua idade em 2030 será: " + idadeFutura);
		
		
		
		
		
		
		int idadeCaique = 18;
		int futuro = 10;
		
		idadeCaique = idadeCaique + 5;
		// idadeCaique == 23
		
		idadeCaique += futuro;
		
		
		
		
		
		
		
		
	}

}
