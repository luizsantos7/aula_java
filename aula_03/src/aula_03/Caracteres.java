package aula_03;

public class Caracteres {
	public static void main(String[] args) {
		
		String frase1 = "Turma Java 82";
		String frase2 = "TURMA JAVA 82";
		String frase3 = "turma java 82";
		String frase4 = "TURMA JAVA 82";
		
		System.out.println(frase1 == frase2);
		System.out.println(frase4 == frase2);
	
		System.out.println(frase1.equals(frase2));
		System.out.println(frase4.equals(frase2));
	
	}
}
