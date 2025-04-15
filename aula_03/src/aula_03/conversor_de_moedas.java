package aula_03;

import java.util.Scanner;

public class conversor_de_moedas {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double valorConvertido = 0.0;
		String moeda ="";
		
		System.out.printf("//////////////////////////////\n\n      CONVERSOR DE MOEDA  \n\n//////////////////////////////\n");
		System.out.printf("\n1- CONVERTER EM DOLAR (US$)\n2- CONVERTER EM EURO (EUR$)\n3- CONVERTER EM PESOS ARGENTINOS (AS$)\n\n//////////////////////////////\n\nDigite a opção desejada:");
		int opcao = leia.nextInt();
		
		System.out.println("DIGITE O VALOR EM REAIS (R$):");
		double valor=leia.nextDouble();
		
		switch(opcao) {
			
		case 1:
			valorConvertido = valor / 5.86;
			moeda = "Dolar";
			break;
		case 2:
			valorConvertido = valor / 6.63;
			moeda = "Euro";
			break;
		case 3:
			valorConvertido = valor / 0.0049;
			moeda = "Peso Argentino";
			break;
		default:
			System.out.println("Invalido");
			return;
		}
		System.out.printf("Valor Convertido em %s : %.2f", moeda,valorConvertido);
		leia.close();
	}
	
}
