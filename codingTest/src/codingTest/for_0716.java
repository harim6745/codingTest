package codingTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
 
public class for_0716 {
 
	public static void main(String[] args) throws IOException {
 
		int[][] a = new int[3][4];
		for (int i = 0; i < 3; i++) {
			for (int j = 3; j >= 0; j--) {
				a[i][j] = i+j;
				System.out.printf("%d ", a[i][j]);
			}
			System.out.println();
		}
 
	}
}