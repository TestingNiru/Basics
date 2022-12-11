package javaprgms;

import java.util.HashSet;
import java.util.Set;

public class duplicateElement {

	public static void main(String[] args) {
		String names[]= {"java","python","javascript","c#","java","c#"};
		Set<String> hs=new HashSet<String>();
		for(String n:names) {
			if(hs.add(n)==false) {
				System.out.println(n);
			}
		}
		

	}

}
