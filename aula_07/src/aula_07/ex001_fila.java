package aula_07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ex001_fila {

	public static void main(String[] args) {

			Queue<String> fila = new LinkedList<String>();
			
			Scanner leia = new Scanner(System.in);
			int condicao = 0;
			
			
			do {
				System.out.println();
				System.out.println("===== MENU =====");
				System.out.println("1: Adicionar um novo Cliente na fila.");
				System.out.println("2: Listar todos os Clientes na fila.");
				System.out.println("3: Chamar uma pessoa da fila.");
				System.out.println("0: O programa deve ser finalizado.");
				System.out.println("================");
				System.out.println();
				System.out.print("Escolha uma opção: ");
				condicao = leia.nextInt();
				
				
				//adicionar cliente
				if (condicao == 1) {
					String cliente= "";
					
					while(!cliente.equalsIgnoreCase("voltar")) {
						System.out.println("\nVoce esta encaminhando um novo cliente para fila digite o Nome ou digite Voltar: ");
						cliente = leia.next();
					
						if (!cliente.equalsIgnoreCase("voltar")) {
							fila.add(cliente);
							}
					}

					
				}
				
				// listar todos os clientes
				else if (condicao == 2) {
					System.out.println("\nNomes em fila:\n ");
					for(var nomes : fila) {
						System.out.println(nomes);	
					}
				}
				
				//chamar uma pessoa da fila
				else if (condicao == 3) {
					System.out.println("Quantas pessoas deseja chamar?");
					int num = leia.nextInt();
					
					if (fila.size() != num) {
						System.out.println("\nPessoas insuficientes para chamar");
					}
					else {
						if (!fila.isEmpty()) {
							int guiche =0;
							for (int x = 0; x != num; x++) {
								guiche++;
								System.out.println("\nPor favor "+ fila.poll() + " compareça ao guichê: " + guiche);
							}
						}
						else if (fila.isEmpty()) {
							System.out.println("\nFila vazia!");
						}
					}
				}
				
				
				//finalizar programa
				else if (condicao == 0) {
					if (fila.isEmpty()) {
						System.out.println("PROGRAMA FINALIZADO");
					}
					
					else {
						System.out.println("Ação inconcluida, ainda resta pessoas na fila");
						condicao++;
					}
					
				}
				
				//caso a pessoa escreva um numero invalido
				else {
					System.out.println("\nAlternativa invalida");
				}
				
			} while (condicao != 0);

	}

}
