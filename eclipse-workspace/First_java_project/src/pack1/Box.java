package pack1;

public class Box {
	int height;
	int width;
	int length;
	int weight;
	Box(){
		System.out.println("without dimension");}
    Box(int h,int w,int l){
			height=h;
			width=w;
			length=l;
		} 
    Box(int h,int w,int l,int we){
    	this(h,w,l);
    	weight=we;
    	
    	
	}
    Box(Box b){
    	
    }
	
void print() {
	System.out.println("height="+height);
	System.out.println("width="+width);
	System.out.println("length="+length);
	System.out.println("weight="+weight);
}
}
