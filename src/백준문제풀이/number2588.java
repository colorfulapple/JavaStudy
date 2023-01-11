package 백준문제풀이;

import java.util.Scanner;

public class number2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fir = sc.nextInt();
		int sec = sc.nextInt();
		
		int hun = sec/100;
		int ten = sec/10 - hun*10;
		int one = sec - hun*100 - ten*10;

		int three = fir*one;
		int four = fir*ten;
		int five = fir*hun;
		
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);
		System.out.println(three + four*10 + five*100); 
	}

}
