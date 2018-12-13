import java.util.Scanner;

public class RolerCoster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner unos = new Scanner (System.in);
		String recenica = unos.nextLine();
		char slova = ' ';
		
		
		for (int i = 0; i < recenica.length(); i++) {
			
			if (i % 2 == 0) {
				
				slova = recenica.charAt(i);
				
			}
			
			if(i % 2 != 0) {
				
				slova = recenica.charAt(i);
				
				
			}
			
			recenica = slova + recenica;
		
		}
		System.out.println(recenica);

	}

}
