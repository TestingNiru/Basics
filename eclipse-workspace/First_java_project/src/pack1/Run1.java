package pack1;

public class Run1 {

	public static void main(String[] args) {
		int m=59;
		System.out.println(prime(m));
		
	}
public static boolean prime(int n) {
	int c=0;
	int i;
	for(i=1;i<n;i++) {
		if(n%i==0)
			c++;
	}
	if (c==2) {
			return true;}
	else {
		return false;
	}
	
}
	}


