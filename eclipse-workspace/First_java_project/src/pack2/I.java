package pack2;

public interface I {
	void test1();
	void test2();

}
  class C implements I{
	public void test1() {
		 System.out.println("test1 of c");
	 }
	public void test2() {
		System.out.println("test2 of c");
	}
}
