package aula_09;

public class Triatleta extends Pessoa implements Nadador, Corredor, ciclista{

	public Triatleta(String nome) {
		super(nome);
	}

	@Override
	public void aquecer() {
		System.out.println("Aquecendo...");	
	}

	@Override
	public void pedalar() {
		System.out.println("Pedalando...");
		
	}

	@Override
	public void correr() {
		System.out.println("Correndo...");
	}

	@Override
	public void nadar() {
		System.out.println("Nadando...");
		
	}

	@Override
	public void cansou() {
		System.out.println("Cansou...");
		
	}

}
