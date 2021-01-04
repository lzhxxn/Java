class G {
	//String items[]; //(1)선언
	//String items[] = new String[4]; //(1+2) 선언 및 생성 
	String items[] = {"봄", "여름", "가을", "겨울"}; //(1+2+3) 선언 및 생성 및 초기화 
	G(){
		//items = new String[4]; //(2)생성(크기가 4개인 저장소) 
	}
	void in(){ 
		//items[0] = "봄"; //(3)초기화 
		//items[1] = "여름";
		//items[2] = "가을";
		//items[3] = "겨울";
	}
	void out(){
		for(int i=0; i<4; i++){
			System.out.println("items["+i+"]: " + items[i]); //(4)사용
		}
	}
	public static void main(String args[]) 
	{
		G g = new G();
		g.in();
		g.out();
	}
}
