class B {
	static int i;
    static void m(){
		System.out.println("m() i: " + i);
	}
}
class BUser
{
	public static void main(String[] args) {
		System.out.println("main() i: " + B.i);
		B.m();

		B b = new B();
		System.out.println("main() i: " + b.i);
		b.m();
	}
}


