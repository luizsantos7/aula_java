package aula_2;

import java.util.Scanner;

public class ex_003_notaalunos {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite a nota 1:");
		int n1 = leia.nextInt();
		System.out.println("Digite a nota 2:");
		int n2 = leia.nextInt();
		System.out.println("Digite a nota 3:");
		int n3 = leia.nextInt();
		System.out.println("Digite a nota 3:");
		int n4 = leia.nextInt();
		
		float media = (n1+n2+n3+n4)/4;
		
		System.out.println("Sua média:"+media);
	}

}
