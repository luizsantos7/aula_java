package aula_2;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("digite um numero inteiro:");
		int number1 = leia.nextInt();
		System.out.println("digite o segundo numero inteiro:");
		int number2 = leia.nextInt();
		
		
		final double pi = 3.1415;
		boolean menorIdade = true;
		
		System.out.println("Digite o seu nome:");
		String nome = leia.next();
		
		System.out.println("Variavel numero um: "+ number1);
		System.out.println("Varialve numero dois: "+ number2);
		System.out.println("PI:"+ pi);
		System.out.println("nome em letras maisculas: "+ nome.toUpperCase());
	}

}
