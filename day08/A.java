import java.lang.Object;

class Human extends Object {
	String name = "홍길동";
	//Human(){} //default생성자 
	Human(String name){
		//super();
		this.name = name;
	}
	void move(){
		System.out.println("걷는다");
	}
}
class Superman extends Human {
	int power = 100;
	Superman(){
		super("클락1"); //new Human(String name)
		power =200;
	}
    Superman(String name, int power){
		super(name); //new Human(String name)
		this.power = power;
	}
	void shotLaserBeam(){
		System.out.println("광성을 쏜다");
	}
	void move(){ //오버 라이딩
		System.out.println("난다");
	}
}
class Pepsiman extends Human {
	int speed = 120;
	Pepsiman(){
		super("펩시맨");
	}
	void move(){ //오버 라이딩
		System.out.println("달린다");
	}
}

class Manager {
    public static void main(String args[]){
		/*Human h = new Human("이순신");
		System.out.println("h.name: " + h.name);
		h.move();
		System.out.println();*/

		Superman sm = new Superman("클락2", 200);
		System.out.println("sm.name: " + sm.name);
		sm.move();
		System.out.println("sm.power: " + sm.power);
		sm.shotLaserBeam();
        System.out.println(); 

        Human man = sm; //자동형변환 ( by JVM ) 
		//.....
		Superman sman = (Superman)man; //강제형변환 ( by 개발자 )
        System.out.println("sman.name: " + sman.name);
		sman.move();
		System.out.println("sman.power: " + sman.power);
		sman.shotLaserBeam();
        System.out.println(); 

		//Pepsiman pman = (Pepsiman)man; //(잘못된) 강제형변환 ( by 개발자 ): 컴파일O, 실행X
		//Pepsiman pman = (Pepsiman)sm; //(잘못된) 시도(by 개발자): 컴파일X, 실행X
	}
}
