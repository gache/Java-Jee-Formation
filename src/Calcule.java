import java.util.Scanner;

public class Calcule {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, somme, addition, multiplication, division, resteDiv;

		System.out.println("Saisir deux numero: ");
		x = sc.nextInt();
		y = sc.nextInt();

//		somme = x + y;
//		addition = x - y;
//		multiplication = x * y;
//		division = x/y; // il faut caster pour l'avoir en reel
//		resteDiv = x % y;

//		System.out.println("La somme est: " + somme);
//		System.out.println("La difference est: " + addition);
//		System.out.println("Le produit est: " + multiplication);
//		System.out.println("La quotient est: " + division);
//		System.out.println("La reste de ma division est: " + resteDiv);
		
		// autre façon de faire pour caster la division 
		System.out.println("Les resultats de mes operations sont: ");
		System.out.println("La somme est: " + ( x + y));
		System.out.println("La difference est: " + ( x - y));
		System.out.println("Le produit est: " + ( x * y));
		System.out.println("La quotient est: " + ((double)x/y));
		// Autre façon d'afficher les valeur
		String strQuotient = String.format("La quotient est: " + ((double)x/y));
		System.out.println(strQuotient);
		System.out.println("La reste de ma division est: " +( x % y));

	}

}
