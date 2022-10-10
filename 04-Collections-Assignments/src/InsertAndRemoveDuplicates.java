import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class InsertAndRemoveDuplicates {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> list=new ArrayList<>();
		System.out.println("How many elements you want to add :");
		int n = sc.nextInt();
		System.out.println("please enter the element :");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
			
		}
		System.out.println("With Duplicates elements : "+list);
		Set<Integer> set=new TreeSet<>(list);
		System.out.println("Without Duplicates elements : "+set);
		
		
	}

}
