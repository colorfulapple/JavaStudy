package 백준문제풀이;

import java.util.Scanner;

public class number2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		if (min<45) {
			hour --;
			min = 60 - (45 - min);
			
			if (hour<0) {
				hour = 23;
			}
		} else {
			min = min - 45;
		}
		
		System.out.println(hour + " " + min);
	}

}
