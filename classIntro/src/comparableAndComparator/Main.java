package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Laptop> laps = new ArrayList<>();
		
		laps.add(new Laptop("B1",16,1200));
		laps.add(new Laptop("C1",6,700));
		laps.add(new Laptop("D1",8,900));
		
		Comparator<Laptop> com = new Comparator<Laptop>() {
			
		@Override
			public int compare(Laptop l1, Laptop l2) {
				if(l1.getPrice() > l2.getPrice())
					return 1;
				else 
					return -1;
			}
		};
		
		System.out.println(laps);
		//Collections.sort(laps);
		Collections.sort(laps,com);
		System.out.println(laps);
	}
	

}
