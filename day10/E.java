abstract class E {
	//abstract int i;
	//abstract E();
    abstract void m1(); //오버라이딩
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
		//E클래스의 객체를 생성하시오 ( 검색해도 좋음 )
		E e = new EChild();
        e.m1();
		e.m2();
	}
}
