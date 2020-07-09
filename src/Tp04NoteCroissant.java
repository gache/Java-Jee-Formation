import java.util.Arrays;

public class Tp04NoteCroissant {

	public static void main(String[] args) {
int notes [] = { 19, 17, 8, 15, 18, 20, 6, 12, 16, 17, };
		
		for (int i = 0; i < notes.length - 1; i++) {
			for (int j = i; j < notes.length; j++) {
				if (notes[i] < notes[j]) {
					int tempo = notes[i];
					notes[i] = notes[j];
					notes[j] = tempo;
				}
			}
			
		}
		
		System.out.println(Arrays.toString(notes));

	}

}
