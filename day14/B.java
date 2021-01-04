class B {
    private int i=1;  
    private void m(){
		System.out.println("B m()");
	}
    private static int ii = 11;
	private static void mm(){
		System.out.println("B mm()");
	}

	static class BInner{
		int j=2;
		void m1(){
			System.out.println("BInner m1()");
		}
		void use(){
			//System.out.println("i: " + i);
			System.out.println("ii: " + ii);
			//m();
			mm();
		}
	}
}
/*class BChild extends B{
	void use(){
		System.out.println("i: " + i);
		m();
	}
}*/

class BUser{
	public static void main(String[] args) {
		//B.BInner in = new B().new BInner();
		//System.out.println("in.j: " + in.j);
		//in.m1();

		B.BInner in = new B.BInner();
		in.use();
	}
}
