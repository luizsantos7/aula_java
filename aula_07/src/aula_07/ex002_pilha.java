package aula_07;

import java.util.Scanner;
import java.util.Stack;

public class ex002_pilha {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);
	        Stack<String> pilhaLivros = new Stack<>();
	        int opcao = -1;

	        while (opcao != 0) {
	            System.out.println("\n==== MENU PILHA DE LIVROS ====");
	            System.out.println("1: Adicionar um novo livro na pilha.");
	            System.out.println("2: Listar todos os livros da pilha.");
	            System.out.println("3: Retirar um livro da pilha.");
	            System.out.println("0: Finalizar o programa.");
	            System.out.print("Escolha uma opção: ");

	            opcao = leia.nextInt();
	            leia.nextLine(); // limpar buffer

	            switch (opcao) {
	                case 1:
	                    System.out.print("Digite o nome do livro: ");
	                    String livro = leia.nextLine();
	                    pilhaLivros.push(livro);
	                    System.out.println("Livro \"" + livro + "\" adicionado à pilha.");
	                    break;

	                case 2:
	                    if (pilhaLivros.isEmpty()) {
	                        System.out.println("A pilha está vazia.");
	                    } else {
	                        System.out.println("Livros na pilha:");
	                        for (int i = pilhaLivros.size() - 1; i >= 0; i--) {
	                            System.out.println("- " + pilhaLivros.get(i));
	                        }
	                    }
	                    break;

	                case 3:
	                    if (pilhaLivros.isEmpty()) {
	                        System.out.println("A pilha está vazia. Nenhum livro para retirar.");
	                    } else {
	                        String removido = pilhaLivros.pop();
	                        System.out.println("Livro \"" + removido + "\" foi retirado da pilha.");
	                    }
	                    break;

	                case 0:
	                    System.out.println("Encerrando o programa...");
	                    break;

	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }
	        }

	        leia.close();

	}

}
