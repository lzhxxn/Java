package aa.cc;

import aa.bb.A;

class AUser extends A {
	AUser(){
		super(); //new A(): ������ ���� 
	}
	void use(){
		System.out.println("i: " + i); //������� 
		m(); //�޼ҵ� ���� 
	}
	public static void main(String args[]){
		new AUser().use();
	}
}
