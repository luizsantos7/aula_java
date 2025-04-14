package aula_2;

import java.util.Scanner;

public class ex001_salario {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite seu salário:");
		float salario = leia.nextFloat();
		System.out.println("Digite sua bonificação: ");
		float abono = leia.nextFloat();
		float soma;
		
		soma = salario + abono;
		System.out.printf("RESUMO SALARIAL\n\nSalario:%.2f\nBonificação:%.2f\nSalario final: %.2f",salario,abono,soma);
		

	}

}
