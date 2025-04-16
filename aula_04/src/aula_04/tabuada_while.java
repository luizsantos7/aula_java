package aula_04;

import java.util.Scanner;

public class tabuada_while {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int contador = 1;
		int quebra = 1;

		
		while(quebra!=0) {
			System.out.println("Digite o numero que deseja ver a tabuada:");
			int numero = leia.nextInt();
			while (contador<=10) {
				System.out.printf("%d x %d = %d\n",contador,numero,(contador*numero));
				contador++;
			}
			System.out.println("Deseja continuar? (sim/nao)");
			String escolha = leia.next();
			if (escolha.equalsIgnoreCase("nao")) {
				quebra = 0;
				System.out.println("Programa Encerrado");
			}
			contador = 1;

		}
		leia.close();

	}

}
