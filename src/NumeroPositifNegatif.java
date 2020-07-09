import java.util.Scanner;

public class NumeroPositifNegatif {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir un numero: ");
		int numero1 = sc.nextInt();
		System.out.println("Saisir un deuxième numero: ");
		int numero2 = sc.nextInt();
		

		if(numero1 > 0 && numero2 > 0 ) {
			System.out.println("les produit est positif: " + numero1 + numero2);
		} else if (numero1 > 0 && numero2 < 0 ) {
			System.out.println("les produit est negatif: " + numero1 + numero2);
		}else if (numero1 < 0 && numero2 < 0 ) {
			System.out.println("les produit est positif: " + numero1 + numero2);
		}else if (numero1 < 0 && numero2 > 0 ) {
			System.out.println("les produit est negatif: " + numero1 + numero2);
		}

	}

}
