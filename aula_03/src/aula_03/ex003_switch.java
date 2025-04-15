package aula_03;

import java.util.Scanner;

public class ex003_switch {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.printf(
			    "Código               Produto                  Preço Unitário\n" +
			    "--------------------------------------------------------------\n" +
			    "1                    Cachorro Quente          R$ 10.00\n" +
			    "2                    X-Salada                 R$ 15.00\n" +
			    "3                    X-Bacon                  R$ 18.00\n" +
			    "4                    Bauru                    R$ 12.00\n" +
			    "5                    Refrigerante             R$  8.00\n" +
			    "6                    Suco de Laranja          R$ 13.00\n"
			);
		
		
		System.out.println("\n\nEscolha seu produto pelo Código:");
		int cod = leia.nextInt();
		int preco = 0;
		
		switch(cod) {
		
		case 1:
			preco = 10;
			
			break;
		case 2:
			preco = 15;
			break;
		case 3:
			preco = 18;
			break;
		case 4:
			preco = 12;
			break;
		case 5:
			preco = 8;
			break;
		case 6:
			preco = 13;
			break;
		default:
			System.out.println("Invalido");
			return;
		}
		
		System.out.printf("Digite a quantidade: ");
		int quantidade = leia.nextInt();
		System.out.printf("Valor total: R$%d,00 ///// Quantidade: %d Unidades",preco*quantidade, quantidade);
		
	}

}
