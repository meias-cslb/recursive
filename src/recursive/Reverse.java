package recursive;

public class Reverse {

	public static void main(String[] args) {

		String string = "abcde";
		String reversed = reverse(string);
		System.out.println("【復習】文字列を反転する abcde → " + reversed);
		System.out.println(" reverse(\"abcde\") = reverse(\"bcde\") + \"a\"");
		System.out.println("                  = [reverse(\"cde\") + \"b\"] + \"a\"");
		System.out.println("                  = [reverse(\"de\") + \"c\"] + \"ba\"");
		System.out.println("                  = [reverse(\"e\") + \"d\"] + \"cba\"");
		System.out.println("                  = \"e\" + \"dcba\"");

	}

	public static String reverse(String string) {
		String reversed = null;

		if(string.length() <= 1) {
			reversed = string;
		} else {
			String head = string.substring(0, 1);
			String body = string.substring(1);
			reversed = reverse(body) + head;
		}

		return reversed;
	}

}
