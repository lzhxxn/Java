class E  //�Ź���1���� 50�� ������ ���� �β�? (��, 100���� 1cm) 
{
	void m1(){
		long r = 1L;
		for(int i=0; i<50; i++){
             r = r * 2;
		}
		System.out.println("���1: " + r);
		System.out.println("�β�1: " + r/(100*100*1000) + "km");
	}
	void m2(){
		double r = Math.pow(2,50); 
        System.out.println("���2: " + r);
		System.out.println("�β�2: " + r/(100*100*1000) + "km");
	}
	public static void main(String[] args) 
	{
		E e = new E();
        e.m1();
		e.m2();
	} 
}

