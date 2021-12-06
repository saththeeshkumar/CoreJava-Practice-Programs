package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapHashMap {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		  hm.put("Tamil I", 9);
		  hm.put("Tamil II", 9);
		  hm.put("English I", 9);
		  hm.put("English II", 9);
		  hm.put("Mathematics", 2);
		  hm.put("Science", 2);
		  hm.put("Social Science", 2);
		  
		  System.out.println(hm);
		  
		  Set s = hm.keySet();
		  System.out.println(s);
		  
		  Collection c= hm.values();
		  System.out.println(c);
		    
		  Set s1 = hm.entrySet();
		  Iterator i = s1.iterator(); 
		  boolean b = i.hasNext();
		  /*while(b==true) {
			  System.out.println(i.next());
			  b=i.hasNext();
		  }*/
		  while(b==true)
		  {
		    Object o = i.next(); 
		    Map.Entry entry = (Map.Entry) o; 
		    //System.out.println(entry.getKey() + "starts at "+ entry.getValue());
		    Object o2 = entry.getKey();
		    String st1 = (String) o2; 
		    if(st1.equals("Mathematics"))
		    {
		      System.out.println("yes, starts at "+entry.getValue());
		    }    
		    //System.out.println(i.next());
		    b = i.hasNext();
		  }

	}

}
