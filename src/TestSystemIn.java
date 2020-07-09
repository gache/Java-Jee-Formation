import java.util.Scanner;

public class TestSystemIn {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		// Je prends l'information de l'utilisateur
		System.out.println("Saisir votre Age: ");
		
		
		// Je stock l'information de l'uilisateur dans ma variable age 
		int age = sc.nextInt();

		
		// J'affiche mon resultat
		System.out.println("Ton age est bien: " + age + " ans" );
		
		sc.nextLine(); // Permet de vider le boffeur
		

		System.out.println("Saisir votre nom: ");
		String nom = sc.nextLine();
		
		System.out.println("Saisir votre prenom: ");
		String prenom = sc.nextLine();
		
	
		System.out.println("Enchanté: "+ prenom + " " + nom);
		// System.out.printf("Enchanté: %s %s. tu as %d ans%n", prenom, nom, age);

	}

}
