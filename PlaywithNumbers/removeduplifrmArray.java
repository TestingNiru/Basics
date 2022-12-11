package Com.PlaywithNumbers;

import java.util.HashSet;

public class removeduplifrmArray {

	public static void main(String[] args) {
int [] intary= {1,2,3,4,3,4,7,8,2,4,5};

HashSet<Integer>hs=new HashSet<Integer>();
for(int i:intary) {
	hs.add(i);
	
}
for(int k:hs) {
	System.out.println(k);
}
	}

}
