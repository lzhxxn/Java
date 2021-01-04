class D {
	String name;
	D(String name){
		this.name = name;
	}
	void sleep(){
		System.out.println("D sleep()");
	}
	void sleep(int i){
		System.out.println("D sleep() i:"+i);
	}
}
class DChlid extends D{
	String name;
	DChlid(){
		super("진희"); //1
	}
	void m(){
		System.out.println("this.name: " + this.name);
		System.out.println("super.name: " + super.name); //2 
		this.sleep();
		super.sleep();//3
	}
	void sleep(){ //오버라이딩 
		System.out.println("DChlid sleep()");
	}
}

class DUser{
	public static void main(String[] args) {
		DChlid dc = new DChlid();
		dc.m();
	}
}

