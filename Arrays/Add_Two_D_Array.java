package Array;

public class Add_Two_D_Array {
int[][] a= {{3,4},{2,1}};
int[][] b= {{1,5},{3,7}};
int[][] c=new int[2][2];
	public static void main(String[] args) {
		Add_Two_D_Array obj = new Add_Two_D_Array();
		obj.add();

	}

	private void add() {
		for(int r=0;r<c.length;r++) {
			for(int i=0;i<c[r].length;i++) {
				c[r][i]=a[r][i]+b[r][i];
			}
		}
		System.out.println("Result Array");
		for(int r=0;r<c.length;r++) {
			for(int i=0;i<c[r].length;i++) {
			System.out.print(c[r][i]+" ");
			}
			System.out.println();
		}
	}

}
