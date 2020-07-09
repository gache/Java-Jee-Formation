import java.util.Scanner;

public class BoucleAvecEtoile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir une numero entiter: ");

		int n = sc.nextInt();
		// une ligne d'etoiles
		//System.out.println("-------- Une ligne d'étoiles --------");
		//		for (int i = 0; i < n; i++) {
		//			System.out.print("* ");
		//		}
		//  System.out.println();
		
		// plusieur ligne d'etoiles
		//System.out.println("-------- Un  carré d'étoiles --------");
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		// Pyramide d'etoiles
		System.out.println("-------- Une Pyramide d'étoiles --------");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}

}


