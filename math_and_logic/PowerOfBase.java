

public class PowerOfBase {

	public static long pow(int b, int e) {
		if (e == 0) {
			return 1;
		} else {
			return b * pow(b, e - 1);                //5*pow(5,[3-1])
		}
	}

	public static void main(String[] args) {

		int base = 5; // base = b = 5
		int exponent = 3;// exponent = e = 3
		long result = pow(base, exponent); // FACTORIAL VALUES STORED IN result
		System.out.println("RESULT : " + result);

	}
}
