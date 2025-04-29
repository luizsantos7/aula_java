package aula_09;

public class jogadordeFutebol extends Pessoa implements Corredor {

	public jogadordeFutebol(String nome) {
		super(nome);
	
	}

	@Override
	public void aquecer() {
		System.out.println("Aquecendo no gramado...");		
	}

	@Override
	public void correr() {
		System.out.println("Jogando...");
		
	}

	@Override
	public void cansou() {
		System.out.println("fim de jogo!!");
		
	}

}
