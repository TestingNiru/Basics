package javaprgms;

public class AmstrongNum {

	public static void main(String[] args) {
double cube=0;
int num=153;
int r;
int t;
t=num;

 while(num!=0){
	r=num%10;
	num=num/10;
	cube=cube+Math.pow(r, 3);
}
 if(t==cube) {
 System.out.println("num is a amstrong");}
 else {
	 System.out.println("num is not a amstrong");
 }
	}

}
