package aula_03;

import java.util.Scanner;

public class ex002_if {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero inteiro:");
		int num1 = leia.nextInt();
		
		System.out.println("Digite o segundo numero inteiro:");
		int num2 = leia.nextInt();
		
		System.out.println("Digite o numero de comparação");
		int num3 = leia.nextInt();
		
		if((num1+num2)>=num3) {
			System.out.printf("A soma de %d + %d = %d, É MAIOR QUE %d",num1,num2,(num1+num2),num3);
			
		}else {
			System.out.printf("A soma de %d + %d = %d, É MENOR QUE %d",num1,num2,(num1+num2),num3);
		}
		

	}

}
