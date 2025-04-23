package aula_07;

import java.util.LinkedList;
import java.util.Queue;

public class fila {

	public static void main(String[] args) {
		// cria a estrutura de dados em fila
		Queue<String> fila = new LinkedList<String>();
		
		//adiciona elementos a fila
		fila.add("Carlos");
		fila.add("Giovana");
		fila.add("Livia");
		fila.add("Maria");
		fila.add("Samuel");
		fila.add("Fabricio");
		fila.add("Victor");
		
		// exibe a fila atual na tela
		System.out.println(fila);
		
		// retira um elemento da fila(ele sempre removera o primeiro)
		fila.remove();
		
		System.out.println(fila);
		
		fila.add("Thiago");
		
		System.out.println(fila);
		
		// mostra quem é o primeiro da fila
		System.out.println(fila.peek());
		
		
		// mostra quem é o primeiro da fila e o remove
		System.out.println(fila.poll());
		
		System.out.println(fila);
		
		System.out.println("A maria está na fila? "+ fila.contains("Maria"));
	
		System.out.println("Qual o tamanho da fila? "+ fila.size());
		
		int contador =0;
		
		for(var pessoa : fila) {
			contador++;
			if (pessoa.equalsIgnoreCase("maria")) {
				System.out.println("posição: " +contador);	
			}
		}
	
	}

}
