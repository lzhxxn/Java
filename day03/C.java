class C 
{
	final int i = 100;

	void m(){
		System.out.println("i: " + i); //¸â¹ö, °´¼Ò, »ó¼ö, ±âº» 
		//i = 200;//¾ÈµÊ!
	}
	public static void main(String[] args) 
	{
		C c = new C();
		c.m();
	}
}
