import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		List<Student> ece = new ArrayList<>();
		List<Student> cse = new ArrayList<>();
		Map<String,List<Student>> map = new HashMap<String,List<Student>>();
		
		ece.add(new Student(1,"Akshaya"));
		ece.add(new Student(2,"Alekhya"));
		cse.add(new Student(3,"Ramya"));
		cse.add(new Student(4,"Pragathi"));
		
		map.put("EC", ece);
		map.put("CS", cse);
		
		
		System.out.println(map);
	}

}
