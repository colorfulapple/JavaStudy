package 백준문제풀이;

import java.util.Scanner;

public class number2753 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		year(year);

	}
	public static void year(int yea) {
		if ((yea % 4 == 0 && yea % 100 != 0) || yea % 400 == 0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
}
