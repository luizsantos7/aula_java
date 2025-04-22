package aula_06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class colecaoArrayList {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//cria a lista Array
		
		ArrayList<Double> numeros = new ArrayList<Double>();
		
		// adiciona numeros a lista
		
		numeros.add(2.0);
		numeros.add(3.0);
		numeros.add(9.0);
		numeros.add(6.0);
		numeros.add(2.0);
		
		//output pra adicionar numeros
		System.out.println("Digite um numero real: ");
		double input = leia.nextDouble();
		numeros.add(input);
		
		// for each n�o resumido
		for(var numero : numeros) {
			System.out.println(numero);
		}
		
		//mostra qual indice que o numero digitado est� localizado
		System.out.println("\nindice do numero 9.0: " + numeros.indexOf(9.0));
		
		// confere se o numero digitado existe na lista
		System.out.println("\no numero 9.0 existe na cole��o? " + numeros.contains(9.0));	
		
		// pega qual numero esta no indice que voc� escolheu
		System.out.println("\nqual valor esta armazenado no indice 2? " + numeros.get(2));
		
		System.out.println("\n");
		
		// mudou o numero da indice indicado (indice que eu desejo mudar, valor que eu quero colocar)
		numeros.set(2, 10.0);
		
		// faz a mesma coisa que o for each, mas resumido 
		numeros.forEach(System.out::println);
		
		System.out.println("\n");
		
		// excluir numeros da lista
		numeros.remove(2);
		
		numeros.remove(2.0);
		
		//exibe os dados ap�s a exclus�o
		numeros.forEach(System.out::println);
		
		System.out.println("\nqual � o tamanho da cole��o? "+ numeros.size());
		
		// apaga toda a cole��p
		/*numeros.clear();
		System.out.println("\n//////// COLE��O APAGADA ////////\n");*/
		
		System.out.println("\nA cole��o esta vazia? "+ numeros.isEmpty());
		
		numeros.sort(null);
		System.out.println("\nExibir os dados ordenados em ordem Crescente:");
		numeros.forEach(System.out::println);
		
		numeros.sort(Comparator.reverseOrder());
		System.out.println("\nExibir os dados ordenados em ordem decrescente:");
		numeros.forEach(System.out::println);
		
		
		leia.close();
	}

}
