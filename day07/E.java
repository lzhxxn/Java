class E //AutoBoxing ( JDK 5.0 ~ ) 
{
	int i = 1;

	void m1(){ //BoxingÀ» »ç¿ëX
		Integer iObj = new Integer(i); //int -> Integer
        int val = iObj.intValue(); //Integer -> int 
		System.out.println(val + 1);
	}
	void m2(){
		Integer iObj = i; //AutoBoxing: int -> Integer
        int val = iObj; //UnBoxing: Integer ->int  
		System.out.println(val + 1);
	}
	public static void main(String[] args) 
	{
		E e = new E();
		//e.m1();
		e.m2();
	}
}
