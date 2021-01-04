class B {
	void m1(){ //1~100 ÇÕ : cf) int sum = 101 * 50; 
		int sum = 0;
		for(int i=1; i<=100; i++){
			sum = sum + i;
		}
		System.out.println("sum: " + sum);
	}
	void m2(){ //1~100 Â¦¼öÇÕ °ú È¦¼öÇÕ
		int jjSum = 0;
		int holSum = 0;
		for(int i=1; i<=100; i++){
			if(i%2==1){
				jjSum += i;
			}else{
				holSum += i;
			}
		}
		System.out.println("jjSum: " + jjSum + ", holSum: " + holSum  
			+ ", totalSum: " + (jjSum + holSum));
	}
	public static void main(String[] args) {
		B b = new B();
		//b.m1();
		b.m2();
	}
}
