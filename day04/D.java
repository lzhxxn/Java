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
			default: System.out.println("5 or 10 or 15 �� �ƴϴ�"); break;
		}
        System.out.println("switch�� ��");
	}
	void m2(){
		String str = "�ٺ�";
        switch(str){
			case "õ��": System.out.println("��"); break;
			case "�ٺ�": System.out.println("��"); break;
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
							System.out.println("��");
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
