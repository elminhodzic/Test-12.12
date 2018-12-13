
public class Mobitel {

	
	String proizvodjac;
	String model;
	double brzinaProcesora;
	int brojJezgri;
	double kolicinaRamMemorije;
	double kolicinaMemorije;
	double brojMegapixelaKamere;
	String nizInstaliranihAplikacija;
	
	
	Mobitel (){
		
	}
	
	public Mobitel (String proizvodjac, String model, double brzinaProcesora, int brojJezgri, double kolicinaRamMemorije, double kolicinaMemorije, double brojMegapixelaKamere) {
		this.proizvodjac = proizvodjac;
		this.model = model;
		this.brzinaProcesora = brzinaProcesora;
		this.brojJezgri = brojJezgri;
		this.kolicinaRamMemorije = kolicinaRamMemorije;
		this.kolicinaMemorije = kolicinaMemorije;
		this.brojMegapixelaKamere = brojMegapixelaKamere;
		
	}
	
	public void specifikacije () {
		
		
		System.out.println("Proizvodjac- " + proizvodjac);
		System.out.println("Model- " + model);
		System.out.println("Brzina Procesora- " + brzinaProcesora);
		System.out.println("Broj jjezgri- " + brojJezgri);
		System.out.println("Kolicina Ram memorije- " + kolicinaRamMemorije);
		System.out.println("kolicina memorije- " + kolicinaMemorije);
		System.out.println("Broj megapixela kamere- " + brojMegapixelaKamere);
		System.out.println("niz instaliranih aplikacija- " + nizInstaliranihAplikacija);
		
	}
	
	
	
	

	public String getProizvodjac() {
		return proizvodjac;
	}

	public void setProizvodjac(String proizvodjac) {
		this.proizvodjac = proizvodjac;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getBrzinaProcesora() {
		return brzinaProcesora;
	}

	public void setBrzinaProcesora(double brzinaProcesora) {
		this.brzinaProcesora = brzinaProcesora;
	}

	public int getBrojJezgri() {
		return brojJezgri;
	}

	public void setBrojJezgri(int brojJezgri) {
		this.brojJezgri = brojJezgri;
	}

	public double getKolicinaRamMemorije() {
		return kolicinaRamMemorije;
	}

	public void setKolicinaRamMemorije(double kolicinaRamMemorije) {
		this.kolicinaRamMemorije = kolicinaRamMemorije;
	}

	public double getKolicinaMemorije() {
		return kolicinaMemorije;
	}

	public void setKolicinaMemorije(double kolicinaMemorije) {
		this.kolicinaMemorije = kolicinaMemorije;
	}

	public double getBrojMegapixelaKamere() {
		return brojMegapixelaKamere;
	}

	public void setBrojMegapixelaKamere(double brojMegapixelaKamere) {
		this.brojMegapixelaKamere = brojMegapixelaKamere;
	}

	public String getNizInstaliranihAplikacija() {
		return nizInstaliranihAplikacija;
	}

	public void setNizInstaliranihAplikacija(String nizInstaliranihAplikacija) {
		this.nizInstaliranihAplikacija = nizInstaliranihAplikacija;
	}
}
