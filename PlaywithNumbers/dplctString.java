package Com.PlaywithNumbers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class dplctString {

	public static void main(String[] args) {
	
String str[]= {"java","python","python"};
Set<String> st=new HashSet<String>();
for(String s:str) {
	if(st.add(s)==false) {
		System.out.println(s);
	}
}

	
	}}


