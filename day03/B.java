class B 
{
	B(){
		String addr = "�����";
		System.out.println("B() addr: " + addr);
	}
	void m1(int i){
	    System.out.println("m1() i: " + i);
	}
    void m2(){
		//System.out.println("m2() i: " + i); //�ȵ�!
	}

	public static void main(String[] args) 
	{
		B b = new B();
		b.m1(10);
		b.m2();
	}
}
