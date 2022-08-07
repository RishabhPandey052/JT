package concurrentSet;

import java.util.concurrent.CopyOnWriteArraySet;

public class ConcurrentSet {
	
	public static void main(String[] args) {
		
		CopyOnWriteArraySet<Integer> s = new CopyOnWriteArraySet<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
	}
}
