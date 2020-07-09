
public class TpCorrectionExercice03 {

	public static void main(String[] args) {
		System.out.println(args.length);
		float somme = 0;
		float petit = Float.MIN_VALUE;
		float grande = Float.MAX_VALUE;

		int i = 0;

		while (i < args.length) {

			float notes = Float.parseFloat(args[i++]);

			if (notes < petit) {
				petit = notes;
			}
			if (notes > grande) {
				grande = notes;
			}
			somme += notes;
			i++;
		}
		System.out.println("La note la plus petit est: " + petit);
		System.out.println("La note la plus grande est: " + grande);
		System.out.println("La moyenne est : " + somme / args.length);

	}

}
