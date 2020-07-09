import java.util.Arrays;
import java.util.Scanner;


public class TableuJava {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// je demande la l'informtion
		System.out.println("Mettre le nombre de l'eleve");
		// j'engistre l'information saisi dans variable nbrEleves
		int nbrEleves = sc.nextInt();
		// j'ai créé mon tableau et je garde l'infomation saisir par l'utilisateur 
		int notes [] = new int [nbrEleves];

		for (int i = 0; i < notes.length; i++) {
			System.out.printf("Rentre la note de l'eleve numero: %d%n",  i + 1);
			notes[i] = sc.nextInt();
			System.out.printf("Es-tu sur de la note rentrée: %d. O/n%n ", notes[i]);
			sc.nextLine();
			String choix = sc.nextLine();
			// avec l'objet String il faut utiliser equals pas ==
			// on met toLowerCase() pour mettre tout en miniscule même s'il tape en mayuscule 

			if(choix.toLowerCase().equals("o") || choix.equals("") ) {
				continue;
			}
			i--;
		}
		System.out.println(Arrays.toString(notes));
	}

}

