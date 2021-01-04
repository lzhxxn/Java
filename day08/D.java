class D 
{
	int sum(int a, int b){ //내가 캡슐화 함 
		return a + b;
	}

	String target = "나 보기가 엮겨워 가실 때에는 말없이 고이 보내 드리오리다";
	void use(){ //남이 캡슐화 
		String[] words = target.split(" ");
		for(String word: words){
			System.out.println(word);
		}
	}
}
class CapMgr //남 
{
	public static void main(String[] args) {
		D d = new D();
		int s = d.sum(100, 200);
		System.out.println("합: " + s);

		d.use();
	}
}
