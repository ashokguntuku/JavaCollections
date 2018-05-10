import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MyHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "hello");
		hm.put(1,"Goodbye");
		hm.put(42,"morning");
		System.out.println(hm);
		hm.put(3,"evening");
		System.out.println(hm);
		hm.remove(42);
		System.out.println(hm);
		hm.remove(31);
		System.out.println(hm);
		Set mySet = hm.entrySet();
		Iterator it = mySet.iterator();
		while(it.hasNext())
		{
			//System.out.println(it.next());
			@SuppressWarnings("unchecked")
			Entry<Integer, String> mp = (Entry<Integer, String>) it.next();
			System.out.println(mp.getKey() + " : " + mp.getValue());
			
		}
	}

}
