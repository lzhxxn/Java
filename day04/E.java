class E 
{
	void m1(){
		int i = 0; //초기식 

		while(true){ //조건식 
			System.out.println("i: " + i);
			i++; //증감식
		}
		 
		//System.out.println("반복블럭(loop) 나옴");
	}
	public static void main(String[] args) 
	{
		
		E e = new E();
		e.m1();
	}
}
