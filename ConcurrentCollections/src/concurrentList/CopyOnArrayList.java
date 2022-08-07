package concurrentList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnArrayList {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Ram","Ravi","Krishan");
		CopyOnWriteArrayList<String> c = new CopyOnWriteArrayList<String>(list);
		
		System.out.println("Without modification" + c);
		Iterator<String> it1 = c.iterator();
		c.add("wass");
		System.out.println("After  modification" + c);
		Iterator<String> it2 = c.iterator();
		
		System.out.println("From it1 ");
		it1.forEachRemaining(System.out :: println);
		
		System.out.println("From it2 ");
		it2.forEachRemaining(System.out :: println);
	}
	
}
