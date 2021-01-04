class E 
{
	E(){
		m1();
		//
		System.out.println("E()의 마지막라인");
	}
	void m1(){
		for(int i=0; i<5; i++){
            if(i == 2) return;
			System.out.println("i: " + i);
		}
		System.out.println("for루프 밖");
	}
	public static void main(String[] args) 
	{
		E e = new E();
		System.out.println("main()의 마지막라인");
		//return;
	}
}
