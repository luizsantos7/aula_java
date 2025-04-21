package aula_05;

public class cinema {

	public static void main(String[] args) {
		
		int assentos[][] = {
				
				{1,0,1,1,1,0},
				{1,0,1,1,1,1},
				{1,0,1,0,1,1},
				{1,0,1,1,0,1},
				{1,0,1,0,1,1},
				{1,0,0,0,0,0},
		};
		
		int ocupado = 0, livres = 0;
		
		for(var fila : assentos) {
			for(var assento : fila) {
				if (assento == 1) {
					ocupado++;
				}
				else {
					livres++;
				}
			}
		}
		
		System.out.println("ASSENTOS OCUPADOS: "+ocupado);
		System.out.println("ASSENTOS LIVRES: ");
	}

}
