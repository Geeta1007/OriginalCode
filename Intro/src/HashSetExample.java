import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Black");
		hs.add("Lilac");
		hs.add("Violet");
		hs.add("Violet");
		hs.add("White");
		hs.add("Blue");
		hs.add("Orange");
		hs.add("Purple");
		
		System.out.println(hs);
		//hs.clear();
		System.out.println(hs.contains("Lilac"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.remove("Red"));
		System.out.println(hs);
		System.out.println(hs.size());		
		
		Iterator<String> i = hs.iterator();
//		System.out.println(i.next());
//		System.out.println(i.next());
//		System.out.println(i.next());
		
		System.out.println("-------------------------------------------------------------------------------------------");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
