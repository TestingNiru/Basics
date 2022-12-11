package Com.PlaywithNumbers;

public class Factors {

	public static void main(String[] args) {
	int num=24;
	int count =0;
	for(int i=1;i<=num;i++) {
		if (num%i==0) {
			System.out.print(i);
			count++;
		}
			

	}	System.out.println(" ");
	
	System.out.println(count);
}}
