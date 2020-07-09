
public class TpExercice01 {

	public static void main(String[] args) {
		int notes [] = { 19, 17, 8, 15, 18, 20, 6, 12, 16, 17, };
		int somme = 0;
		int petit = notes [0]; // premier valeur de mon tableau je pars de mon index 0
		int grande = notes [0];
	
		
		for (int i = 1; i < notes.length; i++) {
			
			if(notes[i] < petit) {
				petit = notes[i];
			}
			if(notes[i] > grande) {
				grande = notes[i];
			}
			somme += notes[i];
		}
		System.out.println("La note la plus petit est: " + petit);
		System.out.println("La note la plus grande est: " + grande);
		System.out.println("La moyenne est : " + (somme / notes.length));
		
	}

}





