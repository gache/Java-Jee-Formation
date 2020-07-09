import java.util.Scanner;

public class TpExercice02 {

	public static void main(String[] args) {
		int notes [] = new int [10];
		int petit = 20;
		int grande = 0;
		int somme = 0;
		Scanner sc = new Scanner(System.in);

		int i = 0;

		do {
			System.out.println("Rentre la note numero: " + (i+1));
			int temps = sc.nextInt();
			if(temps >= 0 && temps <= 20) {
				notes[i] = temps;

				if(notes[i] > grande) grande = notes[i];
				if(notes[i] < petit) petit = notes[i];
				somme += notes[i];	
				i++;
				continue;
			}
			System.out.println("La valeur rentré n'est pas comprise entre 0 et 20.");

		} while (i< notes.length);

		System.out.println("La note la plus petit est: " + petit);
		System.out.println("La note la plus grande est: " + grande);
		System.out.println("La moyenne est : " + (somme / notes.length));

	}

}
