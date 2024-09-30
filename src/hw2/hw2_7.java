package hw2;

public class hw2_7 {


	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 6; i++) {
			for (j = 1; j <=i; j = j + 1) { 
				System.out.print((char) (64+i));			}
			System.out.println();
		}
	}
		
}