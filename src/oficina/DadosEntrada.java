package oficina;

// digita import (com espaco no final)
// escreve "Scanner" (com S maiusculo mesmo)
// depois ctrl + espaco
// dessa maneira, sua IDE vai autocompletar
import java.util.Scanner;

public class DadosEntrada {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		
		// cria o objeto do tipo Scanner
		// com entrada padrao System.in
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com seu nome: ");
		// aguarda o usuario entrar com um TEXTO e salva em 'nome'
		nome = scan.nextLine();
		
		System.out.println("Entre com sua idade: ");
		// aguarda o usuario entrar com um INTEIRO e salva em 'idade'
		idade = scan.nextInt();
		
		System.out.println("Nome do usuario: " + nome);
		System.out.println("Idade do usuario: " + idade);
	}

}