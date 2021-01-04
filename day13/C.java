class C 
{
	C() throws MyException, YourException{
		test();
	}
	void test() throws MyException, YourException {
		B b = null;

		b = new B(); //MyException
		b.use1(); //YourException
		//b.use2(); //Exception
	}
	public static void main(String[] args) {
		try{
			C c= new C();
		}catch(MyException me){
			me.m1();
		}catch(YourException ye){
			ye.m2();
		}
	}
}
