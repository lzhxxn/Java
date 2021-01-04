class A {
	A(){
		System.out.println("2");
		this.m1();
        System.out.println("6");
	}
	void m1(){
		System.out.println("3");
		this.m2();
		System.out.println("5");
	}
	void m2(){
		System.out.println("4");
	}
	public static void main(String[] args) {
		System.out.println("1");
		new A();
        System.out.println("7");
	}
}
