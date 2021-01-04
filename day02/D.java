class D //(1)클래스 
{
	String name; //(5)속성==멤버변수==Field  
    D(){ //(3)생성자 
	}
	void m(){ //(4)메소드
	}
}

class DUser{
	public static void main(String[] args) {
		new D(); //(2)객체
		System.out.println("객체 생성 완료");
	}
}




