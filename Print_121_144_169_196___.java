package simpleprograms;

public class Print_121_144_169_196___ {

	public static void main(String[] args) {
		Print_121_144_169_196___ obj = new Print_121_144_169_196___();
		obj.printabove();
	}

	void printabove() {
		int i = 11;
		while (true) {
			System.out.print((i * i) + " ");
			i++;
			if ((i * i) > 196) {   //    ------>  choice
				break;
			}
		}

	}

}
