package aula_05;

import java.util.Scanner;

public class matriz {
	public static void main(String[] args) {
		int matriz[][] = {{10,12,13},{20,23,24},{33,32,39}};
		int matrizIrregular[][] = {{10,12},{20,23},{33,32}};
		
		Float matrizReal[][] = new Float[3][3];
		
		Scanner leia = new Scanner(System.in);
		
		/*for(int linha = 0;linha < matriz.length;linha++) {
			for(int coluna = 0;coluna< matriz.length;coluna++) {
				System.out.printf("\nMATRIZ [%d][%d] = %d\n", linha, coluna, matriz[linha][coluna]);
			}
		}
		
		for(int linha = 0;linha < matrizReal.length;linha++) {
			for(int coluna = 0;coluna< matrizReal.length;coluna++) {
				System.out.println("Digite o numero real: ");
				matrizReal[linha][coluna] = leia.nextFloat();
			}
		}
		
		for(Float[] vetor : matrizReal) {
			for(var valor : vetor) {
				System.out.println("Exibir posição atual: "+valor);
			}
		}*/
		
		for(int linha = 0;linha < matrizIrregular.length;linha++) {
			for(int coluna = 0;coluna< matrizIrregular[linha].length;coluna++) {
				System.out.printf("\nMATRIZ [%d][%d] = %d\n", linha, coluna, matrizIrregular[linha][coluna]);
			}
		}
		
	}
}
