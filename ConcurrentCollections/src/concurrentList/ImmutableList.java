package concurrentList;
import java.util.List;
public class ImmutableList {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1,"A","BCA");
		Student s2 = new Student(2,"B","MCA");
		Student s3 = new Student(3,"C","MBA");
		
		List<Student> l = List.of(s1,s2,s3);
		
		l.forEach(e->{System.out.println(e);});
		
		
		
	}
}
