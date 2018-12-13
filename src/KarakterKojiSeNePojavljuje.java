import java.util.Scanner;

public class KarakterKojiSeNePojavljuje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);

		System.out.println("Unesi string: ");
		String recenica = unos.nextLine();

		boolean ima = true;
		char space = ' ';

		for (int i = 0; i < recenica.length(); i++) {

			char c = recenica.charAt(i);

			for (int j = 0; j < recenica.length(); j++) {

				char c1 = recenica.charAt(j);

				if (c != c1 && c != space) {

					ima = true;
				}

				if (c == recenica.charAt(j) && j != i && c != space) {

					ima = false;

					break;
				}
			}

			if (ima == true) {

				System.out.println("Prvi karakter koji se ne pojavljuje je: " + c);

				break;
			}

		}

		if (ima == false) {

			System.out.println("Nijedan karakter nije nadjen");
		}

		unos.close();
	}

}
