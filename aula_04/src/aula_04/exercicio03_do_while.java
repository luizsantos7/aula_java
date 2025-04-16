package aula_04;

import java.util.Scanner;

public class exercicio03_do_while {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int positivo = 0, numero=1,soma=0,x=1;
		
		do {
			System.out.println("Digite um numero inteiro ou digite 0 para encerrar:");
			numero = leia.nextInt();
			
			if (numero>0) {
				soma = numero + soma;
			}
		}while(numero != 0);
		
		System.out.println("TOTAL DA SOMA DOS NUMERO POSITIVOS: "+soma);
	}

}
