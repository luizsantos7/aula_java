package aula_06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class colecaoSet {

	public static void main(String[] args) {
		
		Set<String> frutas = new HashSet<String>();
		
		frutas.add("Ma��");
		frutas.add("Morango");
		frutas.add("Abacate");
		frutas.add("Banana");
		frutas.add("Ma��");
		frutas.add("ma��");
		
		System.out.println(frutas);

		/*for (var fruta : frutas) {
			System.out.println(fruta.hashCode());
		}*/
		
		System.out.println("\nMorango existe na minha cole��o? "+ frutas.contains("Morango"));
		
		// remove o elemento da cole��o
		frutas.remove("Morango");
		
		// criar um iterator
		Iterator<String> iFrutas = frutas.iterator();
		
		// listei os dados apos a exclus�o de um elemento
		while(iFrutas.hasNext()) {
			System.out.println(iFrutas.next());
		}
		
		ArrayList<String> frutasList = new ArrayList<String>();
		
		frutasList.addAll(frutas);
		frutasList.sort(null);
		
		System.out.println("\nExibir os dados do Array List:\n");
		frutasList.forEach(System.out::println);
	}

}
