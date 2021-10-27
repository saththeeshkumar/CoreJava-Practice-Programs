package simpleprograms;

public class FindANo {

	public static void main(String[] args) {
		String name = "Sathi7h1";

		/*char k[]=name.toCharArray();
		for(int i=0;i<=k.length-1;i++) {
			if(k[i]>='a'&&k[i]<='z'||k[i]>='A'&&k[i]<='Z') {
				
			}else {
				System.out.println(k[i]);
			}
		}*/
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
        // System.out.println(c);
			if (c >= '0' && c <= '9') {
				System.out.println(c);
char i1=97;
System.out.println(i1);
			}
		}

	}

}
