// public > protected > default > private 
class A {
	void m(String str, int i){
		System.out.println("A m()");
	}
}
class AChild extends A {
	void m(String menu, int price){
		System.out.println("AChild m()");
	}
}

class AUser{
	public static void main(String[] args) {
		A a = new AChild(); //�ڵ�����ȯ
		a.m("�ݰ���", 5000);
	}
}
