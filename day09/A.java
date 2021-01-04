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
		A a = new AChild(); //자동형변환
		a.m("반계탕", 5000);
	}
}
