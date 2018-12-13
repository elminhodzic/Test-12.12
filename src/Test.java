

public class Test {
	
	public static void main(String[] args) {
		
		int[] niz = {6, 5, 1, 10, 3};
		
		MyArray array = new MyArray(niz);
		
		System.out.println("Najmanji: " + array.getSmallestElement());
		System.out.println("Najveci: " + array.getLargestElement());
		System.out.println("Suma: " + array.sumAllElements());
		System.out.print("Elementi: ");
		array.printAllElements();
	}

}
