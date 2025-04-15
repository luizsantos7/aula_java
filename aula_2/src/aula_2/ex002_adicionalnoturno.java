package aula_2;

import java.util.Scanner;

public class ex002_adicionalnoturno {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu Salário Bruto:");
		float salario = leia.nextFloat();
		
		System.out.println("Digite o adicional noturno:");
		float add_noturno = leia.nextFloat();
		
		System.out.println("Total de horas extras:");
		float hr_extra = leia.nextFloat();
		
		System.out.println("Valor de Descontos:");
		float desconto = leia.nextFloat();
		
		float salario_final = (salario + add_noturno +(hr_extra*5)) - desconto;
		
		System.out.printf("RESUMO SALARIAL\n\nSalario Bruto:%.2f\nQUANTIDADE DE HORAS EXTRAS:%.0f\nDescontos:%.2f\nSalario final: %.2f",salario,hr_extra,desconto,salario_final);

	}

}
