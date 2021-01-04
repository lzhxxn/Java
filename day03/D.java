class D 
{
	byte b = 127;
	void m(){
		b++;
        System.out.println("b: " + b); 
	}
	public static void main(String[] args) 
	{
		D d = new D();
		d.m();
	}
}
