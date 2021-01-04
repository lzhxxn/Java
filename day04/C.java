class C 
{
	void m1(){
		if(false) 
			System.out.println("1"); 

		System.out.println("2");
	}
	void m2(){
		boolean b = false;
		int i = 10;
		if(b){
			if(i==10){
				System.out.println("1"); 
			}else{
				System.out.println("2"); 
			}
		}else{
			if(i==10){
				System.out.println("3"); 
			}else{
				System.out.println("4"); 			
			}
		}
	}
	public static void main(String[] args) 
	{
		new C().m2();
	}
}
