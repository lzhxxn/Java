class A 
{
	String name = "ȫ�浿"; //��ü�Ҽ� 
	static String nick = "�ޱ�"; //Ŭ�����Ҽ� 
	A(){
		System.out.println("A() name: " + name);
	}
	void m(){
		System.out.println("m() name: " + name);
	}
}
class AUser
{
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		a1.m();
		System.out.println("main() name: " + a1.name);

		System.out.println("main() nick: " + A.nick);
		System.out.println("main() nick: " + a1.nick);
		System.out.println("main() nick: " + a2.nick);
	}
}
