package trickyNumberQuestions;

public class PallindromeNumberCheck {

	public void isPallindromNumber(int num) {
		int temp = num;
		int rem =0, rev=0;
		while(num>0) {
		rem = num%10;
		rev = (rev*10)+rem;
		num= num/10;
		}
		if(temp== rev) {
			System.out.println("Entered number is Palindrome");
		}
		else {
			System.out.println("Entered number is non Palindrome");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PallindromeNumberCheck pald = new PallindromeNumberCheck();
		pald.isPallindromNumber(121);
	}

}
