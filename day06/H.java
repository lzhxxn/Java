class H 
{
	int is[] = new int[3];
	void out(){
		for(int i=0; i<3; i++){
			System.out.println("is["+i+"]: " + is[i]); 
		}
	}
	public static void main(String[] args) 
	{
		H h = new H();
		h.out();
	}
}
