class C 
{
	final int i = 100;

	void m(){
		System.out.println("i: " + i); //���, ����, ���, �⺻ 
		//i = 200;//�ȵ�!
	}
	public static void main(String[] args) 
	{
		C c = new C();
		c.m();
	}
}
