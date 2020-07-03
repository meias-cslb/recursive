package recursive;

public class TriangleNumber {
	public static void main(String[] args) {
		String line = "------------------------------------------------------------------------------------------";

		int triangle100 = calculate(100);
		System.out.println("【復習】for文を使って1～nまでの数を足し算する関数: " + triangle100);
		System.out.println(" calculate(100) = 1 + 2 + 3 + 4 + 5 ... + 99 + 100 = 5050");
		System.out.println(line);

		int triangle = calculate2(100);
		System.out.println("【復習】for文を使って1～nまでの数を足し算する関数(再帰呼び出し): " + triangle);
		System.out.println(" calculate2(100) = calculate2(99) + 100");
		System.out.println("                = [calculate2(98) + 99] + 100");
		System.out.println("                = [calculate2(97) + 98] + 99 + 100");
		System.out.println("                = ...");
		System.out.println("                = [calculate2(2) + 3] + 4 + 5 ... + 99 + 100");
		System.out.println("                = [calculate2(1) + 2] + 3 + 4 + 5 ... + 99 + 100");
		System.out.println("                = 1 + 2 + 3 + 4 + 5 ... + 99 + 100 = 5050");
		System.out.println(line);

	}


	public static int calculate(int n) {
		int total = 0;

		for(int i = 1; i <= n; i++) {
			total += i;
		}

		return total;
	}


	public static int calculate2(int n) {
		int sum = 0;

		if(n == 1) {
			sum = 1;
		} else {
			sum = calculate2(n - 1) + n;
		}

		return sum;
	}

}
