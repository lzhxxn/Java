class MyException extends Exception {
	void m1(){
		System.out.println("예외 처리를 도와주는 메소드1");
	}
}
class YourException extends RuntimeException {
	void m2(){
		System.out.println("예외 처리를 도와주는 메소드2");
	}
}

class B{
	boolean flag = false;
	B() throws MyException {
		if(flag){
			throw new MyException();
		}
	}
	/*
	void use0() throws MyException {
		if(flag){
			throw new MyException();
		}
	}*/
	void use1() throws YourException {
		throw new YourException();
	}
	void use2() throws Exception {
		throw new Exception();
	}
}
class BUser{
	void test1(){
		B b = null;
		try{
			b = new B(); //MyException 
			//b.use1(); //YourException 
		}catch(MyException me){
			me.m1();
		}catch(YourException ye){
			ye.m2();
		}
	}
	void test2(){
		B b = null;
		try{
			b = new B(); //MyException
			b.use2(); //Exception
		}catch(MyException me){
			me.m1();
		}catch(Exception e){
			System.out.println("우재파이팅: "+e.toString());
		} 
	}
	public static void main(String args[])  {
		BUser bu = new BUser();
		//bu.test1();
		bu.test2();
	}
}
