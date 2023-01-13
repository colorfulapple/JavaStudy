package 백준문제풀이;

import java.util.Scanner;

public class number1009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int scCount = sc.nextInt();
		int[][] arr = new int[scCount][2];
		int[] arr2 = new int[scCount];
		int num = 1;
		
		for (int i = 0; i<scCount; i++) {
			
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
			
			
			for(int j = 0; j<arr[i][1]; j++ ) {
				num = num * arr[i][0];
				num = num - (num/10)*10;
			}
			
			arr2[i] = num;
	
		}
		
		for (int i = 0; i<scCount; i++) {
			System.out.println(arr2[i]);
		}
	}
	
}
