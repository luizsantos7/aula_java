package aula_05;
 
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
 
public class vetores {
 
	public static void main(String[] args) {
 
		Scanner leia = new Scanner(System.in);
 
		// Vetor de n�meros inteiros inicializado com valores
		int vetorInteiros[] = { 10, 15, 35, 70, 140, 280, 320, 480 };
 
		// Vetor de Objetos Float, com tamanho 5
		Float vetorReal[] = new Float[5];
 
		// Vetor de Objetos String
		String vetorStrings[] = { "Boxer", "Pastor Alem�o", "Pinscher", "Husky Siberiano", "Corgi" };
 
		// Vari�vel float para armazenar a soma dos elementos vetorReal
		float soma = 0;
 
		// La�o for tradicional para exibir os dados do vetorInteiros
		for (int indice = 0; indice < vetorInteiros.length; indice++) {
			System.out.printf("\nvetorInteiros[%d] = %d", indice, vetorInteiros[indice]);
		}
 
		// La�o for tradicional para inserir dados no vetorReal
		for (int indice = 0; indice < vetorReal.length; indice++) {
			System.out.println("\nDigite um n�mero Real: ");
			vetorReal[indice] = leia.nextFloat();
		}
 
		// La�o de Repeti��o for each para somar os dados do vetorReal
		for (var valor : vetorReal) {
			soma += valor;
		}
 
		// Exibindo o resultado da soma
		System.out.println("Resultado da soma: " + soma);
 
		// Ordenando o vetorReal em ordem crescente
		Arrays.sort(vetorReal);
 
		// Exibindo o vetorReal com os dados em ordem crescente
		for (var valor : vetorReal) {
			System.out.println("Elemento atual: " + valor);
		}
 
		// Ordenando o vetorReal em ordem decrescente
		// Previamente ele deve estar ordenado em ordem crescente
		Arrays.sort(vetorReal, Collections.reverseOrder());
		
		System.out.println("\n\n////////////////////////////////////////////////////////////////////////////////////\n\n");
 
		// Exibindo o vetorReal com os dados em ordem decrescente
		for (var valor : vetorReal) {
			System.out.println("Elemento atual: " + valor);
		}
 
		// Ordenando o vetorStrings em ordem crescente
		Arrays.sort(vetorStrings);
 
		System.out.println("\n\n////////////////////////////////////////////////////////////////////////////////////\n\n");
		
		// Exibindo o vetorStrings com os dados em ordem crescente
		for (var valor : vetorStrings) {
			System.out.println("Elemento atual: " + valor);
		}
 
		leia.close();
	}
 
}