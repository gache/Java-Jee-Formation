import java.util.Scanner;

public class BoucleLigneEtoiles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir un numero: ");
		int n = sc.nextInt();
		System.out.println("Debut de ma boucle \n");
		for (int i = 0; i < n; i++) {
			System.out.print("*");

		}
		System.out.println();
		System.out.println("\nFin de ma boucle");
	}

}
