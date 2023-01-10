package 백준문제풀이;
import java.util.Scanner;
public class multiplicationTables {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 1; i < 10; i++) {
			int mul = num * i;
			System.out.println(num + " * " + i + " = " + mul);
		}
	}
}
