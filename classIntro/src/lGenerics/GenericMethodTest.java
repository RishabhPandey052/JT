package lGenerics;

public class GenericMethodTest {
	
	public static <E> void printArray(E[] array) {
		
		for(E el : array) {
			System.out.print(el+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Integer[] intArray = {1,2,3,4,5};
		Double[]  doubleArray = {1.1,2.2,3.3,4.4,5.5};
		Character[] charArray = {'H','E','L','L','O'};
		
		printArray(intArray);
		printArray(doubleArray);
		printArray(charArray);
	}	

}
