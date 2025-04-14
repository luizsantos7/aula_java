package aula_2;

import java.util.Scanner;

public class ex004_diferença {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o numero 1: ");
		float n1 = leia.nextFloat();
		System.out.println("Digite o numero 2: ");
		float n2 = leia.nextFloat();
		System.out.println("Digite o numero 3: ");
		float n3 = leia.nextFloat();
		System.out.println("Digite o numero 4: ");
		float n4 = leia.nextFloat();
		
		float calculo = (n1*n2)-(n3*n4);
		
		System.out.println("Diferença:"+calculo);

	}

}
