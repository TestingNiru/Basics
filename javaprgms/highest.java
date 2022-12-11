package javaprgms;

public class highest {

	public static void main(String[] args) {
		int [] nums= {100,435,987,1234};
		int Highest=Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>Highest) {
				Highest=nums[i];
			}
		}
System.out.println(Highest);
	}

}
