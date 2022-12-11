package javaprgms;

public class secndLwst {

	public static void main(String[] args) {
		Integer intary[]= {100,300,200,500,400,150};
		int n=intary.length;
		int Highest=Integer.MAX_VALUE;
		int secondHighest=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(intary[i]<Highest) {
				secondHighest=Highest;
				Highest=intary[i];
			}
			if(intary[i]>Highest && intary[i]<secondHighest) {
				secondHighest=intary[i];
						}
		}
		System.out.println(secondHighest);



			}


	}


