import java.util.Arrays;
import java.util.List;

public class BinarySearch {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 23, 34, 22, 25, 27);
		int arr[] = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			arr[i]=list.get(i);
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		int key=34;
		int search = Arrays.binarySearch(arr, key);
		if(search<0) {
			System.out.println("Element not found");
		}else {
			System.out.println("Element is found at index "+search);
		}
	}

}
