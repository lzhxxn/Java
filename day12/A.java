package aa.bb;

public interface A {
	int I = 10;
	void m1();
	static void m2(){
		System.out.println("m2()");
	}
	default void m3(){
		System.out.println("m3()");
	}
}


