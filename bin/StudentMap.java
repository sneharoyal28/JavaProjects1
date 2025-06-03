package sneha;
import java.util.HashMap;
import java.util.Map;

public class StudentMap {

	public static void main(String[] args) {  
		HashMap<Integer,String> StudentMap=new HashMap<>();
		StudentMap.put( 1, "luna ");
		StudentMap.put(2 , " ravi");
		StudentMap.put( 3, " hari");
		StudentMap.put( 4, " ram");
		StudentMap.put( 5, " sonu");
		System.out.println("Studentlist");
		
		for (Map.Entry<Integer, String> entry : StudentMap.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey() + ", Name: " + entry.getValue());
	}

}
}
