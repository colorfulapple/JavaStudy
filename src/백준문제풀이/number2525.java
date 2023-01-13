package 백준문제풀이;

import java.util.Scanner;

public class number2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int oven = sc.nextInt();
		
		min = min + oven;
		hour = hour + min/60;
		if (min > 59) {
			min = min - (min/60)*60;
				if (hour>23) {
					hour = hour - 24;
				}
		}

		System.out.println(hour + " " + min);

		}
}