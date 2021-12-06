package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapHashMap2 {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("Tamil I", 9);
		hm.put("Tamil II", 9);
		hm.put("English I", 9);
		hm.put("English II", 9);
		hm.put("Mathematics", 2);
		hm.put("Science", 2);
		hm.put("Social Science", 2);

		Set s = hm.entrySet();
		Iterator i = s.iterator();
		boolean b = i.hasNext();
		while (b == true) {
			Object o = i.next();
			/*
			 * String st = (String)o; if(st.charAt(0)=='S') {
			 * System.out.println("Exams Start with S are "+st ); } else
			 * if(st.charAt(0)=='s') { System.out.println("Exams Start with s are "+st ); }
			 */
			Map.Entry entry = (Map.Entry) o;
			Object o2 = entry.getKey();
			String st = (String) o2;
		    if((st.charAt(st.length()-1)=='I')&&(st.charAt(st.length()-2)!='I')) {
						System.out.println("Timings For "+ entry.getKey()+" First Paper are "+entry.getValue());
					}
			if (st.charAt(0) == 'S') {
				System.out.println("Exams Start with S are " + st);
			} 
			else if (st.charAt(st.length()-1) == 's') {
				System.out.println("Exams Start with s are " + st);
			}
		
              b=i.hasNext();
		}

	}
	
}
