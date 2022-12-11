package Com.PlaywithNumbers;

import java.util.HashSet;

public class duplicateWords {

	public static void main(String[] args) {
	String str="java is my prgm fav java prgm";
	String [] words=str.split(" ");
		
	for(int i=0;i<words.length;i++) {
		for(int j=i+1;j<words.length;j++)
			if (words[i].equals(words[j])){
				System.out.println(words[i]);
				
			}
		}
	
				}
				
				}
		
	
		
	
				
			
	

	


