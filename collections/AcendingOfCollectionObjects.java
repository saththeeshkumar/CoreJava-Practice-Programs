package collections;

import java.util.ArrayList;
import java.util.Collections;

public class AcendingOfCollectionObjects implements Comparable{
         int i;
	public AcendingOfCollectionObjects(int i) {
		this.i = i;
	}

	public static void main(String[] args) {
		ArrayList al =new ArrayList();
		AcendingOfCollectionObjects g1 = new AcendingOfCollectionObjects(10);
		AcendingOfCollectionObjects g2 = new AcendingOfCollectionObjects(200);
		AcendingOfCollectionObjects g3 = new AcendingOfCollectionObjects(30);
		AcendingOfCollectionObjects g4 = new AcendingOfCollectionObjects(40);
        al.add(g1);
        al.add(g2);
        al.add(g3);
        al.add(g4);
        Collections.sort(al);
        System.out.println(al);
        
	}
	public String toString()
	{
		return this.i+"";
	}

	@Override
	public int compareTo(Object o1) {
		AcendingOfCollectionObjects g = (AcendingOfCollectionObjects)o1;
		if(this.i>g.i)
			return +567;
		else if(this.i<g.i)
			return -567;
		return 0;
	}
}
