package aa.cc;

import aa.bb.A;
import aa.bb.AChild;

class AUser
{
	public static void main(String[] args) 
	{
		System.out.println("A.I: " + A.I); //멤버 
		A.m2(); //static 메소드 접근 

		A a = new AChild();
		a.m1();
		a.m3();
        System.out.println("a.I: " + a.I);
		//a.m2(); //static 메소드 접근 불가
	}
}
