class B 
{
	B(){
		System.out.println("B()");
	}
	B(String name){
		System.out.println("B() name: " + name);
	}
	B(int age){
		System.out.println("B() age: " + age);
	}
	B(String name, int age){
		System.out.println("B() name: " + name + ", age: " + age);
	}

	void m(){
	}
	void m(String str){
	}
	public int m(int i){ //�����ε�
		System.out.println("m() i: " + i);
		return i;
	}
	void m(byte b){ //�����ε�
		System.out.println("m() b: " + b);
	}
	void m(int i, String str){
	}
}
class BChild extends B {
	void m(String str, int i){//�����ε� 
	}
}

class BUser{
	public static void main(String[] args) {
		BChild bc = new BChild();
		
		byte b = 10;
        bc.m(b);
	}
}
