class Figure{ //부모
	void draw(){
		System.out.println("도형을 그린다");
	}
}
class Rect extends Figure {
	void draw(){ //Overriding 
		System.out.println("사각형을 그린다");
	}
} 
class Circle extends Figure {
	void draw(){ //Overriding
		System.out.println("원형을 그린다");
	}
}
class Triangle extends Figure {
	void draw(){ //Overriding
		System.out.println("삼각형을 그린다");
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
