package aula_06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ex002_Set {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Set<Integer> inteiros = new HashSet<Integer>();
		
		for(int i = 0; i <10; i++) {
			System.out.printf("Digite o %d numero(de preferencia que não se repita): ", i);
			int numeros = leia.nextInt();
			inteiros.add(numeros);
		}
		
        System.out.println("\nListar dados do Set:");
        Iterator<Integer> iterator = inteiros.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
		

	}

}
