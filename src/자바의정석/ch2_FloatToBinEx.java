package 자바의정석;

public class ch2_FloatToBinEx {

	public static void main(String[] args) {
		float f = 9.1234567f;
		int i = Float.floatToIntBits(f);
		
		System.out.printf("%f%n", f);
		System.out.printf("%X%n", i);
		
	}

}
