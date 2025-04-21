package aula_05;

import java.util.Scanner;

public class ex002_matriz {

	public static void main(String[] args) {
		
		int matriz[][] = new int[3][3];
		Scanner leia = new Scanner(System.in);
		int soma1=0, soma2=0;
		
        
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.printf("Elemento [%d][%d]: ", linha, coluna);
                matriz[linha][coluna] = leia.nextInt();
            }
        }

        System.out.println("\nMatriz digitada:");
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.printf("%2d ", matriz[linha][coluna]);
            }
            System.out.println();
        }
        
       	System.out.println("Numeros diagonais da Matriz: ");
       	
        for(int posicao =0;posicao<3;posicao++) {
        	System.out.printf("%d", matriz[posicao][posicao]);
        	soma1 += matriz[posicao][posicao];
        	System.out.println();
        }
        System.out.println("SOMA DA 1 DIAGONAL: "+soma1);
        System.out.println("");
        
    	System.out.println("Numeros da segunda diagonal da Matriz: ");
        
        for(int posicao =0;posicao<3;posicao++) {
        	System.out.printf("%d", matriz[posicao][2 -posicao]);
        	soma2 += matriz[posicao][2- posicao];
        	System.out.println();
        }
        System.out.println("SOMA DA 2 DIAGONAL: "+soma2);
        System.out.println("");
		
		leia.close();
	}

}
