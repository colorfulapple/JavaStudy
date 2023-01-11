package 백준문제풀이;

import java.util.Scanner;

public class number1009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int scCount = sc.nextInt();
		int[][] arr = new int[scCount][2];
		int[] arr2 = new int[scCount];
		int[] number = new int[scCount];
		
		for (int i = 0; i<scCount; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
			
			
			arr2[i]=(int) Math.pow(arr[i][0], arr[i][1]);
		
			
			number[i] = arr2[i] - (arr2[i]/10) *10;
		}
		
		
		
		
		for (int i = 0; i<scCount; i++) {
			System.out.println(number[i]);
		}
	}
	
}
