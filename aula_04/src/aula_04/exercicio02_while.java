package aula_04;

import java.util.Scanner;

public class exercicio02_while {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int pessoasMenor = 0, pessoasMaior = 0, idade=1;
		
				
		while(idade != 0) {
			System.out.println("Digite sua idade ou digite 0 para encerrar:");
			idade = leia.nextInt();
			
			if (idade>50) {
				pessoasMaior++;
			}
			if (idade<0){
				System.out.println("Numero negativo, Invalido.");
				continue;
			}
			else if(idade<21 && idade != 0) {
				pessoasMenor++;
			}
			else if(idade==0){
	
				break;
			}
	
		}
		
		System.out.println("PESSOAS MAIOR QUE 50 ANOS:"+pessoasMaior);
		System.out.println("PESSOAS MENOR QUE 21 ANOS:"+pessoasMenor);
		
	}

}
