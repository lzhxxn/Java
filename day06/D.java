class D 
{
	D(){
		System.out.println("D(): 1");
		m1();
		System.out.println("D(): 2");
		//return;
	}
	void m1(){
		System.out.println("m1(): 1");
		m2();
		System.out.println("m1(): 2");
		//return;
	}
	int m2(){
        System.out.println("m2()");
		return -1;
	}
	public static void main(String[] args) 
	{
		System.out.println("main(): 1");
		D d = new D();
		System.out.println("main(): 2");
		//return;
	}
}
