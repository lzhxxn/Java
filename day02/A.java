package aa.bb; //패키지 선언 

import java.lang.*; //임포트 구문 
//import java.util.*;

class A { //클래스 선언 
	String shape; //멤버변수(Member)1 선언 
	String name; //멤버변수(Member)2 선언 

	A(){ //생성자(Constructor)1
		shape = "귀여운"; //초기화 
		name= "소담"; //초기화 
	}
	A(String name, String shape){ //생성자(Constructor)2
		this.name = name;
		this.shape = shape;
	}
	void go(){ //메소드(Method)
		System.out.print("간다");
	}
}


class AUser
{
	public static void main(String[] args) { 
		//A a1 = new A(); //생성자 호출
		A a2 = new A("진희", "세련된"); //생성자 호출
		System.out.print(a2.shape + " "+a2.name+"이가 "); //멤버변수 호출 
		a2.go(); //메소드 호출
	}
}
