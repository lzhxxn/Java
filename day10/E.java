abstract class E {
	//abstract int i;
	//abstract E();
    abstract void m1(); //�������̵�
	void m2(){
		System.out.println("m2()");
	}
}
class EChild extends E {
	void m1(){
		System.out.println("m1()");
	}
}

class EUser
{
	public static void main(String args[]){
		//EŬ������ ��ü�� �����Ͻÿ� ( �˻��ص� ���� )
		E e = new EChild();
        e.m1();
		e.m2();
	}
}
