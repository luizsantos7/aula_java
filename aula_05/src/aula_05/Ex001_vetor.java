package aula_05;

import java.util.Scanner;

public class Ex001_vetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetor[] = {1,3,5,7,2,4,9,8,6,10};
		int posicao = 0;
		
		System.out.println("Digite um numero para achar na tabela do Vetor:");
		int escolha = leia.nextInt();
		int relogio =0;
		
		for(var ler : vetor) {
			posicao++;
			if (ler == escolha) {
				System.out.printf("Seu valor %d //// estava localizado na posição %d", escolha,posicao);
			}
			else{
				relogio++;
			}
			if (relogio == 10) {
				System.out.println("Seu numero não esta na tabela");
				
			}
		}
		
	}

}
