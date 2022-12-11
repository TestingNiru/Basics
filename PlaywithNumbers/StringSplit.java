package Com.PlaywithNumbers;

public class StringSplit {

	public static void main(String[] args) {
String s="hello_world_test_selenium";
String str[]=s.split("_");

for(int i=0;i<str.length;i++) {
	System.out.print(str[i]);
}

	}

}
