package javaprgms;

public class Array {

	public static void main(String[] args) {
	String str[][]=new String[3][5];
	str[0][0]="A";
	str[0][1]="B";
	str[0][2]="C";
	str[0][3]="D";
	str[0][4]="E";
	str[1][0]="F";
	str[1][1]="G";
	str[1][2]="H";
	str[1][3]="I";
	str[1][4]="J";
	str[2][0]="K";
	str[2][1]="L";
	str[2][2]="M";
	str[2][3]="N";
	str[2][4]="O";
	for(int row=0;row<str.length;row++) {
		for(int clmn=0;clmn<str[0].length;clmn++) {
			System.out.println(str[row][clmn]);
		}
	}
	
	
	}

}
