package aula_03;

import java.util.Scanner;

public class ex001_if {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("Escolha a primeira op��o\n\nVertebrado\nInvertebrado\n\nEscolha:");
		String vertebra = leia.next();
		
		if(vertebra.equalsIgnoreCase("vertebrado")){
			
			System.out.printf("Escolha a segunda op��o\n\nAve\nMamifero\n\nEscolha:");
			String classe = leia.next();
			
			if(classe.equalsIgnoreCase("Ave")) {
				
				System.out.printf("Escolha a terceira op��o\n\nCarn�voro\nOn�voro\n\nEscolha:");
				String fome = leia.next();
				
				if(fome.equalsIgnoreCase("carnivoro")) {
					System.out.println("Parab�ns, foi lhe escolhido Aguia");
				}
				else if(fome.equalsIgnoreCase("onivoro")) {
					System.out.println("Parab�ns, foi lhe escolhido Pomba");
				}
				else {
					System.out.println("Invalido, preenchimento incorreto");
				}
				
			}
			
			else if(classe.equalsIgnoreCase("Mamifero")) {
				
				System.out.printf("Escolha a terceira op��o\n\nHerb�voro\nOn�voro\n\nEscolha:");
				String fome = leia.next();
				
				if(fome.equalsIgnoreCase("herbivoro")) {
					System.out.println("Parab�ns, foi lhe escolhido Vaca");
				}
				else if(fome.equalsIgnoreCase("onivoro")) {
					System.out.println("Parab�ns, foi lhe escolhido Homem");
				}
				else {
					System.out.println("Invalido, preenchimento incorreto");
				}
			}
			
			else {
				System.out.println("Invalido, preenchimento incorreto");
				}
			
		}
		
		else if(vertebra.equalsIgnoreCase("invertebrado")) {
			
			System.out.printf("Escolha a segunda op��o\n\nInseto\nAnel�deo\n\nEscolha:");
			String classe = leia.next();
			
			if(classe.equalsIgnoreCase("inseto")) {
				
				System.out.printf("Escolha a terceira op��o\n\nHematofago\nHerbivoro\n\nEscolha:");
				String fome = leia.next();
				
				if(fome.equalsIgnoreCase("hematofago")) {
					System.out.println("Parab�ns, foi lhe escolhido Pulga");
				}
				else if(fome.equalsIgnoreCase("Herbivoro")) {
					System.out.println("Parab�ns, foi lhe escolhido Largata");
				}
				else {
					System.out.println("Invalido, preenchimento incorreto");
				}
				
			}
			
			else if(classe.equalsIgnoreCase("anelideo")) {
				
				System.out.printf("Escolha a terceira op��o\n\nHematofago\nOn�voro\n\nEscolha:");
				String fome = leia.next();
				
				if(fome.equalsIgnoreCase("hematofago")) {
					System.out.println("Parab�ns, foi lhe escolhido Sangue-Suga");
				}
				else if(fome.equalsIgnoreCase("onivoro")) {
					System.out.println("Parab�ns, foi lhe escolhido Minhoca");
				}
				else {
					System.out.println("Invalido, preenchimento incorreto");
				}
			}
			
			else {
				System.out.println("Invalido, preenchimento incorreto");
				}
			
		}
		else {
			System.out.println("Invalido, preenchimento incorreto");
		}
		
	leia.close();
	}

}
