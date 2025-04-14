package aula_2;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		double numero01 = leia.nextDouble();
		System.out.println("Digite o segundo valor: ");
		double numero02 = leia.nextDouble();
		
		System.out.printf("%.2f + %.2f = %.2f\n", numero01,numero02,(numero01+numero02));
		System.out.printf("%.2f - %.2f = %.2f\n", numero01,numero02,(numero01-numero02));		
		System.out.printf("%.2f / %.2f = %.2f\n", numero01,numero02,(numero01/numero02));
		System.out.printf("%.2f * %.2f = %.2f\n", numero01,numero02,(numero01*numero02));
		System.out.printf("%.2f R %.2f = %.2f\n", numero01,numero02,Math.sqrt((numero01+numero02)));

	}

}
