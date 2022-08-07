package hashCode;

import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ArrayList;

public class DriverClass {
	
	public static void main(String[] args) {
		
		List<Students> s = new ArrayList<Students>();
		s.add(new Students(001,"ABC"));
		s.add(new Students(002,"DEF"));
		s.add(new Students(001,"GHI"));
		s.add(new Students(003,"ZBCS"));
		
		for(Students stu : s) {
			System.out.println(stu);
		}
		
		Collections.sort(s);
		System.out.println("AfterSorting");
		s.forEach(e ->System.out.println(e));
		
		Collections.sort(s,(s1,s2) -> s2.getName().compareTo(s1.getName()));
		System.out.println("After Sorting by name (R)");
		s.forEach(e ->System.out.println(e));
		
		
		
//		Comparator<Students> cmp = new Comparator<Students>() {
//
//			@Override
//			public int compare(Students o1, Students o2) {
//				return (o1.getName().compareTo(o2.getName()));
//			}
//		};
//		
//		Collections.sort(s,cmp);
//		same as line 26
		
//		Iterator<Students> itr = s.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
	}
}









