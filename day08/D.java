class D 
{
	int sum(int a, int b){ //���� ĸ��ȭ �� 
		return a + b;
	}

	String target = "�� ���Ⱑ ���ܿ� ���� ������ ������ ���� ���� �帮������";
	void use(){ //���� ĸ��ȭ 
		String[] words = target.split(" ");
		for(String word: words){
			System.out.println(word);
		}
	}
}
class CapMgr //�� 
{
	public static void main(String[] args) {
		D d = new D();
		int s = d.sum(100, 200);
		System.out.println("��: " + s);

		d.use();
	}
}
