package simpleprograms;

import java.util.HashSet;
import java.util.Set;

public class RepeatedCHar {

	public static void main(String args[]) {
		String name="janakiraman";
		String temp="";
		char m[]=name.toCharArray();
		
		for(int i=0;i<=m.length-1;i++) {
			for(int j=i+1;j<=m.length-1;j++) {
				if(m[i]==m[j]) {
					if(!temp.contains(String.valueOf(m[i])))
					temp=temp+m[i];
						
					
				}
			}
		}
		System.out.println(temp);
	}
	
}
