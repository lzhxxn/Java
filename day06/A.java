class A {
	void m1(){
		for(int i=0; i<5; i++){
			if(i != 2){ 
				System.out.println("i1: " + i);
				//System.out.println("i1: " + i);
			}
		}
	}
	void m2(){
		for(int i=0; i<5; i++){
			if(i == 2) continue; 
			System.out.println("i2: " + i);
			//System.out.println("i2: " + i);
		}
	}
	void m3(){
		abc:
		for(int j=0; j<3; j++){
			for(int i=0; i<3; i++){
				if(i==1) continue abc;
				System.out.println("j: " + j + ", i: " + i);
			}//1
			System.out.println("첫번재 루프밖");
		}//2
		System.out.println("두번째 루프밖");
	}
	public static void main(String[] args) {
		A a = new A();
		//a.m1();
		//a.m2();
		a.m3();
	}
}
