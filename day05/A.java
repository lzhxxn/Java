class A 
{
    void m1(){ //신사
        int i=3;//초
		
		while(i<3){ //조 
            System.out.println("while : " + i);
			i++;//증감
		}
	}
	void m2(){ //조
		int i=3;//초
		do{
			System.out.println("do while : " + i);
			i++;//증감
		}while(i<3); //조 
	}
	void m3(){ //신사 
		for(int i=0; i<3; i++){
			System.out.println("for : " + i);
		}
	}
	public static void main(String[] args) {
		A a = new A();
		//a.m1();
		//a.m2();
		a.m3();
	}
}
