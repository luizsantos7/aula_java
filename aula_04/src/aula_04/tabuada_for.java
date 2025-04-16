package aula_04;

import java.util.Scanner;

public class tabuada_for {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o numero que deseja ver a tabuada:");
		int numero = leia.nextInt();
		
		
		for(int contador = 1; contador <=10;contador++) {
			System.out.printf("%d x %d = %d\n",contador,numero,(contador*numero));
		}
		leia.close();
	}
	
}
