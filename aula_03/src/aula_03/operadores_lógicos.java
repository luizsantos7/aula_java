package aula_03;

public class operadores_l�gicos {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 5;
		int z = 5;
		int w = 20;
		
		System.out.printf("\n %d > %d = %b", x,y,(x>y));
		System.out.printf("\n %d < %d = %b", x,y,(x<y));
		System.out.printf("\n %d > %d = %b", z,y,(x>=y));
		
		
		System.out.printf("\n (%d > %d) E (%d < %d) = %b", x,y,z,w,((x>=y)&&(z<w)));
		System.out.printf("\n (%d > %d) OU (%d < %d) = %b", x,y,z,w,((x>=y)||(z<w)));
		System.out.printf("\n ! (%d > %d) E ! (%d < %d) = %b", x,y,z,w,(!(x>=y)||!(z<w)));

	}

}
