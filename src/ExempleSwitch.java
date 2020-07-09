import java.util.Scanner;

public class ExempleSwitch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choisis parmi ces proposition: ");
		System.out.println("\t1) Ouvrir ");
		System.out.println("\t2) Quitter");
		System.out.println("\t2) Sauver");
		
		int i = sc.nextInt();
		
		switch (i) {
		case 1:
			System.out.println("Félicitation c'est ouvert");
			break;
		case 2:
			System.out.println("Bye bye ");
			break;
		case 3:
			System.out.println("Bien joué, c'est sauvegarde");
			break;
			
		default:
			System.out.println("Tu as fait un erreur. Recommence");
			main(args);
		}
	}

}
