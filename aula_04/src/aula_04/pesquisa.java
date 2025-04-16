package aula_04;

import java.util.Scanner;

public class pesquisa {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int futebol = 0, voleibolM18 = 0, basqueteMn18 = 0, outros = 0, idade=0, esporte=0, totalResposta=0, somaIdade=0;
		String continua = "S";
		
		while(continua.equalsIgnoreCase("s")) {
			
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			
			System.out.printf("Digite a seu esporte favorito:\n\n1-Futebol\n\n2-Voleibol\n\n3-Basquete\n\n4-Outros\n\nEscolha:");
			esporte = leia.nextInt();
			
			if (esporte==1) {
				futebol++;
			}
			
			else if (esporte==2 && idade>=18) {
				voleibolM18++;
			}
			
			else if (esporte==3 && idade<=18) {
				basqueteMn18++;
			}
			
			else {
				outros++;
			}
			
			totalResposta++;
			somaIdade += idade;
			System.out.println("Deseja continuar? (s/n)");
			leia.skip("\\R");
			continua = leia.nextLine().toUpperCase();
		}
		
		double media =(somaIdade / totalResposta);
		System.out.printf("\nTotal de pessoas que gostam de Futebol: %d", futebol);
		System.out.printf("\nTotal de pessoas que gostam de Voleibol e são maiores de idade: %d",voleibolM18);
		System.out.printf("\nTotal de pessoas que gostam de Voleibol e são menores de idade: %d\n",basqueteMn18);
		System.out.println("Outros:" + outros);
		System.out.printf("\nMedia de idade: %.2f",media);
		
		leia.close();

	}

}
