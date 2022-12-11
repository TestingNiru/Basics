
public class palidrome {

	public static void main(String[] args) {
	ispalidrome(344);

	}
   public static void ispalidrome(int num) {
	   int r=0;
	   int sum=0;
	   int t;
	   t=num;
	   while(num>0) {
		   r=num%10;
		   sum=sum*10+r;
		   num=num/10;
	   }
	   if(t==sum) {
		   System.out.println( sum + " "+ "is palidrome");
	   }
	   else {
		   System.out.println(  sum+" "+"is not palidrome"); 
	   }
	   
   }
   
}
