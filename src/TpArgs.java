
public class TpArgs {

	public static void main(String[] args) {
		System.out.println(args.length);
//		En passant de parametre sur run as configuration je passe trois parametres
		for (int i = 0; i < args.length; i++) {
			System.out.println((i+1)+ ":"+ args[i]);
		}

	}

}
