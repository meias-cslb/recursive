package recursive;

public class Pascal {

	public static void main(String[] args) {
		int answer = combination(47,3);
		System.out.println("47都道府県から3つ選ぶ組み合わせは【" + answer + "通り】");
		breakdown();

	}

	public static int combination(int m, int n) {
		int answer = 0;

		if(n == 0) {
			answer = 1;
		} else if(n == m) {
			answer = 1;
		} else {
			answer = combination(m - 1, n - 1) + combination(m - 1, n);
		}

		return answer;

	}


	public static void breakdown() {
		System.out.println("--------------------------------------------------------------------------------------------------------------------------");

		System.out.println("combination(47,3)");
		System.out.println("     = combination(47 - 1, 3 - 1) + combination(47 - 1, 3)");
		System.out.println("     = combination(46, 2) + combination(46, 3)");
		System.out.println("     = (combination(46 - 1, 2 - 1) + combination(46 - 1, 2)) + (combination(46 - 1, 3 - 1) + combination(46 - 1, 3))");
		System.out.println("     = (combination(45, 1) + combination(45, 2)) + (combination(45, 2) + combination(45, 3))");
	}

}
