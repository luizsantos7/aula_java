package aula_07;

import java.util.Stack;

public class pilha {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		
		pilha.add("Comunicação não violenta");
		pilha.add("IT: A Coisa");
		pilha.add("A coragem de ser imperfeito");
		pilha.add("Quem pensa enriquece");
		pilha.add("Diario de um banana");
		pilha.add("Senhor dos Anéis");
		pilha.add("O codigo Da Vinci");
		
		
		System.out.println(pilha);
		
		pilha.pop();
		
		System.out.println(pilha);
		
		pilha.push("Roube como um Artista");
		
		System.out.println(pilha);
		
		System.out.println(pilha.peek());
		
		System.out.println("O livro Diario de um Banana existe na pilha? "+ pilha.contains("Diario de um banana"));
	}

}
