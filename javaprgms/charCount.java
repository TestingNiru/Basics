package javaprgms;

import java.util.HashMap;
import java.util.Map;

public class charCount {
	public static void occur5rence(String name) {
		Map<Character,Integer> charmap=new HashMap<Character,Integer>();
		char names[]=name.toCharArray();
		for(char c:names) {
			if(charmap.containsKey(c)) {
				charmap.put(c, charmap.get(c)+1);
			}
			else {
				charmap.put(c, 1);
			}}
			System.out.println(name+":"+charmap);
		}
	

	public static void main(String[] args) {
		occur5rence("java" );

	}

}
