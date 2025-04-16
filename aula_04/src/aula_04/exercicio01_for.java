package aula_04;

import java.util.Scanner;

public class exercicio01_for {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numeroPar=0, numeroImpar=0, x;
		
		for( x =1 ;x < 11; x++) {
			
			System.out.printf("Digite o %d:\n",x);
			int numero = leia.nextInt();
			
			if (numero%2 == 0) {
				numeroPar++;
			}
			else if(numero%2 == 1) {
				numeroImpar++;
			}
			else {
				System.out.println("INVALIDO");
			}
		}
		System.out.printf("NUMEROS DIGITADOS: %d\n\nNUMEROS PAR: %d\n\nNUMEROS IMPARES: %d",x-1,numeroPar,numeroImpar);

	}

}
