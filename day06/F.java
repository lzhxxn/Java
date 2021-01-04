class F 
{
	void m1(){ //1) 산술 ex) +, -, *, /, % 
	   int i = 10;
	   int r = i%3;
	   System.out.println("r: " + r);
	}
	void m2(){ //2) 증감 ex) ++, --
       int i=0;
	   int j=i++ + 1;
	   System.out.println("i: "+ i + ", j: "+j);
	}
	void m3(){//4) 산술대입 ex) +=, -=, *=, /=, %=
	   int i = 5; 
	   i %= 2;
	   System.out.println("i: " + i);
	}
	void m4(){//5) 비트 ex) &, |, ^, ~, 시프트(<<,>>,>>>)
       int i = 2&3;  
	   System.out.println("i: " + i);
	}
	void m5(){ //6) 비교 ex) ==, !=, <, >, <=, >=
		int i = 10;
		int j = 10;
		if(i<=j){
			System.out.println("참"); 
		}
	}
	void m6(){ //7) 논리 ex) &(고지), &&(약삭), |(고지), ||(약삭)
		//boolean b = true;
		int i = 1;
		int j = 0;
        boolean flag = i>j || i>++j;
        System.out.println("flag: " + flag + ", j: " + j); 
	} 
	void m7(){ //8) 논리대입 ex) &=, |=
        boolean b = true;
		b &= false;
        System.out.println("b: " + b);
	}
	void m8(){ //9) 조건 ex) A? B:C
		int i=(1==0)? 100:200;
		System.out.println("i: " + i); 
	}
	void m88(){
		int i = 0; 
		if(i==0){
			i = 100;
		}else{
			i = 200;
		}
		System.out.println("i: " + i); 
	}
	void m9(){ //10) instanceof ex) 객체 instanceof 클래스
        Object obj = new String("김치");
		if(obj instanceof String){
			String str = (String)obj;
			System.out.println("사용: " + str);
		}
	}
	public static void main(String[] args) 
	{
		F f = new F();
		//f.m1();
		//f.m2();
		//f.m3();
		//f.m4();
		//f.m5();
		//f.m6();
		//f.m7();
		//f.m8();
		//f.m88();
		f.m9();
	}
}


	   //3) 대입 ex) = 