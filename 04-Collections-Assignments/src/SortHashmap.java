import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortHashmap {
	public static void main(String[] args) {
		Map<String, Long> map=new HashMap<>();
		map.put("Pune", 1500000l);
		map.put("Amravati", 1000000l);
		map.put("ShivajiNagar", 1200000l);
		map.put("Mumbai", 2000000l);
		
		Map<String, Long> t=new TreeMap<>();
		t.putAll(map);
		Set<Entry<String,Long>> entrySet = t.entrySet();
		for (Entry<String, Long> entry : entrySet) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}

}
