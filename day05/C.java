class C {
	C(){
		/*
		System.out.println("2 * 1 = " + (2*1));
		System.out.println("2 * 2 = " + (2*2));
		System.out.println("2 * 3 = " + (2*3));
		System.out.println("2 * 4 = " + (2*4));
		System.out.println("2 * 5 = " + (2*5));
		System.out.println("2 * 6 = " + (2*6));
		System.out.println("2 * 7 = " + (2*7));
		System.out.println("2 * 8 = " + (2*8));
		System.out.println("2 * 9 = " + (2*9));
		*/
	}
	void m1(){ //2단 
		for(int i=1; i<=9; i++) 
			System.out.println("2 * "+i+" = " + (2*i)); 
	}
	void m2(){ //구구단
		for(int j=2; j<=9; j++){
			for(int i=1; i<=9; i++) 
				System.out.println(j+" * "+i+" = " + (j*i));
			System.out.println();
		}
	}
	void m3(){ //구구구단  2*1*1=2, 2*1*2=4, ... 9*9*9=729
		for(int k=2; k<=9; k++){
			for(int j=1; j<=9; j++){
				for(int i=1; i<=9; i++) 
					System.out.println(k+" * "+j+" * "+i+" = " + (k*j*i));
				System.out.println();
			}
		}
	}
	void m4(){//구구구구단 2*1*1*1=2, 2*1*1*2=4, ... 9*9*9*9=6,561
		for(int m=2; m<=9; m++){
			for(int k=2; k<=9; k++){
				for(int j=1; j<=9; j++){
					for(int i=1; i<=9; i++) 
						System.out.println(m+" * "+k+" * "+j+" * "+i+" = " + (m*k*j*i));
					System.out.println();
				}
			}
		}
	}
	void m5(){ //m4()를 while문으로 바꾸시오
		int m=2;
		while(m<=9){
			int k=2; 
			while(k<=9){
				int j=1; 
				while(j<=9){
					int i=1; 
					while(i<=9){ 
						System.out.println(m+" * "+k+" * "+j+" * "+i+" = " + (m*k*j*i));
						i++;
					}
					System.out.println();
					j++;
				}
				k++;
			}
			m++;
		}	
	}
	public static void main(String[] args){
		C c = new C();
		//c.m1();
		//c.m2();
		//c.m3();
		//c.m4();
		c.m5();
	}
}
