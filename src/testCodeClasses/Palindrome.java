package testCodeClasses;

public class Palindrome {

	public boolean isPalindrome(String string) {
		String rev = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			rev = rev + string.charAt(i);
		}
		if (rev.equals(string)) {
			System.out.println("Is a Palindrom");
			return true;
		} else {
			System.out.println("Is not a Palindrom");
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome palindrome = new Palindrome();
		palindrome.isPalindrome("malayalam");
		palindrome.isPalindrome("Mam");

	}

}
