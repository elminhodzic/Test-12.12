import java.util.Scanner;

public class HailstonSekvenca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		System.out.printf("unesi broj:  ");

		int broj = unos.nextInt();
		int koraci = 0;
		while (broj != 1) {
			if (broj % 2 == 0) {
				System.out.print(broj + " ");
				broj /= 2;
			} else {
				System.out.print(broj + " ");
				broj = broj * 3 + 1;
			}
			koraci++;
		}
		System.out.print(broj);
	}

}
