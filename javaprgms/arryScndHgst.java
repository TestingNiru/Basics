package javaprgms;

public class arryScndHgst {

	public static void main(String[] args) {
Integer intary[]= {100,300,200,500,400,450};
int n=intary.length;
int Highest=Integer.MIN_VALUE;
int secondHighest=Integer.MIN_VALUE;
for(int i=0;i<n;i++) {
	if(intary[i]>Highest) {
		secondHighest=Highest;
		Highest=intary[i];
	}
	if(intary[i]<Highest && intary[i]>secondHighest) {
		secondHighest=intary[i];
				}
}
System.out.println(secondHighest);



	}

}
