class F 
{
	String[] items = {"수영", "영화", "만화책", "여행"};
	String[][] itemss = {items, {"스타스레프트", "롤"}};

	void m1(){
		for(int i=0; i<items.length; i++){
			System.out.println("items["+i+"]: " + items[i]);
		}
	}
	void m2(){ //Array with Enhanced Loop
		int i = 0;
		for(String item: items){
			System.out.println("items["+ i +"]: " + item);
			i++;
		}
	}
    void m3(){
		for(String[] items: itemss){
			for(String item: items){
				System.out.println("item: " + item);
			}
		}
	}
	public static void main(String args[]) 
	{
		F f = new F();
		//f.m1();
		//f.m2();
		f.m3();
	}
}
