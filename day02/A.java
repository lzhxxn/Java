package aa.bb; //��Ű�� ���� 

import java.lang.*; //����Ʈ ���� 
//import java.util.*;

class A { //Ŭ���� ���� 
	String shape; //�������(Member)1 ���� 
	String name; //�������(Member)2 ���� 

	A(){ //������(Constructor)1
		shape = "�Ϳ���"; //�ʱ�ȭ 
		name= "�Ҵ�"; //�ʱ�ȭ 
	}
	A(String name, String shape){ //������(Constructor)2
		this.name = name;
		this.shape = shape;
	}
	void go(){ //�޼ҵ�(Method)
		System.out.print("����");
	}
}


class AUser
{
	public static void main(String[] args) { 
		//A a1 = new A(); //������ ȣ��
		A a2 = new A("����", "���õ�"); //������ ȣ��
		System.out.print(a2.shape + " "+a2.name+"�̰� "); //������� ȣ�� 
		a2.go(); //�޼ҵ� ȣ��
	}
}
