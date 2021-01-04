class F 
{
	short s = 10;
	long lo = 20L;
	void m1(){ 
		long r1 = s + lo; //자동 형변환( short -> long ) 
		System.out.println("r1: " + r1);
	}

	int i = 30;
	void m2(){
		int r2 = i + (int)lo; //강제 형변환 ( long -> int )
		System.out.println("r2: " + r2);
    }
	public static void main(String[] args) 
	{
		F f = new F();
		//f.m1();
		f.m2();
	}
}
