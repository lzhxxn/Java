package aa.cc;

import aa.bb.A;

class AUser extends A {
	AUser(){
		super(); //new A(): 생성자 접근 
	}
	void use(){
		System.out.println("i: " + i); //멤버접근 
		m(); //메소드 접근 
	}
	public static void main(String args[]){
		new AUser().use();
	}
}
