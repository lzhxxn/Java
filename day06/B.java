class B 
{
	void m1(){
		for(int i=0; i<5; i++){
			if(i>=2) break;
			System.out.println("i: " + i);
		}
		System.out.println("루프밖");
	}
	void m2(){
		aa:
		for(int j=0; j<3; j++){
			for(int i=0; i<3; i++){
				if(i>=1) break aa;
				System.out.println("j: " + j + ", i: " + i);
			}//1
			System.out.println("첫번째 루프밖");
		}//2
		System.out.println("두번째 루프밖");
	}
	public static void main(String[] args) 
	{
		B b = new B();
		//b.m1();
		b.m2();
	}
}
