class I 
{
	byte b = 10;
	short s = 20;
	char c = 30;
	int i = 40;
	float f = 50.123f;

	int is[] = {b, s, c, i, (int)f};
	void out(){
		for(int i=0; i<is.length; i++){
			System.out.println("is["+i+"]: " + is[i]); 
		}
	}
	public static void main(String[] args) 
	{
		I i = new I();
		i.out();
	}
}