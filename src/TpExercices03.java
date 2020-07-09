
public class TpExercices03 {

	public static void main(String[] args) {
		System.out.println(args.length);
		int somme = 0;
		int petit = 20;
		int grande = 0;

		int i = 0;

		while (i < args.length) {

			if(Integer.parseInt(args[i]) < petit) {
				petit = Integer.parseInt(args[i]);
			}
			if(Integer.parseInt(args[i]) > grande) {
				grande = Integer.parseInt(args[i]);
			}
			somme += Integer.parseInt(args[i]);
			i++;

		}
		System.out.println("La note la plus petit est: " + petit);
		System.out.println("La note la plus grande est: " + grande);
		System.out.println("La moyenne est : " + somme / args.length);

	}

}
