interface B1 {
	int I = 10;
	void m1();
	static void m2(){
		System.out.println("m2()");
	}
	default void m3(){
		System.out.println("m3()");
	}
}
interface B2 {
	int J = 20;
	void m11();
}
interface B3 extends B1, B2 {
	void m111();
}

class BChild implements B3 {
    public void m1(){
		System.out.println("B의 m1()");
	}
	public void m11(){
		System.out.println("B의 m11()");
	}
	public void m111(){
		System.out.println("B의 m111()");
	}
}

class B {
	public static void main(String args[]) {
		BChild bc = new BChild();
		B1 b1 = bc;
		b1.m1();

		B2 b2 = bc;
		b2.m11();

		B3 b3 = bc;
		b3.m1();
		b3.m11();
		b3.m111();

		System.out.println("< 질문: 추상메소드의 이외의 자원 사용 >");
		System.out.println("B3.I: " + B3.I);
		B1.m2();
		b3.m3();
	}
}