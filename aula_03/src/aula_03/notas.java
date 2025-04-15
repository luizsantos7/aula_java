package aula_03;

import java.util.Scanner;

public class notas {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a Nota do Aluno:");
		float nota = leia.nextFloat();
		
		if(nota>=7) {
			System.out.println("ALUNO APROVADO");
		}
		
		else if(nota>=5 && nota <7){
			System.out.println("RECUPERAÇÃO");
		}
		
		else {
			System.out.println("REPROVADO");
		}
		leia.close();
	}

}
