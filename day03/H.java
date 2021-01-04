class H 
{
	byte b;
	short s;
	char c;
	int i;
	long lo;
	float f;
	double d;
	boolean flag;
	String str;

    void m(){
		System.out.println("b: " + b);
		System.out.println("s: " + s);
		System.out.println("c: " + (int)c);
		System.out.println("i: " + i);
		System.out.println("lo: " + lo);
		System.out.println("f: " + f);
		System.out.println("d: " + d);
		System.out.println("flag: " + flag);
		System.out.println("str: " + str);
	}
	public static void main(String[] args) 
	{
		new H().m();
	}
}
