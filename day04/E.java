class E 
{
	void m1(){
		int i = 0; //�ʱ�� 

		while(true){ //���ǽ� 
			System.out.println("i: " + i);
			i++; //������
		}
		 
		//System.out.println("�ݺ���(loop) ����");
	}
	public static void main(String[] args) 
	{
		
		E e = new E();
		e.m1();
	}
}
