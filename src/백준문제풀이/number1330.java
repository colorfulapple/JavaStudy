package 백준문제풀이;

import java.util.Scanner;

public class number1330 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 < num2) {
			System.out.printf("<%n");
		} else if (num1 > num2) {
			System.out.printf(">%n");
		} else {
			System.out.printf("==");
		}

	}

}
