package Com.PlaywithNumbers;

public class stringManipultion {
	
	
	public static void main(String[] args) {
	String s="I love javaa";
	String s1="I love Javaa";
	System.out.println(s.length());
System.out.println(s.charAt(8));
System.out.println(s.indexOf('a'));
System.out.println(s.indexOf('a',s.indexOf('a')+1));
//how to compare string
System.out.println(s.equals(s1));
System.out.println(s.equalsIgnoreCase(s1));
System.out.println(s.substring(0, 6));
System.out.println(s.replace(" ", ""));

System.out.println(s.concat("s"));


}

	}



