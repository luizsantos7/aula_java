package aula_03;

import java.util.Scanner;

public class ex004_switch {

	public static void main(String[] args) {

		 Scanner leia = new Scanner(System.in);

	  
	        System.out.print("Digite o primeiro número: ");
	        float numero1 = leia.nextFloat();

	        System.out.print("Digite o segundo número: ");
	        float numero2 = leia.nextFloat();

	       
	        System.out.println("\nCódigo da Operação:");
	        System.out.println("1 - Soma");
	        System.out.println("2 - Subtração");
	        System.out.println("3 - Multiplicação");
	        System.out.println("4 - Divisão");

	        System.out.print("Digite o código da operação: ");
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
	                    System.out.println("Erro: divisão por zero!");
	                } else {
	                    resultado = numero1 / numero2;
	                    System.out.printf("Resultado: %.2f / %.2f = %.2f%n", numero1, numero2, resultado);
	                }
	                break;
	            default:
	                System.out.println("Operação Inválida!");
	        }

	        leia.close();

	}

}
