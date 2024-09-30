package hw2;

public class hw2_class_practice {
	//for + while loop
//	public static void main(String[] args) {
//		int i ;
//		for (i=1; i <= 9; i++) {
//			int j = 1 ;
//			while (j <= 9) {
//				System.out.print(i + "*" + j + "=" + i*j + "\t");
//				j++;
//				}
//			System.out.println();
//			}				
//		}
	
	//for + do while loop
//	public static void main(String[] args) {
//		int i ;
//		for (i=1; i <= 9; i++) {
//			int j = 1 ;
//			do {
//				System.out.print(i + "*" + j + "=" + i*j + "\t");
//				j++;
//			}while (j <= 9);
//			System.out.println();
//			}				
//		}
	
	//while + do while loop
	public static void main(String[] args){
		int i = 1;
		while (i <= 9) {		
			int j = 1;	
			do {System.out.print(i +"*"+ j +"="+ i*j + "\t");
			j++;
			} 
			while (j <= 9);
			i++;
			System.out.println();
		}
	}
}
