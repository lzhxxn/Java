class A 
{
    void m1(){ //�Ż�
        int i=3;//��
		
		while(i<3){ //�� 
            System.out.println("while : " + i);
			i++;//����
		}
	}
	void m2(){ //��
		int i=3;//��
		do{
			System.out.println("do while : " + i);
			i++;//����
		}while(i<3); //�� 
	}
	void m3(){ //�Ż� 
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
