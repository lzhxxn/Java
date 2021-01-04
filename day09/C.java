class C 
{
	int i;
	String str = "±æµ¿";

    C(){
		CUser user = new CUser(this); //3
		user.use();
	}
	C(int i){
		this.i = i; //1
	}
	C(int i, String str){
		this(i); //2
		this.str = str;
	}
	void m(){
		System.out.println("CÀÇ m()");
	}
	public static void main(String[] args) {
		new C();
	}
}
class CUser {
	C c;
	CUser(C c){
		this.c = c;
	}
	void use(){
		System.out.println("c.i: " + c.i);
		System.out.println("c.str: " + c.str);
        c.m();
	}
}
