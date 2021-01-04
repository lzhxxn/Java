class B 
{
	void m1(){
		int i = 10;
		int j = 20;
		//boolean b = i<j;
		if(i<j){
			System.out.println("참");
		}else{
			System.out.println("거짓");
		}
	}
    void m2(){
        int i = 0;
		if(i<0){
            System.out.println("음수");
		}else if(i>0){
            System.out.println("양수");
		}else{
            System.out.println("0"); 
		}
	}
	public static void main(String[] args) 
	{
		B b = new B();
		//b.m1();
		b.m2();
	}
}
