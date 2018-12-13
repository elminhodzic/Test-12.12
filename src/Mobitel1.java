import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Mobitel1 {

	public static void main(String[] args) {

		Mobitel mobitel = new Mobitel("neko", "nesto", 2.4, 4, 6, 512, 8);


		ArrayList<String> aplikacije = new ArrayList<>();

		aplikacije.add("aplikacija 1");
		aplikacije.add("aplikacija 2");
		aplikacije.add("aplikacije 3");

		aplikacije.remove(1);
		int memorija = 200;

		mobitel.setKolicinaMemorije(mobitel.getKolicinaMemorije() + memorija);

		
		System.out.println("Proizvodjac- " + mobitel.getProizvodjac());
		System.out.println("model- " + mobitel.getModel());
		System.out.println("brzina procesora- " + mobitel.getBrzinaProcesora());
		System.out.println("kolicina Ram memorije- " + mobitel.getKolicinaRamMemorije());
		System.out.println("kolicina memorije- " + mobitel.getKolicinaMemorije());
		System.out.println("broj megapixela kamere- " + mobitel.getBrojMegapixelaKamere());
		System.out.println();

		System.out.println("Aplikacije");
		for (String e : aplikacije) {

			System.out.println(e);
		}

	}
}
