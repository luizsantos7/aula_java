package aula_06;

import java.util.ArrayList;
import java.util.Scanner;

public class ex001_arrayList {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numeral = 0;
		
		ArrayList<String> colecao = new ArrayList<String>();
		
		while(colecao.size()<5) {
			numeral++;
			System.out.printf("Digite a [%d] COR: ", numeral);
			String cores = leia.next();
			colecao.add(cores);
		}
		
		System.out.println("\n\nCores Escolhidas:\n\n");
		for(var cores : colecao) {
			System.out.println(cores);
			}
		
		colecao.sort(null);
		System.out.println("\n\nCores reorganizadas:\n\n");
		for(var cores : colecao) {
			System.out.println(cores);
		}
	}
}
