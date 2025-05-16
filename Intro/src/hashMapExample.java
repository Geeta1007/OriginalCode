import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Lion");
		hm.put(2, "Fox");
		hm.put(45, "Dog");
		hm.put(5, "Elephant");
		hm.put(9, "Horse");
		hm.put(7, "Tiger");
		hm.put(17, null);
		System.out.println(hm.get(45));
		//hm.remove(45);
		System.out.println(hm.get(45));
		System.out.println(hm.containsKey(3));
		System.out.println(hm.isEmpty());
		System.out.println(hm.keySet());
		System.out.println(hm.replace(0, "Giraffe"));
		System.out.println(hm.size());
		System.out.println(hm.values());		
		System.out.println(hm.entrySet());
		Set st = hm.entrySet();
		Iterator it = st.iterator();
		
		System.out.println("----------------------------------------------------------------------------------");
		while(it.hasNext())
		{
			System.out.println(it.next());
//			Map.Entry mp = (Map.Entry)it.next();
//			System.out.println(mp.getKey());
//			System.out.println(mp.getValue());
		}
		
		System.out.println("***************************************************************************************");
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(0, "Lion");
		ht.put(2, "Fox");
		ht.put(45, "Dog");
		ht.put(5, "Elephant");
		ht.put(9, "Horse");
		ht.put(7, "Tiger");
	
		System.out.println(ht.get(45));
		//hm.remove(45);
		System.out.println(ht.get(45));
		System.out.println(ht.containsKey(3));
		System.out.println(ht.isEmpty());
		System.out.println(ht.keySet());
		System.out.println(ht.replace(0, "Giraffe"));
		System.out.println(ht.size());
		System.out.println(ht.values());		
		System.out.println(ht.entrySet());
		
		Enumeration<String> e = ht.elements();
		
		System.out.println("----------------------------------------------------------------------------------");
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
//			Map.Entry mp = (Map.Entry)it.next();
//			System.out.println(mp.getKey());
//			System.out.println(mp.getValue());
		}
		

		
			


		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
