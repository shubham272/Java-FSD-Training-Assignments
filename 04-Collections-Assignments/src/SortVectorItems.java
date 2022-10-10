import java.util.Collections;
import java.util.Vector;

public class SortVectorItems {
	public static void main(String[] args) {
		Vector<String> vitem=new Vector<>();
		   vitem.add("waterbottle");
		   vitem.add("table");
		   vitem.add("laptop");
		   vitem.add("mobile");
		   vitem.add("headphone");
		   
		 Collections.sort(vitem,Collections.reverseOrder());
		 
		System.out.println("Sorted vector: "+ vitem);
		   
		
		
	}

}
