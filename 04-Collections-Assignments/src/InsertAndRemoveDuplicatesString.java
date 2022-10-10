import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InsertAndRemoveDuplicatesString {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("shubham","rohit","ram","shyam","ram","rohit","anil");
		Set<String> set=new HashSet<>(list);
		System.out.println(set);
		List<String> l1=new ArrayList<>(set);
		Collections.sort(l1,Collections.reverseOrder());
		System.out.println(l1);
		
	}

}
