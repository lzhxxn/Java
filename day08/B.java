class Figure{ //�θ�
	void draw(){
		System.out.println("������ �׸���");
	}
}
class Rect extends Figure {
	void draw(){ //Overriding 
		System.out.println("�簢���� �׸���");
	}
} 
class Circle extends Figure {
	void draw(){ //Overriding
		System.out.println("������ �׸���");
	}
}
class Triangle extends Figure {
	void draw(){ //Overriding
		System.out.println("�ﰢ���� �׸���");
	}
}

class FigureMgr{
	public static void main(String[] args) {
		Figure f1 = new Rect();
		Figure f2 = new Circle();
		Figure f3 = new Triangle();
		f1.draw();
		f2.draw();
		f3.draw();
	}
}
