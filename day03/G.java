class G 
{
	byte b = 10;
	short s = 20;
	//char c = 'A';
	
	void m(){
		//int i = b + c;
		//System.out.println("i: " + (char)i);

		int i = b + s;
		System.out.println("i: " + i);
	}
	public static void main(String[] args) 
	{
		new G().m();
	}
}
