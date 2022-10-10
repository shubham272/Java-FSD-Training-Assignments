import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortInAscending {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,23,34,5,6,2,22,25,27);
		Collections.sort(list);
		System.out.println(list);
	}

}
