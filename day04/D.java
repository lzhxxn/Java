class D 
{
	void m1(){
		int i = 15;
		switch(i){
			case 5: System.out.println("5"); break;
            case 10: System.out.println("10"); break;
			case 15:
				System.out.println("15-1"); 
				System.out.println("15-2");
				break;
			default: System.out.println("5 or 10 or 15 가 아니다"); break;
		}
        System.out.println("switch블럭 밖");
	}
	void m2(){
		String str = "바보";
        switch(str){
			case "천재": System.out.println("나"); break;
			case "바보": System.out.println("너"); break;
		}
	}
	void m3(){
		int i = 10;
		char c = 'B';
		switch(i){
			case 10: 
				System.out.println("10");
			    switch(c){
					case 'A': System.out.println("A"); break;
					case 'B': 
						System.out.println("B"); 
					    if(true){
							System.out.println("참");
						}
						break;
				} 
				break;
			case 20: 
				System.out.println("20"); 
			    break;
			default: 
				System.out.println("no (20 or 10)"); 
		}
	}
	public static void main(String[] args) 
	{
		D d = new D();
		//d.m1();
		//d.m2();
		d.m3();
	}
}
