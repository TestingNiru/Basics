package javaprgms;

public class rvrsString {

	public static void main(String[] args) {
	String s1="Hi this is monday";
	String rev="";
	String[] str=s1.split(" ");
	
for(int i=str.length-1;i>=0;i--) {
	str[i]=rev+str[i];
	
System.out.print(" "+str[i]);
	}

}}
