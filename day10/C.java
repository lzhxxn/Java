class C {
	static int i;
	int j;

	public static void main(String[] args) 
	{
		C c1 = new C();
		c1.i++;
		c1.j++;
		System.out.println("c1.i: "+c1.i + ", c1.j: " + c1.j);

		C c2 = new C();
		c2.i++;
		c2.j++;
		System.out.println("c2.i: "+c2.i + ", c2.j: " + c2.j);
	}
}
