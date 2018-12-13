

public class MyArray {
	
	public int[] array;
	
	public MyArray(int[] array) {
		this.array = array;
	}
	
	public int getSmallestElement() {
		int smallest = this.array[0];
		for (int i = 1; i < this.array.length; i++) {
			if (this.array[i] < smallest)
				smallest = this.array[i];
		}
		return smallest;
	}
	
	public int getLargestElement() {
		int largest = this.array[0];
		for (int i = 1; i < this.array.length; i++) {
			if (this.array[i] > largest)
				largest = this.array[i];
		}
		return largest;
	}
	
	public int sumAllElements() {
		int sum = 0;
		for (int i = 0; i < this.array.length; i++)
			sum += this.array[i];
		return sum;
	}
	
	public void printAllElements() {
		for (int i = 0; i < this.array.length; i++)
			System.out.print(this.array[i] + " ");
	}
	
	

}
