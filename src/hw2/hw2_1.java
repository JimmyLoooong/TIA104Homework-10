package hw2;

public class hw2_1 {
	
	public static void main(String[] args) {
		int i = 1,sum=0;
		while (2*i <= 1000) {
			sum = sum+(2*i);
			i++;
		}
		System.out.println(sum);	
	}
}
