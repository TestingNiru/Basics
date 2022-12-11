package javaprgms;

public class reverseNum {

	public static void reverseNumber(int num) {
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("reverse number is"+":"+rev);
	}
	public static void main(String[] args) {
		reverseNumber(12345);

	}

}
