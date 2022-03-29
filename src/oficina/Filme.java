package oficina;

import java.util.Scanner;

public class Filme {

	public static void main(String[] args) {
		
		String nome; // nome do telespectador
		String filme; // filme que vai assistir
		int sessao;
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Seu nome: ");
		nome = teclado.nextLine();
		
		System.out.println("Filme: ");
		filme = teclado.nextLine();
		
		System.out.println("Sessao: ");
		sessao = teclado.nextInt();
		
		
		System.out.println(
			nome + 
			" vai assistir ao filme " + 
			filme + 
			" na sessão das " + 
			sessao + 
			" horas."
		);
	}
	
	
	
	

}
