package codingTest;

import java.util.Scanner;

public class for_0720 {

	public static void main(String[] args) {
		
//		//2741
//		Scanner sc = new Scanner(System.in);
//		
//		int n;
//		
//		System.out.println("n : ");		
//		n = sc.nextInt();
//		
//		for ( int i = 1; i <= n; i++) {
//			System.out.println(i);
//			
//		}
//		
//		//2742
//		Scanner sc = new Scanner(System.in);
//		
//		int n;
//		
//		System.out.println("n : ");		
//		n = sc.nextInt();
//		
//		for ( int i = n; i >= 1; i--) {
//			System.out.println(i);
//			
//		}
		
		//11021
		Scanner sc = new Scanner(System.in);
		
		int A, B, T;
		T = sc.nextInt();
		
		for (int i = 1; i <= T; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			
			System.out.println("Case #" + i + ": " + (A+B));
		}
		

	}
}
