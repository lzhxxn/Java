class G {
	//String items[]; //(1)����
	//String items[] = new String[4]; //(1+2) ���� �� ���� 
	String items[] = {"��", "����", "����", "�ܿ�"}; //(1+2+3) ���� �� ���� �� �ʱ�ȭ 
	G(){
		//items = new String[4]; //(2)����(ũ�Ⱑ 4���� �����) 
	}
	void in(){ 
		//items[0] = "��"; //(3)�ʱ�ȭ 
		//items[1] = "����";
		//items[2] = "����";
		//items[3] = "�ܿ�";
	}
	void out(){
		for(int i=0; i<4; i++){
			System.out.println("items["+i+"]: " + items[i]); //(4)���
		}
	}
	public static void main(String args[]) 
	{
		G g = new G();
		g.in();
		g.out();
	}
}
