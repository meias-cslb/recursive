package recursive;

public class Fact {
	public static void main(String[] args) {
		int answer = fact(10);

		System.out.println("【演習】fact(n) = 1 * 2 * 3 * ... * (n-1) * n");
		System.out.println("fact(10) = " + answer);
		System.out.println("fact(10) = fact(9) * 10");
		System.out.println("         = [fact(8) * 9] * 10");
		System.out.println("         = [fact(7) * 8] * 9 * 10");
		System.out.println("         = ...");
		System.out.println("         = [fact(2) * 3] * 4 * 5 * .. * 9 * 10");
		System.out.println("         = [fact(1) * 2] * 3 * 4 * .... * 9 * 10");
		System.out.println("         = 1 * 2 * 3 * ... + 9 + 10 = 3628800");

	}

	public static int fact(int n) {
		int totalFact = 0;

		if(n == 1) {
			totalFact = 1;
		} else {
			totalFact = fact(n-1) * n;
		}

		return totalFact;
	}
}
