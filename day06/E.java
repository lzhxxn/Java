class E 
{
	E(){
		m1();
		//
		System.out.println("E()�� ����������");
	}
	void m1(){
		for(int i=0; i<5; i++){
            if(i == 2) return;
			System.out.println("i: " + i);
		}
		System.out.println("for���� ��");
	}
	public static void main(String[] args) 
	{
		E e = new E();
		System.out.println("main()�� ����������");
		//return;
	}
}
