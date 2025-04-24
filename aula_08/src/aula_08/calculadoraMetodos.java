package aula_08;

import java.util.Scanner;

public class calculadoraMetodos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcao=0;
		
		while(true) {
			
			System.out.println("Digite o primeiro numero: ");
			double num1 = leia.nextDouble();
		
			System.out.println("Digite o segundo numero: ");
			double num2 = leia.nextDouble();
			
			System.out.println("********************************************");
			System.out.println("1 - Somar");
			System.out.println("2 - Subtrair");
			System.out.println("3 - Multiplicar");
			System.out.println("4 - Dividir");
			System.out.println("0 - Sair");
			System.out.println("********************************************");
			System.out.println("Qual operção matemática você deseja executar?");
			opcao = leia.nextInt();
			
			if(opcao == 0) {
				sobre();
				System.exit(0);
			}
			
			switch(opcao) {
				case 1 -> System.out.printf("\n%.2f+%.2f = %.2f\n",num1,num2,somar(num1,num2));
				case 2 -> System.out.printf("\n%.2f+%.2f = %.2f\n",num1,num2,subtrair(num1,num2));
				case 3 -> System.out.printf("\n%.2f+%.2f = %.2f\n",num1,num2,multiplicar(num1,num2));
				case 4 -> System.out.printf("\n%.2f+%.2f = %.2f\n",num1,num2,dividir(num1,num2));
				default -> System.out.println("opção invalida");
			}
		}
	}

	static double somar(double num1, double num2){
		return num1+num2;
	}
	
	static double dividir(double num1, double num2){
		return num1/num2;
	}
	
	static double subtrair(double num1, double num2){
		return num1-num2;
	}
	
	static double multiplicar(double num1, double num2){
		return num1*num2;
	}
	
	static void sobre() {
		System.out.println("Calculadora com métodos");
		System.out.println("Feito por: Luiz.H");
	}
	
	
}
