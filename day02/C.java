class C {
	C(){
		System.out.println("C()-1");
		m1();
		System.out.println("C()-2");
	}
	void m1(){
		System.out.println("m1()-1");
		m2();
		System.out.println("m1()-2");
	}
	void m2(){
		System.out.println("m2()-1");
	}
	public static void main(String[] args) {
		System.out.println("main()-1");
		new C().m2();
		System.out.println("main()-2");
	}
}
