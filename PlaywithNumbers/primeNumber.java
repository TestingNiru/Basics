package Com.PlaywithNumbers;

public class primeNumber {
	public static boolean isPrimeNumber(int num) {
		if(num==1) 
		return false;
		
		for(int i=2;i<num;i++) {
			if(num%i==0) { 
				return false;}}
		
		return true;
		
	}
	public static void getPrimes(int num) {
		int c=0;
		for(int i=1;i<=num;i++) {
			if(isPrimeNumber(i))
				System.out.println(i+" ");
			c++;
		}
		System.out.println("no of primes= "+c);
	}

	public static void main(String[] args) {
		System.out.println(isPrimeNumber(12));
		getPrimes(11);
		

	}

}
