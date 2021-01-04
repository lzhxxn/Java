class C {
	void m1(String lunch, int price){
		bb:
		switch(lunch){
			case "짬뽕":
				System.out.println("난 짬뽕이 좋아");
			    break;
			case "탕수육":
				System.out.println("난 탕수육이 좋아");
			    switch (price){
					case 10000: System.out.println("1만원");  break;
					case 15000: System.out.println("1.5만원"); break bb;
					default: System.out.println("1만원과 1.5만원이 아님"); 
			    }
				System.out.println("1: 첫번째 스위치 블럭 밖");
				break;
			default: 
				System.out.println("난 짬뽕도 탕수육도 싫어");
		}
		System.out.println("2: 두번째 스위치 블럭 밖");
	}
	public static void main(String[] args) {
		C c = new C();
		c.m1("탕수육", 15000);
	}
}
