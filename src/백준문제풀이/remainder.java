package 백준문제풀이;

import java.util.Scanner;

public class remainder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fir = sc.nextInt();
		int sec = sc.nextInt();
		int thi = sc.nextInt();
		
		System.out.println((fir+sec)%thi);
		System.out.println(((fir%thi)+(sec%thi))%thi);
		System.out.println((fir*sec)%thi);
		System.out.println(((fir%thi)*(sec%thi))%thi);
	}

}
