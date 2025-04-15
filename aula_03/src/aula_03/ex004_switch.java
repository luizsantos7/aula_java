package aula_03;

import java.util.Scanner;

public class ex004_switch {

	public static void main(String[] args) {

		 Scanner leia = new Scanner(System.in);

	  
	        System.out.print("Digite o primeiro n�mero: ");
	        float numero1 = leia.nextFloat();

	        System.out.print("Digite o segundo n�mero: ");
	        float numero2 = leia.nextFloat();

	       
	        System.out.println("\nC�digo da Opera��o:");
	        System.out.println("1 - Soma");
	        System.out.println("2 - Subtra��o");
	        System.out.println("3 - Multiplica��o");
	        System.out.println("4 - Divis�o");

	        System.out.print("Digite o c�digo da opera��o: ");
	        int codigo = leia.nextInt();

	        float resultado;

	      
	        switch (codigo) {
	            case 1:
	                resultado = numero1 + numero2;
	                System.out.printf("Resultado: %.2f + %.2f = %.2f%n", numero1, numero2, resultado);
	                break;
	            case 2:
	                resultado = numero1 - numero2;
	                System.out.printf("Resultado: %.2f - %.2f = %.2f%n", numero1, numero2, resultado);
	                break;
	            case 3:
	                resultado = numero1 * numero2;
	                System.out.printf("Resultado: %.2f * %.2f = %.2f%n", numero1, numero2, resultado);
	                break;
	            case 4:
	                if (numero2 == 0) {
	                    System.out.println("Erro: divis�o por zero!");
	                } else {
	                    resultado = numero1 / numero2;
	                    System.out.printf("Resultado: %.2f / %.2f = %.2f%n", numero1, numero2, resultado);
	                }
	                break;
	            default:
	                System.out.println("Opera��o Inv�lida!");
	        }

	        leia.close();

	}

}
