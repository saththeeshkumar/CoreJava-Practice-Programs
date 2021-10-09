package simpleprograms;

public class Print_1_3_4_8_15_27___ {

	public static void main(String[] args) {
		Print_1_3_4_8_15_27___ obj = new Print_1_3_4_8_15_27___();
		obj.printabove();
	}

	void printabove() {
		int f_no = 1;
		int s_no = 3;
		int t_no = 4;
		System.out.print(f_no + " " + s_no + " " + t_no + " ");
		while (true) {
			int ans = f_no + s_no + t_no;
			System.out.print(ans + " ");
			f_no = s_no;
			s_no = t_no;
			t_no = ans;
			if (t_no >= 27) { // ------> choice
				break;
			}
		}
	}
}
