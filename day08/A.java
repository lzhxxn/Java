import java.lang.Object;

class Human extends Object {
	String name = "ȫ�浿";
	//Human(){} //default������ 
	Human(String name){
		//super();
		this.name = name;
	}
	void move(){
		System.out.println("�ȴ´�");
	}
}
class Superman extends Human {
	int power = 100;
	Superman(){
		super("Ŭ��1"); //new Human(String name)
		power =200;
	}
    Superman(String name, int power){
		super(name); //new Human(String name)
		this.power = power;
	}
	void shotLaserBeam(){
		System.out.println("������ ���");
	}
	void move(){ //���� ���̵�
		System.out.println("����");
	}
}
class Pepsiman extends Human {
	int speed = 120;
	Pepsiman(){
		super("��ø�");
	}
	void move(){ //���� ���̵�
		System.out.println("�޸���");
	}
}

class Manager {
    public static void main(String args[]){
		/*Human h = new Human("�̼���");
		System.out.println("h.name: " + h.name);
		h.move();
		System.out.println();*/

		Superman sm = new Superman("Ŭ��2", 200);
		System.out.println("sm.name: " + sm.name);
		sm.move();
		System.out.println("sm.power: " + sm.power);
		sm.shotLaserBeam();
        System.out.println(); 

        Human man = sm; //�ڵ�����ȯ ( by JVM ) 
		//.....
		Superman sman = (Superman)man; //��������ȯ ( by ������ )
        System.out.println("sman.name: " + sman.name);
		sman.move();
		System.out.println("sman.power: " + sman.power);
		sman.shotLaserBeam();
        System.out.println(); 

		//Pepsiman pman = (Pepsiman)man; //(�߸���) ��������ȯ ( by ������ ): ������O, ����X
		//Pepsiman pman = (Pepsiman)sm; //(�߸���) �õ�(by ������): ������X, ����X
	}
}
