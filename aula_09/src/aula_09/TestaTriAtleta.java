package aula_09;

public class TestaTriAtleta {

	public static void main(String[] args) {
		
		Triatleta t1 = new Triatleta("João");
		
		t1.visualizar();
		
		t1.aquecer();
		t1.nadar();
		t1.pedalar();
		t1.correr();
		t1.cansou();
		
		jogadordeFutebol jf1 = new jogadordeFutebol("Mario ");
		
		System.out.println("\n\n");
		jf1.visualizar();
		jf1.aquecer();
		jf1.correr();
		jf1.cansou();
		
		

	}

}
