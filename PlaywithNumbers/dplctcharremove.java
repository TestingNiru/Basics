package Com.PlaywithNumbers;

public class dplctcharremove {

	public static void main(String[] args) {
  String s="abbbccgdddeehhh";
  String s1="";
  for(int i=0;i<s.length()-1;i++) {
	  if(s.charAt(i)!=s.charAt(i+1)) {
		  s1=s1+s.charAt(i);
	  }
  }
  s1=s1+s.charAt(s.length()-1);
  System.out.println(s1);
	}

}
