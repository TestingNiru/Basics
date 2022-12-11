package Com.PlaywithNumbers;

public class reverseString {

	public static void main(String[] args) {
	String s="Selenium";
	String rev="";
	int l=s.length();
	for(int i=l-1;i>=0;i--) {
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
	
	
	String s1="java";
	StringBuffer sf=new StringBuffer(s1);
	
	System.out.println(sf.reverse());
	
	}}


