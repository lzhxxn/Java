class A {
	class AInner1 {
		int j1 = 2;
		void m1(){
			System.out.println("AInner1 m1()");
		}
	}
	static class AInner2{
		int j2 = 3;
		void m2(){
			System.out.println("AInner2 m2()");
		}
		public static void main(String args[]){
			A.AInner2 in2 = new A.AInner2();
			System.out.println("in2.j2: " + in2.j2);
			in2.m2();
		}
	}

	public static void main(String args[]){
		A.AInner1 in1 = new A().new AInner1();
		System.out.println("in1.j1: " + in1.j1);
		in1.m1();
		System.out.println();

        A.AInner2 in2 = new A.AInner2();
		System.out.println("in2.j2: " + in2.j2);
		in2.m2();
	}
}


class AUser { //제 3클래스 
	public static void main(String args[]){
		A.AInner1 in1 = new A().new AInner1();
		System.out.println("in1.j1: " + in1.j1);
		in1.m1();
		System.out.println();

        A.AInner2 in2 = new A.AInner2();
		System.out.println("in2.j2: " + in2.j2);
		in2.m2();
	}
}
